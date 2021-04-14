package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();

        try(BufferedReader in = new BufferedReader(new FileReader("src/main/java/jbelow/springsalesreportingtool/sales.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                String[] index = str.split(",");

                String customer = index[0];
                String country = index[1];
                double amount = Double.parseDouble(index[2]);
                double tax = Double.parseDouble(index[3]);

                salesList.add(new Sale(customer, country, amount, tax));

            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }

        return salesList;
    }
}
