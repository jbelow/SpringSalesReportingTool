package jbelow.springsalesreportingtool.impl;


import jbelow.springsalesreportingtool.iface.ReportOutput;

public class ReportOutput_Console implements ReportOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
