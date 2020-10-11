package Lab1_CreationalDP;

public class Waiter {
    // class that give menu to visitor, take his order and send it to kitchen
    Menu menu;
    Order order;

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void sendOrderToKitchen(Kitchen kitchen) {
        kitchen.acceptOrder(order);
    }

    public void takeOrder(Order newOrder) {
        this.order = newOrder;
    }
}
