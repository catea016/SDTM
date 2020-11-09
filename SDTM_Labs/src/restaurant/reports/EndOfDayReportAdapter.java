package restaurant.reports;

import restaurant.OrderBook;
import restaurant.reports.reportDecorator.ArrangeTitleToMiddle;
import restaurant.reports.reportDecorator.ReportTitle;
import restaurant.reports.reportDecorator.SeparateTitle;
import restaurant.reports.reportDecorator.TitleDecorator;

public class EndOfDayReportAdapter implements ReportAdapter {
    private final OrderBook orderBook;

    public EndOfDayReportAdapter(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    @Override
    public Report.ReportItem getItem(int itemCount) {
        Report.ReportItem item = new Report.ReportItem();
        switch (itemCount) {
            case 0:
                item.line = createItem(itemCount);
                break;
            case 1:
                item.line = "Totals: " + orderBook.getGrandTotal();
                break;
        }

        return item;
    }

    private String createItem(int itemCount) {
        return "Fish and seafood: 150 lei" +
           "\n" + "Bifana sandwich with pork (x3): 80 lei" +
            "\n" + "Tuna salad (x8) : 30 lei" +
            "\n" + "Caesar salad (x5): 30 lei" +
            "\n" + "Greek salad (x3): 30 lei" +
            "\n" + "Pasta Carbonara (x10): 80 lei" +
            "\n" + "Chicken ravioli (x3): 60 lei" + "\n";
    }

    @Override
    public int getCount() {
        return 3;
    }

}
