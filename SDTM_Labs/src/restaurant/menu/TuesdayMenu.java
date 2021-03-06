package restaurant.menu;

public class TuesdayMenu extends Menu {

    @Override
    public String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Oatmeal with seasonal fruits: 30 lei" +
                "\n" + "Croissant: 10 lei" + "\n";
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
