package week6.PayRollApp;

import week5.PayRollApp.Employee;

public class HourlyEmployee extends Employee {
    private double workedHours;
    private double hourlyWage;

    public HourlyEmployee(int id, String name, double workedHours, double hourlyWage) {
        super(id, name);
        this.workedHours = workedHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double earnings() {
        double salary;
                
        if(workedHours <= 40) {
            salary = hourlyWage * workedHours;
        } else {
            salary = 40 * hourlyWage + (workedHours - 40) * hourlyWage * 1.5;
        }
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Hourly Wage: %.2f, Worked Hours: %.1f", hourlyWage, workedHours);
    }

}
