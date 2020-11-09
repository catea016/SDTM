package restaurant.reports.printer;

import java.io.IOException;

// Composite pattern
public interface Printer {
    void print(String log) throws IOException;
}
