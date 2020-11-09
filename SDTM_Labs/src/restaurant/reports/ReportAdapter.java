package restaurant.reports;

public interface ReportAdapter {
    int getCount();

    Report.ReportItem getItem(int itemCount);
}
