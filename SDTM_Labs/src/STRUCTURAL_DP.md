# Topic: Creational Design Patterns
Author: Gherbovei Ecaterina

## Objectives:
1. Study and understand the Structural Design Patterns;
2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user;
3. Implement some additional functionalities using structural design patterns;

## Introduction/Theory:
In Software Engineering, Structural Design Patterns are Design Patterns that ease the design by identifying a simple way to realize relationships between entities.
 * Adapter - Match interfaces of different classes
 * Bridge - Separates an object's interface from its implementation
 * Composite - A tree structure of simple and composite objects
 * Decorator - Add responsibilities to objects dynamically
 * Facade - A single class that represents an entire subsystem
 * Flyweight - A fine-grained instance used for efficient sharing
 * Private Class Data - Restricts accessor/mutator access
 * Proxy - An object representing another object
 
 ## Implementation:
 For this laboratory work I've implemented 3 types of structural design patterns (i.e Adapter, Composite and Decorator).
 So, I chose the domain for restaurants and as in any restaurant I have an manager that need to provide daily at the end 
 of working day an report that contains a list of orders and the total amount of money. To achieve tha I created the
 separated class Manager, to print end of day report :
 ![](../Images/Manager.png)