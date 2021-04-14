package jbelow.springsalesreportingtool.iface;

import jbelow.springsalesreportingtool.Sale;

public interface ShippingPolicy {

    double getShippingCost(Sale sale);

}
