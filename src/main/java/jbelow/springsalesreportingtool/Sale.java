package jbelow.springsalesreportingtool;

public class Sale {
    //Customer, Country, Amount, Tax, Shipping
    private String customer;
    private String country;
    private double amount;
    private double tax;

    public Sale(String customer, String country, double amount, double tax) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
}
