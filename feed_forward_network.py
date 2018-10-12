from pybrain.datasets.supervised import SupervisedDataSet
from pybrain.tools.shortcuts import buildNetwork
from pybrain.structure import TanhLayer
from pybrain.supervised.trainers import BackpropTrainer
"""
Assignment in creating Neural Feed-Forward Network with PyBrain

How to set up a VirtualEnv for this assignment is described in README.md
"""


# Creating SupervisedDataSet, from PyBrain, that excepts one dimensional inputs and targets
dataset = SupervisedDataSet(1, 1)
for i in range(1, 9):
	dataset.addSample(i, i)


hidden_nodes = 8
# Creating network with 1 input, 8 hidden layer and 1 output neurons, with hidden layers of type tanh
network = buildNetwork(1, hidden_nodes, 1, hiddenclass=TanhLayer)


# Creating a backpropagation-trainer on our data-set and network
trainer = BackpropTrainer(network, dataset=dataset)

# Training network with backpropogation until node-convergence
trainer.trainUntilConvergence(verbose=False, validationProportion=0.15, maxEpochs=1000, continueEpochs=10)


# Activating the network on different integers such as the inputs in the data-set
print("Hidden nodes: {}".format(hidden_nodes))
print("Input -> Output")
for i in range(1, 9):
	print("{} -> {}".format(i, network.activate([i])[0]))

# Activating the network with decimal inputs outside of data-set
print("\nTesting with decimals:")
for i in range(40, 60, 2):
	print("{} -> {}".format(i * 0.1, network.activate([i * 0.1])[0]))

# Activating the network with negative numbers outside of data-set
print("\nTesting with negative numbers:")
for i in range(1, 9):
	print("{} -> {}".format(-i, network.activate([-i])[0]))

# Activating the network with numbers outside of [1,8]
print("\nTesting with numbers outside of [1,8]:")
for i in range(20, 29):
	print("{} -> {}".format(i, network.activate([i])[0]))
