package model.service;

public class BrasilTaxService implements TaxService{

    public double tax(double amount) {
        double total;
        if(amount <= 100.00) {
            total = amount * 0.2;
        } else {
            total = amount * 0.15;
        }
        return total;
    }
}
