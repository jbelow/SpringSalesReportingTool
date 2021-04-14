package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.SalesReport;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;

import java.util.List;

public class SalesReport_DetailSales implements SalesReport {

    //TODO this isn't really the best way or the right way of doing this.
    ShippingPolicy shippingPolicy = new ShippingPolicy_FlatRate();
//    private double shippingCost;

    @Override
    public void generateReport(List<Sale> salesList) {

        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-25s %-20s %-10s %-10s %-10s\n", "Customer", "Country", "Amount", "Tax", "Shipping");
//        for (Sale sale : salesList) {
        for (int i = 0; i < salesList.size(); i++) {
//            shippingCost = shippingPolicy.getShippingCost(salesList.get(i));
            System.out.printf("%-25s %-20s %-10s %-10s %-10s\n", salesList.get(i).getCustomer(), salesList.get(i).getCountry(), salesList.get(i).getAmount(), salesList.get(i).getTax(), shippingPolicy.getShippingCost(salesList.get(i)));
        }
    }
}
