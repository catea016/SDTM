package Lab1;
// Singleton pattern
public class Menu {
    // static variable menu of type Menu
    private static Menu menu = null;

    private Menu() {
        System.out.println("The menu of the pizzeria");
    }

    public static Menu getMenu(){
        if (menu ==null){
            menu = new Menu();
        }
        return menu;
    }
}