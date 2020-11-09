package restaurant.reports;

import restaurant.OrderBook;

public class Report {

    ReportAdapter adapter;

    public String buildReport() {
        StringBuilder report = new StringBuilder();

        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            report.append(adapter.getItem(i).line);
            report.append("\n");
        }

        return report.toString();
    }

    public void setAdapter(ReportAdapter adapter) {
        this.adapter = adapter;
    }

    public static class ReportItem {
        String line;
    }

}
