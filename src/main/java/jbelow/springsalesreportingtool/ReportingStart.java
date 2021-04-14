package jbelow.springsalesreportingtool;

import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.ReportOutput;
import jbelow.springsalesreportingtool.iface.SalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportingStart {

//    private ShippingPolicy policy;
    private SalesReport report;
    private SalesInput input;

    @Autowired
    public ReportingStart(SalesReport report, SalesInput input) {
//        this.policy = policy;
        this.report = report;
        this.input = input;
        System.out.println("ReportingStart created");

    }


    public void run() {
//        System.out.println("stuff " + checkShippingPolicy() + " and things ");

        System.out.println("Testing");
//        System.out.println(input.getSales());
        report.generateReport(input.getSales());


    }

}
