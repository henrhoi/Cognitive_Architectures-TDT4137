import random


class Perceptron:
	"""
	Class for representing a Perceptron in a ANN (Artificial Neutral Network)
	"""

	def __init__(self, n):
		self.weights = [random.uniform(-0.5, 0.5) for _ in range(n)]
		self.threshold = 0.2
		self.learning_rate = 0.1

		self.hyperplane = []

	def do_epoch(self, input_list, desired_output):
		"""
		Applies one epoch to the Perceptron. Activates the Perceptron,
		updates its weights, and is to be repeated until the node has converged.

		:param input_list: Input to be classified
		:param desired_output: What output the input is desired to be classified as
		:return: The epochs hyperplane
		"""
		hyperplane = []
		for i in range(len(input_list[0])):
			# Calculating hyperplane
			temp_sum = sum(input_list[j][i] * self.weights[j] for j in range(len(input_list))) - self.threshold
			hyperplane.append(step(temp_sum))
			error = desired_output[i] - hyperplane[i]

			# Updating weights
			for j in range(len(input_list)):
				weight_correction = self.get_weight_correction(input_list[j][i], error)
				self.weights[j] = self.weights[j] + weight_correction

		self.hyperplane = hyperplane
		return hyperplane

	def get_weight_correction(self, input_value, error):
		"""
		:param input_value: input_value that is going to be used in calculation
		:param error: Error from calculating hyperplane
		:return: ∆w - The weight correction computed by the delta rule
		"""
		return self.learning_rate * input_value * error


def step(x):
	"""
	Method for getting step-value of a arbitrary x-value

	:param x: value to get step-value of
	:return: 0 if x is negative, otherwise 1
	"""
	return 0 if x < 0 else 1


def converge_node(perceptron, input_list, desired_output):
	try:
		print("Weights:", perceptron.weights)
		output = perceptron.do_epoch(input_list, desired_output)
		return True if (output == desired_output) else converge_node(perceptron, input_list, desired_output)

	except RecursionError:  # Node will not converge
		return False


# Testing number of converging nodes
def main():
	print("Testing number of converging nodes")
	input_list = [[0, 0, 1, 1], [0, 1, 0, 1]]
	desired_and = [0, 0, 0, 1]
	desired_or = [0,1,1,1]

	converged = 0
	faults = 0
	for x in range(100):
		print("Trying to converge Perceptron", x, end=":\n")
		p = Perceptron(len(input_list))

		if converge_node(p, input_list, desired_and):
			converged += 1
		else:
			faults += 1

	print()
	print("Converged Perceptrons:", converged)
	print("Failed Perceptrons:", faults)


main()
