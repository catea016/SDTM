package restaurant.reports.printer;

import restaurant.reports.reportDecorator.ArrangeTitleToMiddle;
import restaurant.reports.reportDecorator.ReportTitle;
import restaurant.reports.reportDecorator.SeparateTitle;
import restaurant.reports.reportDecorator.TitleDecorator;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private final String fileName;

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(String log) throws IOException {
        FileWriter report = new FileWriter(fileName);
        TitleDecorator decorator = new SeparateTitle(new ArrangeTitleToMiddle(new ReportTitle()));
        report.write(log);
        report.close();
        System.out.println("Successfully wrote to the file.");
    }
}
