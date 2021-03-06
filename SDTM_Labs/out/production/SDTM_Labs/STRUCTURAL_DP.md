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
 ![](../src/Images/Manager.png)
 In order to print the report I used the composite pattern that is located in src/restaurant/reports/printer
 there I have an interface Printer with a ```print``` method, also I have 2 classes that implements
 Printer. One for **ConsolePrinter**
 ```java
public class ConsolePrinter implements Printer {
    @Override
    public void print(String log) {
        System.out.println(log);
    }
}
```
and the second one for **FilePrinter**

```java
public class FilePrinter implements Printer {
    private final String fileName;

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(String log) throws IOException {
        FileWriter report = new FileWriter(fileName);
        TitleDecorator decorator = new SeparateTitle(new ArrangeTitleToMiddle(new ReportTitle()));
        report.write(log);
        report.close();
        System.out.println("Successfully wrote to the file.");
    }
}
```
The second pattern I implemented is adapter that is located in src/restaurant/reports, I used it to create the report using a specific template for all the data
Here I have the interface ```ReportAdapter``` with 2 methods ```getCount``` and ```getItem```
also I created the class ```Report``` and ```EndOfDayReportAdapter``` to create the report:
```java
public class EndOfDayReportAdapter implements ReportAdapter {
    private final OrderBook orderBook;

    public EndOfDayReportAdapter(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    @Override
    public Report.ReportItem getItem(int itemCount) {
        Report.ReportItem item = new Report.ReportItem();
        switch (itemCount) {
            case 0:
                item.line = createItem(itemCount);
                break;
            case 1:
                item.line = "Totals: " + orderBook.getGrandTotal();
                break;
        }

        return item;
    }

    private String createItem(int itemCount) {
        return "Fish and seafood: 150 lei" +
           "\n" + "Bifana sandwich with pork (x3): 80 lei" +
            "\n" + "Tuna salad (x8) : 30 lei" +
            "\n" + "Caesar salad (x5): 30 lei" +
            "\n" + "Greek salad (x3): 30 lei" +
            "\n" + "Pasta Carbonara (x10): 80 lei" +
            "\n" + "Chicken ravioli (x3): 60 lei" + "\n";
    }

    @Override
    public int getCount() {
        return 3;
    }
```
And for the last pattern Decorator I created the Interface ```Report``` . I used this pattern specially to decorate report
title using the class ReportTitle to instantiate the title
```java
public class ReportTitle implements Report {
    @Override
    public void decorate() {
        System.out.print("Restaurant Cafe 'Bon Appetit'");
    }
}
```
Also with the ```ArrangeTitleToMiddle``` and ```SaparateTitle``` classes I arranged the title to the middle
and separated it, using a line, from the other report text.

## Results:
At the end I obtained the end of day report printed in the console and in the file.
In console:
![](../src/Images/report_console.png)
In txt file:
![](../src/Images/report_file.png)

