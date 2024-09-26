package week6.PayRollApp;

import week5.PayRollApp.Employee;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(int id, String name, double commissionRate, double grossSales) {
        super(id, name);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }


    @Override
    public double earnings() {
        return grossSales * (commissionRate / 100.0);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Gross Sales: %.2f, Commission Rate: %.2f%%", grossSales, commissionRate);
    }
}
