package restaurant;

import restaurant.kitchen.Kitchen;
import restaurant.menu.Menu;
import restaurant.notification.NotificationCollection;
import restaurant.notification.NotificationPrinter;
import restaurant.reports.reportDecorator.ArrangeTitleToMiddle;
import restaurant.reports.reportDecorator.ReportTitle;
import restaurant.reports.reportDecorator.SeparateTitle;
import restaurant.reports.reportDecorator.TitleDecorator;
import restaurant.staff.Manager;
import restaurant.staff.Waiter;

import java.io.IOException;
import java.util.Calendar;

public class Restaurant {

    OrderBook orderBook = new OrderBook();
    Manager manager = new Manager();
    Waiter waiter = new Waiter();

    public static void main(String[] args) throws IOException {
        int dayOfWeek = getDayOfWeek();

        Restaurant restaurant = new Restaurant();

        restaurant.startDay(dayOfWeek);

        restaurant.serve();

        restaurant.closeDay();
    }

    private void closeDay() throws IOException {
        System.out.println("\n");
        System.out.println("Closing day... ");
        System.out.println("Generating reports... ");
        System.out.println("\n");
        TitleDecorator decorator = new SeparateTitle(new ArrangeTitleToMiddle(new ReportTitle()));
        decorator.decorate();
        decorator.newOperation();
        manager.printEndOfDayReport();

    }

    private void serve() {
        Kitchen kitchen = Kitchen.getInstance();
        Visitor visitor = new Visitor();
        waiter.takeOrder(visitor.newOrder());
        //print notifications for visitor
        NotificationCollection nc = new NotificationCollection();
        NotificationPrinter notify = new NotificationPrinter(nc);
        notify.printNotifications();
        System.out.println(visitor.newOrder().items);
        waiter.sendOrderToKitchen(kitchen);

    }

    public void startDay(int dayOfWeek) {
        manager.setOrderBook(orderBook);

        System.out.println("Hello visitor and welcome to our restaurant!");
        Kitchen kitchen = Kitchen.getInstance();
        kitchen.setDayOfWeek(dayOfWeek);

        System.out.println("Today is " + dayOfWeek + "th day of the week and you can select items from its menu :)" + "\n");
        Menu menu = kitchen.getMenu();
        System.out.println("Breakfast: " + "\n" + menu.breakfastMenu()
                + "\n" + "Lunch: " + "\n" + menu.lunchMenu() + "\n" + "Main menu: " + "\n" + menu.mainMenu());

        waiter.setMenu(menu);
        waiter.setOrderBook(orderBook);

    }

    private static int getDayOfWeek() {
        return Calendar.THURSDAY;
    }
}
