package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;

public class ShippingPolicy_FreeOverX implements ShippingPolicy {

    @Override
    public double getShippingCost(Sale sale) {

        double shipping;
        if (sale.getAmount() > 50) {
            shipping = 0;
        }
        else {
            shipping = 8;
        }

        return shipping;
    }
}
