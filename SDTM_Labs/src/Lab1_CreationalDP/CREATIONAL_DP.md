# Topic: Creational Design Patterns
Author: Gherbovei Ecaterina

## Objectives:
1. Study the Creational Design Patterns
2. Implement three of them in real project

## Theory:
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, 
trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design
problems or in added complexity to the design. Creational design patterns solve this problem by somehow controlling this
object creation.
Creational design patterns are composed of two dominant ideas. One is encapsulating knowledge about which concrete 
classes the system uses. Another is hiding how instances of these concrete classes are created and combined.

Five well-known design patterns that are parts of creational patterns are :

 - **Abstract factory pattern**, which provides an interface for creating related or dependent objects without specifying 
 the objects' concrete classes.
 - **Builder pattern**, which separates the construction of a complex object from its representation so that the same 
 construction process can create different representations.
 - **Factory method pattern**, which allows a class to defer instantiation to subclasses.
 - **Prototype pattern**, which specifies the kind of object to create using a prototypical instance, and creates new 
 objects by cloning this prototype.
 - **Singleton pattern**, which ensures that a class only has one instance, and provides a global point of access to it.
 
## Implementation:
In this project I've implemented 3 creational design patterns i.e. (Singleton, Builder and Abstract Factory)
with the fundamental object **Order**. The Object class contain one attribute that is an array list **items** that is a
list of all orders that make an visitor. Also this class contains an inner class OrderBuilder that have methods `add()` 
, that allow us to create the order add different types of food into the order list `items`:
 ```Java
public OrderBuilder add(String orderItem) {
            items.add(orderItem);
            return this;
        }
```
 Also there is another method 
`build()` that create new order:
 ```Java
public Order build() {
            Order order = new Order();
            order.items = this.items;
            return order;
        }
```
 This class was implementing using the builder design pattern.
 
 The simplest DP, Singleton I've implemented in Kitchen class. There I declared the attribute instance as private and 
 static one, also the public method `getInstance()` of type Kitchen, that return the instance:
 ```Java
public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }
```

For the AbstractFactory DP I created the abstract class Menu that have 3 abstract methods: `breakfastMenu()`, 
`lunchMenu()` and `mainMenu()`. Also for this DP I created 5 classes for each day in the week that extends Menu.
For example:
```Java
class MondayMenu extends Menu {

    @Override
    public String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Fried eggs: 15 lei" +
                "\n" + "Biscuits: 10 lei" + "\n";
    }

    @Override
    public String lunchMenu() {

        return "Soup of the day: 30 lei" +
                "\n" + "Spaghetti: 30 lei" +
                "\n" + "Fresh juice: 15 lei" + "\n";
    }

    @Override
    public String mainMenu() {
        return "Fish and seafood: 150 lei" +
                "\n" + "Bifana sandwich with pork: 80 lei" +
                "\n" + "Tuna salad: 30 lei" +
                "\n" + "Caesar salad: 30 lei" +
                "\n" + "Greek salad: 30 lei" +
                "\n" + "Pasta Carbonara: 80 lei" +
                "\n" + "Chicken ravioli : 60 lei" + "\n";
    }
}
```
## Screenshots:
