package week6.PayRollApp;

import week5.PayRollApp.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // How this is a subclass it is necessary to have the properties of the superclass in the constructor of this class,
    // as well as the properties of this class
    public SalariedEmployee(int id, String name, double weeklySalary) {
        super(id, name);
        this.weeklySalary = weeklySalary;
    }

    // How my superclass is abstract, I have to implement the abstract method in this subclass
    @Override
    public double earnings() {
        // Defining what this class will return to the abstract method earnings() for this subclass
        return weeklySalary;
    }

    // Overriding the toString method of the super class, taking the predefined values (with super.toString()) and
    // adding the values of this class (using String.format)
    @Override
    public String toString(){
        return super.toString() + String.format(", Weekly Salary: %.2f", weeklySalary);
    }


}
