package restaurant.reports.printer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompositePrinter implements Printer {
    List<Printer> printers = new ArrayList<>();

    @Override
    public void print(String log) throws IOException {
        for (Printer loggers : printers) {
            loggers.print(log);
        }
    }

    public void addPrinter(Printer printer) {
        printers.add(printer);
    }
}
