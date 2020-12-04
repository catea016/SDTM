package restaurant.notification;

public class NotificationCollection implements Collection {
    Notification[] notificationList;
    static final int MAX_NR = 6;
    int numberOfItems = 0;

    public NotificationCollection() {
        notificationList = new Notification[MAX_NR];

        // Let's add some notifications for visitor
        addItem("Dear visitor thank you for your order :)");
        addItem("Enjoy your food");
        addItem("You ordered: ");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_NR)
            System.err.println("Array of notifications is full, no more allowed");
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
