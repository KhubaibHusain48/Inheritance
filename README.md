

---

# Java Inheritance Example

## Description

This project demonstrates the concept of **inheritance** in Java with multiple examples. It shows how subclasses inherit properties and behaviors from superclasses, how constructors in subclasses can invoke superclass constructors, and how methods can be overridden or extended.

## Features

* Inheritance hierarchy for Vehicles and TwoWheelers.
* Demonstrates constructor chaining between superclass and subclass.
* Shows method overriding and extending functionality.
* Provides a simple real-world analogy using animals and vehicles.

## Code Structure

* `Vehicle` class: Base class representing a generic vehicle with a default of 4 wheels and a `commute()` method.
* `TwoWheeler` class: Subclass of `Vehicle`, overrides `noOfWheels` to 2 and adds a `drive()` method.
* `Bike` class: Subclass of `TwoWheeler`, adds a `BikeRide()` method.
* `Animal` class: Superclass with a name attribute and constructor.
* `Dog` class: Subclass of `Animal` demonstrating constructor chaining.
* `mainMethod` class: Contains the `main` method to demonstrate inheritance and method calls.
* `Main` class: Contains the `main` method to demonstrate constructor chaining in animal classes.

## How to Run

1. Compile all Java files:

   ```bash
   javac ConceptsCode/Inheritance/*.java
   ```

2. Run the inheritance demo for vehicles:

   ```bash
   java ConceptsCode.Inheritance.mainMethod
   ```

   Expected output:

   ```
   Using 4 wheels
   Driving two wheeler
   Using 2 wheels
   Driving two wheeler
   Using 2 wheels
   Bike Riding
   ```

3. Run the animal constructor chaining demo:

   ```bash
   java ConceptsCode.Inheritance.Main
   ```

   Expected output:

   ```
   Animal constructor called. Name: Tom
   Dog constructor called.
   ```

## Requirements

* Java JDK 8 or above
* Basic understanding of Java inheritance and constructors

## Explanation

* **Vehicle and Subclasses:** Illustrates property overriding (`noOfWheels`) and additional methods in subclasses.
* **Animal and Dog:** Demonstrates constructor chaining where the subclass constructor calls the superclass constructor using `super()`.

## License

Open source for learning and educational purposes.

---

