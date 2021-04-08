package jbelow.springsalesreportingtool;

import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.SalesOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ReportingStart {

//    private ShippingPolicy policy;
    private SalesOutput output;
    private SalesInput input;

    @Autowired
    public ReportingStart(SalesOutput output, SalesInput input) {
//        this.policy = policy;
        this.output = output;
        this.input = input;
        System.out.println("ReportingStart created");

    }


    public void run() {
//        System.out.println("stuff " + checkShippingPolicy() + " and things ");

        System.out.println("Testing");
        System.out.println(input.getSales());
        for (int i = 0; i < input.getSales().size(); i++) {
            System.out.println(input.getSales().get(i));
        }


    }

//    private double checkShippingPolicy(){
//        return policy.getShippingCost();
//    }

//    private void formatSalesList() throws IOException {
//        List<String> sale;
//        try (Stream<String> lines = Files.lines(Paths.get("src/main/java/jbelow/springsalesreportingtool/sales.txt"))) {
//            sale = lines.collect(Collectors.toList());
//        }
//        for(int i=0;i<sale.size();i++){
//            System.out.println(sale.get(i));
//        }
//    }
}
