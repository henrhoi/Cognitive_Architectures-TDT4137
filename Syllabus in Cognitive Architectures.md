# Syllabus in Cognitive Architectures

## Vernon's book


### Four important aspects when modelling cognitive systems

##### The balance of pure computation and bio-inspiration is the first aspect of modelling cognitive systems

* Many powerful tools are computers and sophisticated softwares, and on the other hans psychology and neuroscience reflect our understanding of biological life-forms.
	* We need to understand how the biological system works. Need a model of the operation of the biological system. Biological systems are complex. We therefore need to choose the level of abstraction in which we study them.


##### The level of abstraction

* Can model a system with either high or low level of abstraction. 
	* The choice of abstraction level plays an important role in any attempt to model a bio-inspired cognitive system.

![](https://i.imgur.com/9YhEZEA.png)


##### The mutual dependence of brain, body and environment

* The brain and body evolved together and so you can't divorce one from the other without running the risk of missing part of the overall picture. This brain-body evolution took place in particular environmental circumstances.
* A complete picture may require to adopt a perspective that views the brain and body as a complete system that operates in a specific environmental context. 



##### The purpose of cognition and the mechanisms that fulfills the purpose of the system

* Two complementary issues: *What cognition is for, and how it is achieved*
* **Ultimate-proximate distinction**:
	* Ultimate explanations deal with questions concerned with *why* a given behavior exists.
	* Proximate explanation address the specific mechanisms, *how*, these behaviours are realized.


* To build a complete picture of cognition, we must address both explanations.


![](https://i.imgur.com/m8aMtqP.png)


#### Definition cognition

What cognition is depends on what cognition is *for* and *how* cognition is realized in physical systems - the ultimate and proximate aspects of cognition, respectively.

Cognition implies an ability to make inferences about events in the world around you. It involves predicting the future based on memories of the past, perceptions of the present and in particular anticipation of the behaviour of the world. 

The cycle of *anticipation, assimilation,* and *adaption* supports an on-going process of action and perception. 

**Definition:**

Cognition is the process by which an autonomous system perceives its environment, learns from experience, anticipates the outcome of events, acts to pursue goals, and adapts to changing circumstances. 


##### Autonomy

If a system is autonomous, its most important goal is to preserve its autonomy. Indeed, it must act to preserve it since the wold it inhabits may not be friendly. 


### Levels of abstraction

All systems can be viewed at with different levels of abstraction, successively removing specific details at higher levels and keeping just the general essence of what is important for a useful model of the system. 

* E.g. if we want to model a physical bridge, we could do so by specifying each component of the bridge, the concrete foundations, the suspension cables, etc, and how they fit together. This approach models the problem at a very low level of abstraction. We could describe the forces at work in each member of the structure and analyze them to find out if they are strong enough to bear the required loads, etc. This approach models the problem at a high level of abstraction.


**David Marr** has a three-level hierarchy of abstraction (cognitivist):

* The top level is the computational theory
* The next level is representation and algorithm
* The bottom there is the hardware implementation

![Marr](https://i.imgur.com/8HKpWHS.png)

The three levels are loosely connected, and should according to Marr think about one level, without necessarily pay attention to those below it. Thus, you can begin modelling at the computational level, moving on to representations and algorithms, and finally decide how to implement these representations and algorithms to realize the working system. 

**The levels are different levels of abstractions of the system**


**Scott Kelso** makes a way for a completely different way of modelling systems (emergent), especially non-linear dynamical types of systems that he believes may provide the true basis for cognition. 

Kelso argues that these types of systems should be modelled at three distinct levels of abstraction, but at the same time. These three levels are boundary constraint level, a collective variables level and a components level.

![Kelso](https://i.imgur.com/pVjKwcP.png)

* *Boundary constraint level:* Determines the goals of the system
* *Collective variable level:* Characterizes the behaviour of the system. 
* *Component level:* Forms the realized behaviour of the system


These levels should be specified together, and are tightly coupled and mutually dependent, according to Kelso.



### Paradigms of cognitive science

**The cognitivist, emergent and hybrid paradigms of cognition**

![](https://i.imgur.com/1cKuKUR.png)



The first attempt in cybernetics to uncover the mechanisms of cognitive behaviour were subsequently taken up and developed into an approach referred to as *cognitivism*. This approach built on the logical foundations laid by the early cyberneticians, using **symbolic information processing** as its core model of cognition.

The early cybernetics period also paved the way for a completely different approach of cognitive sci. - the emergent system approach - which recognized the importance of self-organization in cognitive processes.

In recent years, hybrid system has become popular and understandably so since, as the name suggests, it attempts to combine the best from each of the cognitivist and emergent paradigms.


#### The Cognitivist Paradigm

For cognitivist systems, cognition is represented in a particular sense: it requires the manipulation of explicit symbols. The symbols is abstract encapsulations of the information that denote the state of the world external to the cognitive agent. 

Cognitive robots can share knowledge easy, if the representational framework is the same. 

Domain knowledge describes things *in general*, in a way that isn't specific to the particular object the agent has in front of it or the actions it is currently performing. 

AI has diverged somewhat from its roots, shifting emphasis from human and artificial cognition to more practical expediency and purely computational algorithmic techniques such as machine learning.

**Allan Newell** and **Herbert Simon** present two hypotheses:

1. *The Physical Symbol System Hypothesis*: A physical symbol system has necessary and sufficient means for general intelligent action

2. *The Heuristic Search Hypothesis*: The solutions to problems are represented as symbol structures. A physical-symbol system exercises its intelligence in problem-solving by search. - Sometimes caricatured by **All AI is search**, but is unfair. The point is that a physical symbol system must indeed search for solutions to the problem.


#### The Emergent Paradigm

The view of cognition taken by emergent approaches is very different to that taken by cognitivism. The ultimate goal of an emergent cognitive system is to maintain its autonomy, and cognition is the process by which it accomplishes this. 

In fact, the goal of cognition is to make sure that the agent's autonomy is not compromised but is continually enhanced.

Emergent systems embrace the idea of the interdependence between brain, body and world, that we mentioned in the previous chapter. 

Can be sub-divided into three approaches:

* Connectionist systems:
	* Rely on parallel processing of non-symbolic distributed activation patterns in networks of relatively simple processing elements. They use statistical properties, rather than logical rules to analyze information and produce effective behaviour. 
 
* Dynamical systems
* Enactive systems


*Connectionism:* Any statement within propositional logic can be represented by a network of simple processing units, i.e. a connectionist system. Such nets have in principle, the computational power of a Universal Turing Machine, the basis for all computation. Further research have developed perceptrons, multi-layered networks, CNNs, etc. 




### The Knowledge level, as a computer system level

![](https://i.imgur.com/sRtDhbP.png)

Systems become more specialized as the hierarchy is ascended. Not every system describable as an electrical circuit is also describable as a logic unit. The relationship between the levels are somewhat transparent. 

Knowledge systems are just another level within this same hierarchy, another way of describing a system. *The knowledge level abstracts completely from the internal processing and the internal representation.* As a level it has a medium, namely, knowledge. It has a law of behaviour, if the system wants to attain goal G and knows that to do act A will lead to attaining G, then it will do A. This is the law of rationality. 

> An agent will operate in its own best interest according to what it knows.  

*A system is intelligent to the degree that it approximates a knowledge-level system.*


## Model Human Processor

The human mind is an information-processing system, and a description in at the systems level can be given. The description is approximate in the same spirit it can be given for it. 

The  Model Human Processor can be described by (1) a set of memories and processors together with (2) a set of principles, hereafter called the "principles of operation". 


Of the two parts, it is easiest to describe the memories and processors first, leaving the description of the principles of operations. 

The Model Human Processor can be divided into three interacting subsystems:

1. The perceptual system
2. The motor system
3. The cognitive system

, each with its own memories and processors.

### The principles of operation

* **P0 - Recognize-Act Cycle of the Cognitive Processor**
	* On each cycle of the Cognitive Processor, the contents of Working Memory initiate actions associatively linked to them in Long Term Memory. These actions in turn modify the contents of Working Memory. 

* **P1 - Variable Perceptual Processor Rate Principle**¨
	* The Perceptual Processor cycle time τ<sub>p</sub> varies inversely with stimulus intensity

* **P2 - Encoding Specificity Principle**
	* 	Specific encoding operations performed on what is perceived determine what is stored, and what is stored determines what retrieval cues are effective in providing access to what is stored.
	
* **P3 - Discrimination Principle**
	* The difficulty of memory retrieval is determined by the candidates that exist in the memory, relative to the retrieval clues. 

* **P4 - Variable Cognitive Processor Rate Principle**
	* The Cognitive Processor cycle time τ<sub>C</sub> is shorter when greater effort is induced by increasing task demands or information loads. It also diminishes. 

* **P5 - Fitt's Law**
	* The time T<sub>pos</sub> to move the hand to a target of size S which lies a distance D away is given by: $T_{pos} = I_M log_2 (D/S + 0.5)$, where $I_M = 100[70~120]msec$

* **P6 - Power Law of Practice**
	* The time T<sub>n</sub> to perform a task on the *n*th trial follows a power law: $T_n = T_1 n^{-\alpha}$

* **P7 - Uncertainty Principle**
	* Decision time T increases with uncertainty about the judgement or decision to be made: $T = I_C H$, where H is the entropy of the decision. For *n* equally probable alternatives $H = log_2(n + 1)$, with *n* different probabilities $H = \sum_i log_2(1/p_i + 1)$

* **P8 - Rationality Principle**
	* A person acts so as to attain his goals through rational action, given the structure of the task and his input of information and bounded by limitations on his knowledge and processing ability: *Goals + Task + Operators + Inputs + Knowledge + Process-limit $\implies$ Behaviour*
	
* **P9 - Problem Space Principle**
	* The rational activity in which people engage to solve a problem can be described in terms of (1) a set of states of knowledge, (2) operators for changing one state into another, (3) constraints on applying operators, and (4) control knowledge for deciding which operator to apply next.




#### The Perceptual System

The perceptual system carries sensations of the physical world detected by the body's sensory systems into internal representations of the mind by means of integrated sensory systems. 

![](https://i.imgur.com/Jn6WX6U.png)

>**The Model Human Processor - memories and processors**
>
> Sensory information flows into Working Memory through the Perceptual Processor. Working Memory consists of activated chunks in Long-Term Memory. The basic principle of operation of the Model Human Processor is the *Recognize-Act Cycle of the Cognitive Processor (P0)*. The Motor Processor is set in motion through activation of chunks in Working Memory.


The most important buffer memories being a Visual Image Store and an Auditory Image Store to hold the output of the sensory system while it is being symbolically coded. 

The cognitive system receives symbolically coded information from the sensory image stores in its Working Memory and uses previously stored information in Long-Term Memory to make decisions about how to respond. 

The motor system carries out the response. As an approximation, the information processing of the human will be described as if there were a separate processor for each sub system: a Perceptual Processor, a Cognitive Processor, and a Motor Processor. 

For some tasks (pressing  a key in response to a light) the human must behave as a serial processor. For other tasks (typing, reading) integrated, parallel operation of the three subsystems is possible, in the manner of three pipeline prosessors. 

The memories and processors are described by a few parameters. The most important parameters of a memory are:

* μ, the storage capacity in items
* δ, the decay time of an item, and
* κ, the main code type (physical, acoustic, visual)
* τ, the cycle time of the processor

Eye-movement = $230[70~700]msec$
> 230 msec represents a typical value, and the numbers in brackets indicate that values may range from 70 msec to 700 msec.

##### Perceptual memories

Very shortly after the onset of a visual stimulus, a representation of the stimulus appears in the Visual Image Store of the Model Human Processor. For an auditory stimulus, there is a corresponding Auditory Image Store. These sensory memories hold information coded physically, that is non-symbolic.

We denote $\implies$ κ<sub>VIS</sub> = κ<sub>AIS</sub> = *physical*.

Further, the stimulus needs to be encoded. The Cognitive Processor can specify which portion of the perceptual memory is to be so encoded. The stimulus decay in the Visual Image Store and the Auditory Image Store over time. As an index of decay time, we use the half-life, defined as the time after which the probability of retrieval is less than 50%. The VIS has a half-life of about $δ_{VIS} = 200[90~1000]msec$, but the Auditory Image Store (AIS) decays more slowly $δ_{AIS} = 1500[900~3500]msec$, consists with the fact that auditory information must be interpreted over time. 

The capacity of the Visual Image Store is hard to fix precisely, but estimated to $μ_{VIS} = 17[7~17]letters$. The capacity of Auditory Image Store is even more difficult to fix, but would seem to be around $μ_{AIS} = 5[4.4~6.2]letters$.

##### Perceptual Processor

The cycle time τ<sub>p</sub> of the Perceptual Processor is identifiable with the so-called unit impulse response. 


#### The Motor System

For computer users, the two most important sets of effectors are the arm-hand-finger system and the head-eye system. Movement is not continuous, but consists of a series of discrete micromovements, each requiring about $τ_M = 70[30~100]msec$. The feedback loop from action to perception is sufficiently long (200~500 msec)that rapid behavioural acts such as typing and speaking must be executed in bursts of preprogrammed motor instructions. 


#### Calculate time for HMP-cycle
The perception process requires $τ_p$ msec, and send this information to the cognitive system, which can then advise (the decision process requires $τ_C$ msec) the motor system to issue a correction (the motor process requires $τ_M$ msec).

The total time to make a correction using visual feedback ("closed loop") should be on the order of $τ_p + τ_C + τ_M$.


#### The Cognitive System

The cognitive system merely serves to connect inputs from the perceptual system to the right outputs of the motor system. But most tasks performed by a person are complex and involve learning, retrieval of facts, or the solution of problems. As would be expected, the memories and the processor for the cognitive system are more complicated than those for the other systems. 


#### Long-Term Memory

Long-Term Memory olds the user's mass of available knowledge. It consists of a network of related chunks, accessed associatively from the contents of the Working Memory. Its contents compromise not only facts, but procedures and history as well. There is no erasure from LTM, therefore $δ_{LTM} = \inf$

To be stored in Long-Term Memory, information from the sensory memories must ultimately be encoded into symbolic form: a pattern of light and dark might be coded as letter. Hence, $κ_{LTM}$ = *semantic*. Memory have a certain probability of being retrievable from LTM. 


#### Cognitive Processor

The recognize-act cycle, analogous to the fetch-execute cycle of standard computers, is the basic quantum of cognitive processing. On each cycle, the contents of Working Memory initiate associatively-linked actions in Long-Term Memory ('recognize'), which in turn modify the contents of Working Memory ('act'), setting the stage for the next cycle. 



##### Summary

This completes our initial description of the Model Human Processor. To recapitulate, the Model Human Processor consists of (1) a set of interconnected memories and processors and (2) a set of principles of operation. The memories and processors are grouped into three main subsystems: a perceptual system, a cognitive system and a motor system. The most salient characteristics of the memories and processors can be summarized by the values of a few parameters: processor cycle time $\tau$, memory capacity $\mu$, memory decay rate $\delta$ and memory code type $\kappa$. Each of the processors has a cycle time on the order of a tenth of a second. 

A model so simple does not, of course, do justice to the richness and subtlety of the human mind. but it does help us to understand, predict, and even to calculate human performance relevant to human-computer interaction. 


## Cognitive architectures

*General explanation for all cognitive architectures: SOAR, ACT-R, ICARUS, CLARION and Subsumption.*


### SOAR - Allan Newell

##### Unified theory of cognition

It is the idea of a theory alone can explain the phenomena of cognition. It was an attempt at unification.

##### Decision cycle
A decision cycle is a fixed processing mechanism in the Soar architecture that does its work in five phases: *input, elaboration, decision, application, and output*.

* During *input*, working memory elements are created that reflect changes in perception.

* During *elaboration*, the contents of working memory are matched agains the *"if"* parts of the rules in long-term memory. All rules that match from procedural memory, fire in parallel, resulting in changes to the features and value of the state in addition to suggestions or **preferences**, for selecting the current operator. The changes to WM in elaborations are simply conclusions or suggestions (in the case of preferences) and not actions in the world or changes to internal structures that would persist beyond the current situation. 
	* At the end of the elaboration phase, perhaps two operators, have been suggested for the operator. To make sure that the best choice is made, a decision to change the operator should not be made until all rules in LTM that match the current situation have been retrieved. 
	* The absence of any further firings of LTM rules, is when the preferences added to working memory are evaluated by a fixed architectural decision procedure. The decision procedure is applied to the vocabulary of preferences, independent of the semantics of the domain. The vocabulary includes symbolic preferences, such as one operator is *better* than another.

* Then, the operator that was selected must be applied to produce the state transition that completes a move in the problem space. the application of the operator occurs during the *application phase*. It produces a motor command. 
* In the final phase, *output*, the motor command is sent to the Perception/Motor Interface to the external environment, leading to the motor pitch being thrown.


#### Main paradigm
Cognitivist

#### Underlying motivation, goal of research leading to the architecture
Many fields with different theories, arise a problem. Each individual discipline really contributes what Newell called micro-theories - small pieces of the big picture developed without the constraint of having to fit in with all the other pieces. The only way, Newell argues, is to go ahead and try to put the whole picture together, to try tot build *unified theories of cognition* (UTCs), as described above.  Soar was developed to be a system that could support multiple problem solving methods for many different problems. In mid 1980s Newell and many of his students began working on Soar as a candidate UTC: 

#### Architecture, components and how it fits together
The idea of the architecture is not new. In working with computers, we often describe and compare hardware architectures. Differences among hardware architectures reflect, in part, designs that are intended to be optimal under different assumptions about the software that the architecture will process. Asking "Does machine M run applications A and B efficiently?" is more appropriate than asking "Does machine M work well?"

If, e.g., our stet of high level tasks is writing the chapters in a calculus book, we are likely to choose a word-processing program that has functions and commands for formatting mathematical equations. If we are simply interested in writing letters, those functions are not important. 

We can, hence the figure below, say that an architectures needs content for producing behaviour. 

![](https://i.imgur.com/BLXJpZ4.png)

$\implies$ BEHAVIOUR = ARCHITECTURE + CONTENT

We can define a cognitive architecture as a theory of the fixed mechanisms and structures that underlie human cognition.

Newell states that a cognitive system requires the use of symbols and abstractions.


#### Knowledge types
In Soar the knowledge is represented by an underlying structure to behaviour and knowledge. This structure provides a means for organizing knowledge as a sequence of decisions through a *problem space*. Situations are represented in the general case by *states*. 

A *state* is described in terms of a vocabulary of features, and their possible values. The initial state $S_0$ is often defined by input from the environment.

To solve a problem, operators must be applied to move through the problem space. Of course, movement through a problem space could be entirely random. To keep behaviour goal-directed, the succession of operators that are applied to the state and the resulting state transformations must be guided by *the principle of rationality*: "if an agent has knowledge that an operator application will lead to one of its goals then the agent will select that operator" (Newell)

##### Problem spaces

Describing the underlying idea of problem spaces puts us on the path to our own goal of modelling a cognitive system in Soar. Mapping knowledge into goals, states and operators is the first step toward tying the content of the environment/world to the Soar architectures. 

Let use a pitcher Joe Rookie as an example, and try to model his world in the domain of baseball. The problem space is also represented as a feature of the state (**problem-space** *pitch*). For simple examples such as this, having an explicit representation of the problem space on ht estate can be useful. 


Knowledge that exist independent of the current situation is held in the architecture's *long term memory (LTM)*. Soar distinguishes three different types of LTM: *procedural, semantic and episodic*. 

* **Procedural knowledge** is about how and when to do things - how to ride a bike
* **Semantic knowledge** consists of facts about the world - things that you believe to be true in general - bicycles has two wheels. 
* **Episodic memory** consists of things you "remember" - specific situations you've experienced, such as the time you fell off your bicycle. 

The knowledge that is most relevant to the current situation is held in Soar's *working memory (WM)*. Much of this is knowledge that is specific to the current situation - what is true at this instant of time. WM can also contain general knowledge that is relevant to the current situation - general facts or memories of specific previous situations that are useful in making decisions about the current situations. 

In Soar, WM is represented as a set of the features and values that make up the current state (and substates), which might include representations of the current goal, problem space and operator. 

Knowledge moves from LTM to WM by both automatic and deliberate retrieval of relevant LTM structures. 


> Procedural is primarily responsible for controlling behaviour and maps directly onto operator knowledge. Semantic and episodic knowledge usually come into play only when procedural knowledge is in some way incomplete or inadequate for the current situation. 


![SOAR_Architectures](https://i.imgur.com/nvfmFJy.png)

We write rules as English-like if-then rules. The rules represent associations between a set of conditions expressed in terms of features and values and specified by the *"if"* part of the rule, and a set of actions, also described by features and values, in the *"then"* part. 

If there is a match between the "if" part of a rule and elements in WM, we sa that the rule has been triggered. This, in turn, causes the "then" portion to *fire* by either sending a message to the motor system, or suggesting changes to the goal, state and operator. Thus, each matching rule maps from current goal, state and operator to changes to those objects. 

There can be dependencies between the rules. E.g. r2 will not match the current goal until r1 has matched and fire, r3 will not match until r1 and r2 have matched and fired. 





#### Impasse

The architecture requires that a single operator is selected, but if the knowledge that could be retrieved from LTM is not adequate to meet that constraint, we have an *impasse*, because of the tie between two or more proposed operators.

In Soar, an impasse is an architectural event that arises whenever the decision procedure cannot resolve the preferences in working memory to select a new operator. An impasse is what happens when the decision cycle can't decide!

Instead, the reasoning required to select an operator requires decision and explorations, such as imagining what would happen if each operator were selected and then comparing the results or attempting to recall a similar situation (in episodic memory) and using it to guide the selection. To support these types of processing, Soar automatically creates a substate in response to an impasse. A substate is a new state that represents the information relevant to resolving the impasse (including the original state). 

![](https://i.imgur.com/ZvVQzZP.png)

*Impasse types:*

* Operator tie
* Operator no-change - do not know change of an action
* ..



#### Learning methods

Again $BEHAVIOUR = ARCHITECTURE + CONTENT$

#### Chunking

Chunking is essentially a deductive, compositional learning mechanism; that is, the preference for a curve ball represent a kind of deduction from prior knowledge, and the new rule is composed from a "then" part containing the deduction, and an "if" part containing the knowledge that contributed to the deduction. This recombination of existing knowledge makes it accessible in new contexts via new LTM rules. 

Note that chunking moves knowledge between different situations, overcoming some of the partitioning function of problem spaces and making the knowledge available in a problem space that is was not available before leaning, but only when experience dictates the need. 


#### Reinforcement Learning

One source of knowledge is outside of internal reasoning is feedback from the environment ,or what is often called a "reward". The reward can come from the "body" in which a model is embedded. The reward can be either positive or negative, such as pleasure or pain. Feedback can also be treated t a more abstract level, such as a reward for succeeding in a task, or punishment for failure. In Soar, reinforcement learning consists of two parts:

1. Soar must learn rules that test the appropriate features of the states and operator. 
2. Soar must learn the appropriate expected rewards for each rule. 

Both chunking and reinforcement learning create new rules, but reinforcement learning creates only operator selection rules, and the basis for creating them. 


#### Episodic memory

Another source of knowledge that is available is the stream of experience. the memory of experiences is commonly called episodic memory. An episode can be used to answer questions about the past to predict the outcome of possible courses of action. 

In Soar, episodes are recorded automatically. Soar selects those working memory elements that have been used recently, to retrieve memories. Once the episode is retrieved, it can trigger rule firings, or even be the basis for creating new cues for further searches of episodic memories.

It differs from reinforcement learning and chunking in many ways. It is a passive learning mechanisms that does not do any generalization. 


#### Semantic Memory
The final source of knowledge is the co-occurrence of structures in working memory. These co-occurrences are more general than episode, which represent just single occurrences. They are distinct from what can be built into rules by chunking or reinforcement learning because they are about static structure instead of derivation-based rules. These are declarative structures, also called semantic knowledge. 


<br></br>



### ACT-R - Adaptive control of thought - rational - *John Anderson*

*ACT-T has evolved into a theory that consists of multiple modules but also explains how these modules are integrated to produce coherent cognition. The perceptual-motor modules, the goal module, and the declarative memory module are presented as examples of specialized systems in ACT-R. These modules are associated with distinct cortical regions. These modules place chunks in buffers, where they can be detected by a production system that respons to patterns of information in the buffers. At any point in time, a single production rule is selected to respond to the current pattern. Sub-symbolic processes serve to guide the selection of rules to fire as well as the internal operations of some modules. much of learning involves tuning of these sub-symbolic processes.*

##### Psychological theory
Psychology, like other sciences has seen an inexorable movement toward specialization. Newell argued for cognitive architectures that would explain how all the components of the mind worked to produce coherent cognition. John Anderson states that he has been working on a cognitive architecture called ACT-R, which is a hypothesis about such an architecture.

##### Linking mental functions to brain structures
It is important to remember that the different components in ACT-R is supposed to resemble special parts of the brain. 

##### Numerical equations for calculations and control


#### Main paradigm

**Hybrid**.

Because it uses sub-symbols in Production Central System for choosing the correct chunk. Hence, it does not infer anything over the symbol, but calculates probabilities when it retrieves chunks for choosing the best and most relevant chunks.


#### Underlying motivation, goal of research leading to the architecture


#### Architecture, components and how it fits together

The architecture consists of a set of modules, each devoted to processing different kind of information:

* A visual module for identifying objects in the visual field
* A manual module for controlling the hands
* A declarative module for retrieving information from the memory
* Goal module for keeping track of current goals and intentions.

Coordination in the behaviour of these modules is achieved through a central **production system**. This central production system is not sensitive to most of the activity of these modules but rather can only respons to a limited amount of information that is deposited in the *buffers* of these modules. E.g. people are not aware of all the information in the visual field but only on the thing that they are currently attending to. 

It is noted cortical regions that they think the modules are associated with:
 
![ACT_R_Architecture](https://i.imgur.com/E4B6Dwx.png)

The basal ganglia implement the production rules in ACT-R by the stratum serving a pattern-recognition function, the pallidum serving a conflict-resoluton function, and the thalamus controlling the execution of production actions. 

The architecture assumes a mixture of parallel and serial processing. Within each module, there is a great deal of parallelism. 

The content of any buffer is limited to a single declarative unit of knowledge, called a *chunk*  in ACT-R. Thus, only a single memory can be retrieved at a time or only a single production is selected at each cycle to fire. 

###### Perceptual-Motor System

Perception and action involve systems every bit as complex as higher level cognition. The primary difference between ACT-R's perceptual-motor machinery and EPIC's is in the theory of the visual system. The ACT-R visual system separates vision into two module, each with an associated buffer.

Wehn a production makes a request of the where system, the production specifies a series of constraints and the where system returns a chunk representing a location meeting those constraints. Constraints are attribute-value pairs that can restrict the search based on visual properties of the object (such as "color: red") or spatial location of the object. It supports a fixed time of 185 ms and serves as a basis for predicting search costs. 

###### Goal Module

The goal module has the responsibility of keeping track of what the intentions are so that behaviour will serve that goal. It enables people to keep the thread of their thought in the absence of supporting external stimuli. 

###### Declarative Memory Module

Long-term personal and cultural coherence is stored in the declarative memory. As a simple example, because most people know arithmetic facts such as 3 + 4 = 7, they can behave consistently in their calculations over time, and social transactions can be reliably agreed upon. 

The declarative memory system and the procedural system constitute the cognitive core of ACT-R. Their behaviour is controlled by a set of equations and parameters that will play a critical role in the integration examples to follow. 

In a common formula in activation theories, the activation of a chunk is a sum of a base level activation ($B_i$), reflecting its general usefulness in the past, and an associative activation($\sum_jW_jS_{ij}$), reflecting its relevance to the current context. The activation of a chunk *i* ($A_i$) is defined as $A_i = B_i + \sum_jW_jS_{ij}$ (activation equation)

![declarative_chunk](https://i.imgur.com/vJHXVx7.png)

With respect to probability of retrieval, the assumption is chunks will be retrieved only if their activation is over a threshold. Because activation values are noisy, there is only a certain probability that any chunk will be above threshold. The probability that the activation will be greater than a threshold $\tau$ is given by the following equation: $P_i = \frac{1}{1+e^{-(A_i - \tau)/s}}$


####### Procedural Memory

The acronym ACT stands for adaptive control of thought, and this section describes how it is adaptive. The key idea is that at any point in time multiple production rules might apply, but because of the seriality in production rule execution, only one can be selected, and this is the one with the highest utility. Production rule utilities are noisy, just like declarative activations and play a similar role in production selection as activations play in chunk selection. The other significant set of parameters in ACT-R involve these utility calculations. the utility of a production *i* is defined as $U_i = P_iG - C_i$
, where $P_i$ is an estimate of the probability that if the production *i* is chosen the current goal will be achieved, $G$ is the value of that current goal, and $C_i$ is an estimate of the cost to achieve the goal.

#### Knowledge types

Den bruker symbolsk knowledge, men når den velger actions i pdc, så går den ned på et subsymbolsk nivå, hvor hver chunks verdier regnes ut ved hjelp av funksjoner, slik at man kan vurdere de forskjellige chunkenes utility og kost. Så all knowledge er symbolsk representert, men for å velge chunks bruker den ikke det


#### Learning methods

The Goal Module handles the problem search and solving. The Memory Module retrieves chunks if the activation-functions is above a certain threshold. The Production System calculates the utility for all actions available from Goal-Buffer and Memory-Buffer, then chooses the best action.

It learns by looking at the history of each production/action, adjust the probability-value in the utility-function for the production, accordingly to the production being successfully or not. 

**Learning Taxonomy:**

![Learning_Taxonomy](https://i.imgur.com/RxwLwLr.png)

<br></br>


### ICARUS - *Pat Langley*


##### Computational theory

Research on cognitive architectures attempts to specify the computational infrastructure that underlies intelligent behaviour. 

##### Distinct short-term memories

Short-term memories are distinct from long-term memories. The former store content that changes rapidly over time, like beliefs and goals; the latter contain elements that are static or change gradually through learning. 

Memories are collections of symbolic structures. They contain distinct elements that are typically encoded as list structures. 


##### Conceptual inference as basis

Conceptual inference generates content needed for skill execution, and problem solving relies on results from both mechanisms. 

##### Assumptions

* Cognition is grounded in perception and action.
* Categories and skills are distinct types of cognitive structure.
* Short-term elements are instances of long-term structures.
* Long-term knowledge is organized in a hierarchical mann.
* Inference has primacy over execution, which in turn has primacy over problem solving.

##### Early research on ICARUS

Never a full implementation, but research team developed three components that addressed different facets of embodied intelligence. The modules are:

* *LABYRINTH*
* *MÆANDER*
* *DÆLADUS*

#### Main paradigm
Cognitivist


#### Underlying motivation, goal of research leading to the architecture

The objectives in developing ICARUS are to produce:

* A computational theory of high-level cognition in humans
* that is qualitatively consistent with results from psychology
* that exhibits as many distinct cognitive functions as possible
* that supports creation of intelligent agents in many settings

It builds on four basic key ideas:

* Physical symbol systems
* List structures and list processing
* Symbolic patterns and pattern matching
* Relational rules and dynamic composition

It does not attempt to match detailed results from experiments with humans, and differs from e.g. ACT-R and Soar. 

#### Architecture, components and how it fits together

![ICARUS_Architecture](https://i.imgur.com/qSlL0rR.png)

In the section to follow, I will discuss the modules for conceptual inference, teleoreactive execution, problem solving and skill learning, and goal processing. The figure above depicts these components and the memories through which they interact. 

##### Conceptual Inference

The modern version have reintroduced separate memories for concepts and skills, and described inference mechanisms that operated over conceptual structures. These take form of logical rules. The ICARUS uses these rules to define both categories of objects and relations among them. 

###### Bottom-up inference

On each cognitive cycle, a perceptual process deposits a set of visible objects, each with a type and associated attributes, into the architecture's perceptual buffer. The inference mechanism finds all ways that each primitive conceptual rule matches against these objects. 

ICARUS associates its skills with the goals they achieve and decomposes them into ordered subgoals that index lower-level skills. This distinguishes it from hierarchical tasks networks. 

During execution, ICARUS evaluates skills in a top-down fashion (from top-level goal to actions). Each cognitive cycle begins with conceptual inference, after which the architecture makes a single execution-related decision. The architecture starts with an unsatisfied top-level goal, and retrieves all skills that are relevant, in that their heads unify with the goal, and that are applicable, in that elements in their `:conditions` field match consistently against current beliefs. 

When this process retrieves multiple skill clauses, a conflict-resolution method selects one of the candidates and makes it the agent's current intention.



#### Skills and intention

* **Skills** are symbolic predicates that the agent can use for this cognitive purpose
* **Skill clauses** provide definitions for these symbols that the agent can use for retrieval and control
* **Intentions** are instances of skills that, taken together, describe the agent's planned environmental activity.


Skills and concepts contain different kind of information, even though same predicate symbol refer to both

* A *concept* *p* defines what *p* is, and when its instances can be inferred
* The *skill* *p* is a constructive definition that describes how instances of *p* can be achieved or created through actions. 


#### Learning methods

ICARUS adopts a cascaded approach to integration in which lower-level modules produce results for higher-level ones. 


###### Theory of Skill Acquisition

Skill learning lets humans store the results of experience to improve their future performance:

* Skill acquisition involves monotonic addition to memory of new symbolic structures
* Learning is driven by experience but draws on prior knowledge
* Skill learning operates in an incremental and cumulative manner
* The learning process is interleaved with problem solving, which provides it with experience
* Skills are *generalized traces of successful means-end analysis*.


##### Skill learning in ICARUS


As the architecture carries out means-end analysis - trying out each possible action and analyses the distances to the goal - it retains traces of successful decompositions. 

Each trace includes details about the goal, skill and the initially satisfied and unsatisfied subgoals. 

When the architecture achieves new goals, or the same goal in a different way, it gradually expands the hierarchy. Each newly learned skill is available for use on future problems, thus supporting structural transfer. 


The problem solving process can require considerable search and backtracking. Module that learns from solved problem. 

* Achieves a goal G by chaining off a skill clause with head B and required achieved start condition A:
	* 	Constructs a new skill clause with head G, the ordered subgoals A and B, and the same start condition as that for the first subskill. 

* Achieves a goal G through concept chaining:
	* Create a skill clause with head G, with subgoals based on G's subconcepts in order it achieved them, and with start conditions based on those subconcepts satisfied at the outset. 


<br></br>


### CLARION - *Ron Sun*

*Overall, CLARION is an integrative model. It consists of a number of functional subsystems (4). It also has a dual representational structure - implicit and explicit representations being in two separate components in each subsystem. thus far, CLARION has been successful in capturing a variety of processes in a variety of task domains based on this division of modules*


##### Theory unifying cognitivist and emergent

CLARION, with its dual representation structure, with a bottom level with encoded implicit knowledge, and a top level that encodes explicit knowledge, unifies the cognitivist (symbolic) and emergent (which is based upon connectionism, parallelism and statistics). The two level interact, by cooperating in actions and in learning. 


##### Explicit and implicit knowledge

A key assumption of CLARION, which has been argued for amply before, is the dichotomy (separation) of implicit and explicit cognition. Generally speaking, implicit processes are less accessible and more "holistic", while explicit processes are more accessible and more crisp. The dichotomy is closely related to e.g. the dichotomy of symbolic versus subsymbolic processing.

##### Combined reasoning
The reasoning is combined in the matter that both the top and the bottom level, comes up with a suggestion of an action.

##### Top-down and bottom-up learning
This cognitive architecture may learn on its own, regardless of whether or not there is a priori or externally provided domain knowledge. Learning may proceed on trial-and-error basis. Furthermore, through "bottom up learning", explicit and abstract domain knowledge may be developed, in a gradual and incremental fashion. 

By top-down learning, it can learn implicit. 

#### Main paradigm
**Hybrid**, because of the use of statistics/non-symbolisms in the implicit representation level in the Action-centered subsystem and non-action-subsystem. It is often used neural nets here. 


#### Underlying motivation, goal of research leading to the architecture
In the attempt to tackle a host of issues arising from computational cognitive modelling that are not adequate addressed by many other existent cognitive architectures, such as implicit-explicit interaction. 

#### Architecture, components and how it fits together

![CLARION_ARCHITECTURE](https://i.imgur.com/KjhMQHy.png)

The multiple subsystems interact with each other constantly. These subsystems have to work closely with each other in order to accomplish cognitive processing. The interaction among these subsystems may include som "executive control" of some subsystems. 

Cognitive-metacognitive interaction has not been addressed by other architectures yet. 

##### 4 Subsystems

* Action-centered subsystem
	* Explicit-/Implicit representation
* Non-action-centered subsystem
 	* Explicit-/Implicit representation
* Motivational subsystem
	* Drives, goal, intention
* Meta-cognitive subsystem
	* Reinforcement
	* Goal setting

The role of ACS is to control actions, regardless of whether the actions are for external physical movement or internal mental operations. Both top and bottom level gives a suggestion for an action, which it has to stochastically choose one action from. 

The role of the NACS is to maintain general knowledge, either implicit or explicit. 

The role og the MS is to provide underlying motivations for perception, action and cognition, in terms of providing impetus and feedback. 

The role of the MCS is to monitor, direct and modify the operations of the ACS dynamically as well as the operations of all the other subsystems. 

Each of these interacting subsystems consists of two levels of representations: The top level encodes explicit knowledge and the bottom level encodes implicit knowledge. The inaccessible nature of implicit knowledge may be captured by subsymbolic, distributed representation provided, e.g. by a backpropagation network. 


#### Learning methods

There is the learning of implicit knowledge at the bottom level. One way of implementing a mapping function to capture implicit knowledge is to use a multi-layer network. Often reinforcement learning can be used, especially Q-learning. In this learning setting, there is no need for priori knowledge. 

Explicit knowledge at the top level can also be learned in a variety of ways. Because of its representational characteristics, one-shot learning (e.g. hypothesis testing) is preferred during interaction with the world - this is called exploration.

The implicit knowledge already acquired in the bottom level may be utilized in learning explicit knowledge at the top level, through *bottom-up learning*. That is, information accumulated in the bottom level through interacting with the world is used for extracting and then refining explicit knowledge. This is a kind of "rational reconstruction" of implicit knowledge at the explicit level. 

Conversely, once explicit knowledge is established at the top level, it may be assimilated into the bottom level. This often occurs during the novice-to-expert transition in instructed learning settings. It is known as *top-down learning*.


<br></br>


### Subsumption - *Rodney Brooks*

*A control system for a completely autonomous mobile robot must perform many complex information processing tasks in real time. The usual approach to building control systems for such as robots is to decompose the problem into series of functional units as illustrated by a series of vertical slides in figure 1. After analyzing the computational requirements for a mobile robot Brooks have decided to use task achieving behaviours as the primary decomposition. This is illustrated by a series of horizontal slices in figure 2.*

![Layers_of_functions](https://i.imgur.com/I176ods.png)

##### Evolutional theory of intelligence
Subsumption architecture is based on evolutionary path of intelligence (think incrementally more complex)

##### Focus on systems embedded in environment - Robots
It focuses on systems embedded in an environment such as robot-vacuums or robot-lawnmowers. 

#### Main paradigm
Emergent

#### Underlying motivation, goal of research leading to the architecture
They key idea of levels of competence is that we can build layers of a control system corresponding to each level of competence and simply add a new layer to an existing set to move the next higher level of overall competence. 

Start by building a complete robot control system which achieves lvl 0 competence - A zeroth level control system. Next we build another control level. This level, with the aid of the zeroth, achieves lvl 1 competence. The zeroth layer continues to run unaware of the layer above it which sometimes interferes with its data paths. 

#### Architecture, components and how it fits together

The Subsumption Architecture is:

![Subsumption_Architecture](https://i.imgur.com/uSSrCC7.png)

* A layering methodology for robot control system
* A parallel and distributed method for connecting sensors and actuators in robots.
* Layers are tasks that are enabled by gradually adding more complex structures

The upper levels subsumes the levels below. Can incrementally increase the complexity of a system. 

Modules in a higher layer can **override or subsume** the output from behaviours in the next lower layers. Outputs are simple functions of inputs and local variables. Inputs can be suppressed and outputs can be inhibited (this allows the subsumption by higher levels). 

No need for central control.


#### Knowledge types

Do not use symbolism. 

#### Learning methods

A subsumption architecture leans by adding a new layer, then it reaches the next level of competence.s


## Case-Based Reasoning & Dynamic Memory


### MOPS - Memory Organization Packets

MOPs organize situations whose activities are similar. The general knowledge in a MOP is much like the knowledge held in the original formulation of scripts. It includes information about normative sequence of events, setting, cast of characters, etc. The major difference between general knowledge in a script and that in a MOP is in the level of detail of that knowledge. 

![MOPS](https://i.imgur.com/KGbkW0q.png)






