package restaurant.reports.printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String log) {
        System.out.println(log);
    }
}
