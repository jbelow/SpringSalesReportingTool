package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.SalesReport;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalesReport_Summary implements SalesReport {

    //TODO this isn't really the best way or the right way of doing this.
    ShippingPolicy shippingPolicy = new ShippingPolicy_FlatRate();
//    private double shippingCost;

    @Override
    public void generateReport(List<Sale> salesList) {
        double totalAmount = 0;
        double totalTax = 0;
        double totalShipping = 0;
        salesList.sort(Comparator.comparing(Sale::getCountry));

        System.out.println("SALES SUMMARY REPORT");
        System.out.printf("%-20s %-10s %-10s %-10s \n", "Country", "Amount", "Tax", "Shipping");
//        for (Sale sale : salesList) {
        String country = null;
        for (int i = 0; i < salesList.size(); i++) {

            if (country == salesList.get(i).getCountry() || country == null) {
                country = salesList.get(i).getCountry();
                totalAmount =+ salesList.get(i).getAmount();
                totalTax =+ salesList.get(i).getTax();
                totalShipping =+ shippingPolicy.getShippingCost(salesList.get(i));

                System.out.printf("%-20s %-10s %-10s %-10s\n", salesList.get(i).getCountry(),
                        salesList.get(i).getAmount(), salesList.get(i).getTax(), shippingPolicy.getShippingCost(salesList.get(i)));
            } else {
                List<Sale> summary;

                summary.add(totalAmount, totalTax, totalShipping)
            }



        }
    }
}
