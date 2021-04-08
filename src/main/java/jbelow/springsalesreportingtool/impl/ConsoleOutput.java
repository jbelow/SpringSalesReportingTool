package jbelow.springsalesreportingtool.impl;

import jbelow.springsalesreportingtool.iface.SalesOutput;


public class ConsoleOutput implements SalesOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
