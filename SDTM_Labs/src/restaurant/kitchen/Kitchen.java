package restaurant.kitchen;

import restaurant.Order;
import restaurant.menu.*;

import java.util.ArrayList;
import java.util.Calendar;

// implementing singleton pattern for kitchen class
public class Kitchen {
    private ArrayList<Order> orders = new ArrayList<>();
    private static Kitchen instance;
    private int dayOfWeek;

    private Kitchen() {
    }

    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    public Menu getMenu() {
        Menu menu = null;
        if (dayOfWeek == Calendar.MONDAY) {
            menu = new MondayMenu();
        } else if (dayOfWeek == Calendar.TUESDAY) {
            menu = new TuesdayMenu();
        } else if (dayOfWeek == Calendar.WEDNESDAY) {
            menu = new WednesdayMenu();
        } else if (dayOfWeek == Calendar.THURSDAY) {
            menu = new ThursdayMenu();
        } else if (dayOfWeek == Calendar.FRIDAY) {
            menu = new FridayMenu();
        }
        return menu;
    }

    /*public void prepareMeal() {
        System.out.println("The order is getting prepared");
    }*/

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void acceptOrder(Order order) {
        orders.add(order);
    }
}

