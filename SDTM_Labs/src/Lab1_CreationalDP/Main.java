package Lab1_CreationalDP;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek = getDayOfWeek();

        System.out.println("Hello visitor and welcome to our restaurant!");
        Kitchen kitchen = Kitchen.getInstance();
        kitchen.setDayOfWeek(dayOfWeek);
        System.out.println("Today is " + dayOfWeek + "th day of the week and you can select items from its menu :)" + "\n");
        Menu menu = kitchen.getMenu();
        System.out.println("Breakfast: " + "\n" + menu.breakfastMenu()
                + "\n" + "Lunch: " + "\n" + menu.lunchMenu() + "\n" + "Main menu: " + "\n" + menu.mainMenu());

        Waiter waiter = new Waiter();
        waiter.setMenu(menu);


        Visitor visitor = new Visitor();
        waiter.takeOrder(visitor.newOrder());
        System.out.println("Your order is:" + "\n" + visitor.newOrder().items);
        waiter.sendOrderToKitchen(kitchen);
        kitchen.prepareMeal();
    }

    private static int getDayOfWeek() {
        return Calendar.THURSDAY;
    }
}
