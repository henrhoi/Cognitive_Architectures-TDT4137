import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.max;


/**
 * Performs Mamdani Reasoning
 *
 * @author Henrik Høiness
 */

public class MamdaniReasoning {

    /** ENUMS **/
    private enum Values {DISTANCE, DELTA}

    private enum Distances {VERYSMALL, SMALL, PERFECT, BIG, VERYBIG}

    private enum Deltas {SHRINKINGFAST, SHRINKING, STABLE, GROWING, GROWINGFAST}

    private enum Actions {BRAKEHARD, SLOWDOWN, NONE, SPEEDUP, FLOORIT}

    private final Double clip;


    private MamdaniReasoning() {
        this.clip = 1.0;
    }


    /**
     * Calculates the next action with Mamdani reasoning
     *
     * @param distance: {Double} Distance
     * @param delta:    {Double} Delta
     * @return {@link Actions} Next action determined by distance and delta
     */
    private Actions calculateNextAction(Double distance, Double delta) {
        HashMap<Actions, Double> evaluations = this.evaluateRules(distance, delta);
        List<Double> aggregation = this.aggregateRuleOutputs(evaluations);
        Double crispOutput = this.defuzzification(aggregation);
        return this.classifyCrispOutput(crispOutput);
    }


    /**
     * Calculates membership of a position in a certain {Values}-type and {Distance | Deltas}-Value name
     *
     * @param valueType: Type of value {@link Values}
     * @param valueName: Name of value {@link Distances} | {@link Deltas}
     * @param position:  Position value
     * @exception IllegalArgumentException On input error.
     * @return {Double} Membership in value-graph
     */
    private Double calculateMembership(Values valueType, Object valueName, double position) {
        if (valueType == Values.DISTANCE && valueName instanceof Distances) {
            switch ((Distances) valueName) {
                case VERYSMALL:
                    return reverse_grade(position, 1, 2.5);
                case SMALL:
                    return triangle(position, 1.5, 3, 4.5);
                case PERFECT:
                    return triangle(position, 3.5, 5, 6.5);
                case BIG:
                    return triangle(position, 5.5, 7, 8.5);
                case VERYBIG:
                    return grade(position, 7.5, 9);
            }

        } else if (valueType == Values.DELTA && valueName instanceof Deltas) {
            switch ((Deltas) valueName) {
                case SHRINKINGFAST:
                    return reverse_grade(position, -4, -2.5);
                case SHRINKING:
                    return triangle(position, -3.5, -2, -0.5);
                case STABLE:
                    return triangle(position, -1.5, 0, 1.5);
                case GROWING:
                    return triangle(position, 0.5, 2, 3.5);
                case GROWINGFAST:
                    return grade(position, 2.5, 4);
            }
        }
        throw new IllegalArgumentException(String.format("Not valid arguments. Got valueType: %s and valueName: %s", valueType, valueName));
    }


    /**
     * Evaluates the rules based on fuzzificated input
     *
     * @param distance: Fuzzicated value for distance
     * @param delta:    Fuzzicated value for delta
     * @return {@link HashMap<Actions, Double>} List with tuples of {@link Actions} and rule-evaluations
     */
    private HashMap<Actions, Double> evaluateRules(double distance, double delta) {
        HashMap<Actions, Double> evaluations = new HashMap<>();

        // Rule 1: IF distance is SMALL AND delta is Growing THEN action is None
        double distance_small = calculateMembership(Values.DISTANCE, Distances.SMALL, distance);
        double delta_growing = calculateMembership(Values.DELTA, Deltas.GROWING, delta);
        Double rule1 = and(distance_small, delta_growing);
        evaluations.put(Actions.NONE, rule1);

        //Rule 2:IF distance is Small AND delta is Stable THEN action is SlowDown
        double delta_stable = calculateMembership(Values.DELTA, Deltas.STABLE, delta);
        Double rule2 = and(distance_small, delta_stable);
        evaluations.put(Actions.SLOWDOWN, rule2);

        //Rule 3: IF distance is Perfect AND delta is Growing THEN action is SpeedUp
        double distance_perfect = calculateMembership(Values.DISTANCE, Distances.PERFECT, distance);
        Double rule3 = and(distance_perfect, delta_growing);
        evaluations.put(Actions.SPEEDUP, rule3);

        //Rule 4: IF distance is VeryBig AND (delta is NOT Growing OR delta is NOT GrowingFast) THEN action is FloorIt
        double distance_verybig = calculateMembership(Values.DISTANCE, Distances.VERYBIG, distance);
        double delta_growingfast = calculateMembership(Values.DELTA, Deltas.GROWINGFAST, delta);
        Double rule4 = and(distance_verybig, or(not(delta_growing), not(delta_growingfast)));
        evaluations.put(Actions.FLOORIT, rule4);

        //Rule 5: IF distance is VerySmall THEN action is BrakeHard
        Double rule5 = calculateMembership(Values.DISTANCE, Distances.VERYSMALL, distance);
        evaluations.put(Actions.BRAKEHARD, rule5);

        return evaluations;
    }

