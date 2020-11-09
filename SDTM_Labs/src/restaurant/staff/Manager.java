package restaurant.staff;

import restaurant.OrderBook;
import restaurant.Person;
import restaurant.reports.*;
import restaurant.reports.printer.CompositePrinter;
import restaurant.reports.printer.ConsolePrinter;
import restaurant.reports.printer.FilePrinter;

import java.io.IOException;

public class Manager implements Person {
    private OrderBook orderBook;

    public void setOrderBook(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    public void printEndOfDayReport() throws IOException {
        Report endOfDayReport = new Report();
        endOfDayReport.setAdapter(new EndOfDayReportAdapter(orderBook));

        CompositePrinter printer = new CompositePrinter();
        printer.addPrinter(new ConsolePrinter());
        printer.addPrinter(new FilePrinter("End-Of-Day-Report.txt"));

        printer.print(endOfDayReport.buildReport());
    }
}
