package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.SalesReport;

import java.util.List;

public class SalesReport_DetailSales implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {

        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-25s %-20s %-10s %-10s %-10s\n", "Customer", "Country", "Amount", "Tax", "Shipping");
        for(int i = 0; i < salesList.size(); i++){
            System.out.printf("%-25s %-20s %-10s %-10s %-10s\n", salesList.get(i).getCustomer(), salesList.get(i).getCountry(), salesList.get(i).getAmount(), salesList.get(i).getTax(), 0);
        }
    }
}
