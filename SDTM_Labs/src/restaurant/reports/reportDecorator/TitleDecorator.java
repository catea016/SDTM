package restaurant.reports.reportDecorator;

abstract public class TitleDecorator implements Report {
    protected Report report;

    public TitleDecorator(Report report){
        this.report = report;
    }

    @Override
    public void decorate() {
        report.decorate();
    }

    public void newOperation(){
        System.out.println("End of Day Report");
    }
}
