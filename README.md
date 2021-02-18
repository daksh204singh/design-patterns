# Memento Pattern
* A way to store previous states of an object easily.
* Memento: The basic object that is stored in different states.
* Originator: Sets and Gets values from the currently targeted Memento. Creates new Memento and assigns current values to them.
* CareTaker: Holds a list that contains all previous versions of the Memento. It can store and retrieve stored Mementos.
* All the classes, Memento, Originator and CareTaker have a single responsibility.

Examples Included:
* Editor
* Document