package jbelow.springsalesreportingtool.iface;

import jbelow.springsalesreportingtool.Sale;

import java.util.List;

public interface SalesReport {

    void generateReport(List<Sale> salesList);

}