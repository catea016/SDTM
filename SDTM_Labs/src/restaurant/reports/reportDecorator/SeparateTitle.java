package restaurant.reports.reportDecorator;

public class SeparateTitle extends TitleDecorator {
    public SeparateTitle(Report report) {
        super(report);
    }


    @Override
    public void newOperation() {
        super.newOperation();
        System.out.println("_______________________________________________________________________________________________________________________________________________________");
    }
}
