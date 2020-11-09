package restaurant.reports.reportDecorator;

public class ReportTitle implements Report {
    @Override
    public void decorate() {
        System.out.print("Restaurant Cafe 'Bon Appetit'");

    }

}
