package restaurant.notification;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    // maintains current position of iterator over the array
    int position = 0;

    public NotificationIterator(Notification[] notificationList) {

        this.notificationList = notificationList;
    }

    public Object next() {
        Notification notification = notificationList[position];
        position += 1;
        return notification;
    }

    public boolean hasNext() {
        if (position >= notificationList.length ||
                notificationList[position] == null)
            return false;
        else
            return true;
    }

}
