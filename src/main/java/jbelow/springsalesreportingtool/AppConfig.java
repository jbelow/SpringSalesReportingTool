package jbelow.springsalesreportingtool;

import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.ReportOutput;
import jbelow.springsalesreportingtool.iface.SalesReport;
import jbelow.springsalesreportingtool.impl.FileInput;
import jbelow.springsalesreportingtool.impl.ReportOutput_Console;
import jbelow.springsalesreportingtool.impl.SalesReport_DetailSales;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("jbelow.springsalesreportingtool")
public class AppConfig {
//    @Bean
//    public ShippingPolicy FreeShipping() {
//        return new FreeShipping();
//    }

    @Bean
    public ReportOutput ConsoleOutput() {
        return new ReportOutput_Console();
    }

    @Bean
    public SalesInput FileInput() {
        return  new FileInput();
    }

    @Bean
    public SalesReport DetailSales(){
        return new SalesReport_DetailSales();
    }


}
