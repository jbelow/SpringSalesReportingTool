package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.Sale;
import jbelow.springsalesreportingtool.iface.ShippingPolicy;

public class ShippingPolicy_FlatRate implements ShippingPolicy {

    @Override
    public double getShippingCost(Sale sale) {
        return 8;
    }
}
