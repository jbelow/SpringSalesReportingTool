package jbelow.springsalesreportingtool;

import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.ReportOutput;
import jbelow.springsalesreportingtool.iface.SalesReport;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Shutdown;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportingStart {

//    private ShippingPolicy policy;
    private SalesReport report;
    private SalesInput input;
    private ShippingPolicy shipping;

    @Autowired
    public ReportingStart(SalesReport report, SalesInput input, ShippingPolicy shipping) {
//        this.policy = policy;
        this.report = report;
        this.input = input;
        this.shipping = shipping;
        System.out.println("ReportingStart created");

    }


    public void run() {
//        System.out.println("stuff " + checkShippingPolicy() + " and things ");

        System.out.println("Testing");
//        System.out.println(input.getSales());
        report.generateReport(input.getSales());


    }

}
