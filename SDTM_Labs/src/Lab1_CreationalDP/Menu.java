package Lab1_CreationalDP;

// implementing abstract factory pattern for menu class
public abstract class Menu {
    abstract String breakfastMenu();

    abstract String lunchMenu();

    abstract String mainMenu();
}

class MondayMenu extends Menu {

    @Override
    public String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Fried eggs: 15 lei" +
                "\n" + "Biscuits: 10 lei" + "\n";
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

class TuesdayMenu extends Menu {

    @Override
    String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Oatmeal with seasonal fruits: 30 lei" +
                "\n" + "Croissant: 10 lei" + "\n";
    }

    @Override
    String lunchMenu() {
        return "Soup of the day: 30 lei" +
                "\n" + "Spaghetti: 30 lei" +
                "\n" + "Fresh juice: 15 lei" + "\n";
    }

    @Override
    String mainMenu() {
        return "Fish and seafood: 150 lei" +
                "\n" + "Bifana sandwich with pork: 80 lei" +
                "\n" + "Tuna salad: 30 lei" +
                "\n" + "Caesar salad: 30 lei" +
                "\n" + "Greek salad: 30 lei" +
                "\n" + "Pasta Carbonara: 80 lei" +
                "\n" + "Chicken ravioli : 60 lei" + "\n";
    }
}

class WednesdayMenu extends Menu {

    @Override
    String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Omelette with pastrama and tomatoes : 45 lei" +
                "\n" + "Donut: 15 lei" + "\n";
    }

    @Override
    String lunchMenu() {
        return "Soup of the day: 30 lei" +
                "\n" + "Spaghetti: 30 lei" +
                "\n" + "Fresh juice: 15 lei" + "\n";
    }

    @Override
    String mainMenu() {
        return "Fish and seafood: 150 lei" +
                "\n" + "Bifana sandwich with pork: 80 lei" +
                "\n" + "Tuna salad: 30 lei" +
                "\n" + "Caesar salad: 30 lei" +
                "\n" + "Greek salad: 30 lei" +
                "\n" + "Pasta Carbonara: 80 lei" +
                "\n" + "Chicken ravioli : 60 lei" + "\n";
    }
}

class ThursdayMenu extends Menu {

    @Override
    String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "English breakfast: 50 lei" +
                "\n" + "Biscuits: 10 lei" + "\n";
    }

    @Override
    String lunchMenu() {
        return "Soup of the day: 30 lei" +
                "\n" + "Spaghetti: 30 lei" +
                "\n" + "Fresh juice: 15 lei" + "\n";
    }

    @Override
    String mainMenu() {
        return "Fish and seafood: 150 lei" +
                "\n" + "Bifana sandwich with pork: 80 lei" +
                "\n" + "Tuna salad: 30 lei" +
                "\n" + "Caesar salad: 30 lei" +
                "\n" + "Greek salad: 30 lei" +
                "\n" + "Pasta Carbonara: 80 lei" +
                "\n" + "Chicken ravioli : 60 lei" + "\n";
    }
}

class FridayMenu extends Menu {

    @Override
    String breakfastMenu() {
        return "Coffee: 25 lei" +
                "\n" + "Russian dumplings with toppings: 30 lei" +
                "\n" + "Croissant: 10 lei" + "\n";
    }

    @Override
    String lunchMenu() {
        return "Soup of the day: 30 lei" +
                "\n" + "Spaghetti: 30 lei" +
                "\n" + "Fresh juice: 15 lei" + "\n";
    }

    @Override
    String mainMenu() {
        return "Fish and seafood: 150 lei" +
                "\n" + "Bifana sandwich with pork: 80 lei" +
                "\n" + "Tuna salad: 30 lei" +
                "\n" + "Caesar salad: 30 lei" +
                "\n" + "Greek salad: 30 lei" +
                "\n" + "Pasta Carbonara: 80 lei" +
                "\n" + "Chicken ravioli : 60 lei" + "\n";
    }
}

