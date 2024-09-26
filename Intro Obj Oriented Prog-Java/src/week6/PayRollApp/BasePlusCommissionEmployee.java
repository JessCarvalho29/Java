package week6.PayRollApp;

import week5.PayRollApp.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(int id, String name, double commissionRate, double grossSales, double baseSalary) {
        super(id, name, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Base Salary: %.2f", baseSalary);
    }


}