    /**
     * Aggregates outputs for all fuzzy-rules
     *
     * @param evaluations: {@link HashMap<Actions, Double>} Evaluations of rules
     * @return List of aggregations for each value in x-axis
     */
    private List<Double> aggregateRuleOutputs(HashMap<Actions, Double> evaluations) {
        double[] BrakeHardGrade = {-10, -8.0, -5.0};
        double[] SlowDownTriangle = {-7.0, -4.0, -1.0};
        double[] NoneTriangle = {-3.0, 0.0, 3.0};
        double[] SpeedUpTriangle = {1.0, 4.0, 7.0};
        double[] FloorItGrade = {5.0, 7.0, 10.0};

        double BrakeHardEvaluation = evaluations.get(Actions.BRAKEHARD);
        double SlowDownEvaluation = evaluations.get(Actions.SLOWDOWN);
        double NoneEvaluation = evaluations.get(Actions.NONE);
        double SpeedUpEvaluation = evaluations.get(Actions.SPEEDUP);
        double FloorItEvaluation = evaluations.get(Actions.FLOORIT);

        ArrayList<Double> aggregatedRuleOutputs = new ArrayList<>();
        for (double i = BrakeHardGrade[0]; i <= FloorItGrade[2]; i++) {
            if (i <= BrakeHardGrade[2]) {
                if (i >= SlowDownTriangle[0]) {
                    aggregatedRuleOutputs.add(max(BrakeHardEvaluation, SlowDownEvaluation));
                } else {
                    aggregatedRuleOutputs.add(BrakeHardEvaluation);
                }

            } else if (i <= SlowDownTriangle[2]) {
                if (i >= NoneTriangle[0]) {
                    aggregatedRuleOutputs.add(max(SlowDownEvaluation, NoneEvaluation));
                } else {
                    aggregatedRuleOutputs.add(SlowDownEvaluation);
                }
            } else if (i <= NoneTriangle[2]) {
                if (i >= SpeedUpTriangle[0]) {
                    aggregatedRuleOutputs.add(max(NoneEvaluation, SpeedUpEvaluation));
                } else {
                    aggregatedRuleOutputs.add(NoneEvaluation);
                }
            } else if (i <= SpeedUpTriangle[2]) {
                if (i >= FloorItGrade[0]) {
                    aggregatedRuleOutputs.add(max(SpeedUpEvaluation, FloorItEvaluation));
                } else {
                    aggregatedRuleOutputs.add(SpeedUpEvaluation);
                }
            } else {
                aggregatedRuleOutputs.add(FloorItEvaluation);
            }
        }
        return aggregatedRuleOutputs;
    }

    /**
     * Defuzzication: Uses COG to calculate the crisp output value
     *
     * @param aggregatedRuleOutputs: {List<Double>} List of aggregated rule outputs
     * @return COG {Double} Calculated COG for aggregated rule outputs
     */
    private Double defuzzification(List<Double> aggregatedRuleOutputs) {
        double COGDivisor = 0.0;
        double COGDividend = 0.0;
        for (int i = 0; i < aggregatedRuleOutputs.size(); i++) {
            COGDivisor += (i - 10) * aggregatedRuleOutputs.get(i);
            COGDividend += aggregatedRuleOutputs.get(i);
        }

        return COGDivisor / COGDividend;
    }

