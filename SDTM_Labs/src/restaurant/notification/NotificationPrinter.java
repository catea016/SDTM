package restaurant.notification;

public class NotificationPrinter {
    NotificationCollection notifications;

    public NotificationPrinter(NotificationCollection notifications)
    {
        this.notifications = notifications;
    }

    public void printNotifications()
    {
        Iterator iterator = notifications.createIterator();
        System.out.println("--------NOTIFICATIONS FOR VISITOR--------");
        while (iterator.hasNext())
        {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getVisitorNotification());
        }
    }
}
