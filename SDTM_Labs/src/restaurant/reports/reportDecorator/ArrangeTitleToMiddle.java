package restaurant.reports.reportDecorator;

public class ArrangeTitleToMiddle extends TitleDecorator {
    public ArrangeTitleToMiddle(Report report) {
        super(report);
    }

    @Override
    public void decorate() {
        System.out.print("                                      -->   ");
        super.decorate();
        System.out.println("  <--                                     ");
    }

    @Override
    public void newOperation() {
        System.out.print("                                      -->   ");
        super.newOperation();
        System.out.println("  <--                                     ");
    }
}