    /**
     * Classifies crips output value as a Action in {@link Actions}
     *
     * @param output: Crisp output value for next action
     * @return Action-enum from {@link Actions}
     */
    private Actions classifyCrispOutput(Double output) {
        Double BRAKEHARD, SLOWDOWN, NONE, SPEEDUP, FLOORIT;

        BRAKEHARD = reverse_grade(output, -8.0, -5.0);
        SLOWDOWN = triangle(output, -7.0, -4.0, -1.0);
        NONE = triangle(output, -3.0, 0.0, 3.0);
        SPEEDUP = triangle(output, 1.0, 4.0, 7.0);
        FLOORIT = grade(output, 5.0, 7.0);

        Actions outputAction = Actions.BRAKEHARD;
        Double outputMembership = BRAKEHARD;

        if (outputMembership < SLOWDOWN) {
            outputAction = Actions.SLOWDOWN;
        }
        if (outputMembership < NONE) {
            outputAction = Actions.NONE;
        }
        if (outputMembership < SPEEDUP) {
            outputAction = Actions.SPEEDUP;
        }
        if (outputMembership < FLOORIT) {
            outputAction = Actions.FLOORIT;
        }

        return outputAction;
    }

    /**
     * Finds maximum value of input arguments
     *
     * @param arguments {double...} Arguments of which to find max-value
     * @return Max value in arguments
     */
    private static double and(double... arguments) {
        return Arrays.stream(arguments).min().getAsDouble();
    }

    /**
     * Finds minimum value of input arguments
     *
     * @param arguments {double...} Arguments of which to find min-value
     * @return min value in arguments
     */
    private static double or(double... arguments) {
        return Arrays.stream(arguments).max().getAsDouble();
    }

    /**
     * Negates input argument
     *
     * @param value {double} Arguments of which to negate
     * @return 1.0 - value
     */
    private static double not(double value) {
        return 1.0 - value;
    }

    /**
     * Calculates membership-value of position in triangle
     *
     * @param position: Position (x-value) to calculate membership-value
     * @param x0: Left corner of triangle
     * @param x1: Middle-value
     * @param x2: Rigth-corner of triangle
     * @return Membership-value of position
     */
    private double triangle(double position, double x0, double x1, double x2) {
        double value = 0.0;
        if (position >= x0 && position <= x1) {
            value = (position - x0) / (x1 - x0);
        } else if (position >= x1 && position <= x2) {
            value = (x2 - position) / (x1 - x0);
        }
        if (value > clip) value = this.clip;
        return value;
    }

    /**
     * Calculates membership-value of position in grade
     *
     * @param position: Position (x-value) to calculate membership-value
     * @param x0: Lower-left corner of grade
     * @param x1: Upper-right corner of grade
     * @return Membership-value of position
     */
    private double grade(double position, double x0, double x1) {
        double value;
        if (position >= x1) {
            value = 1.0;
        } else if (position <= x0) {
            value = 0.0;
        } else value = (position - x0) / (x1 - x0);

        if (value > this.clip) {
            value = this.clip;
        }
        return value;
    }

    /**
     * Calculates membership-value of position in reversed grade
     *
     * @param position: Position (x-value) to calculate membership-value
     * @param x0: Upper-left corner of reversed grade
     * @param x1: Lower-right corner of reversed grade
     * @return Membership-value of position
     */
    private double reverse_grade(double position, double x0, double x1) {
        double value;
        if (position <= x0) {
            value = 1.0;
        } else if (position >= x1) {
            value = 0.0;
        } else value = (x1 - position) / (x1 - x0);
        if (value > this.clip) {
            value = this.clip;
        }
        return value;
    }

    /**
     * Main method for performing Mamdani reasoning with the {@link MamdaniReasoning} class
     */
    public static void main(String args[]) {
        MamdaniReasoning mr = new MamdaniReasoning();
        Double distance = 3.7;
        Double delta = 1.2;
        Actions nextAction = mr.calculateNextAction(distance, delta);
        System.out.println(String.format("If distance = %s and delta = %s, the next action with Mamdani reasoning is: %s", distance, delta, nextAction));
    }
}