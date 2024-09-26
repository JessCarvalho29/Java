package week6.PayRollApp;

import week5.PayRollApp.BasePlusCommissionEmployee;
import week5.PayRollApp.CommissionEmployee;
import week5.PayRollApp.Employee;
import week5.PayRollApp.HourlyEmployee;
import week5.PayRollApp.SalariedEmployee;

public class PayRollApp {
    public static void main(String[] args) {

//        // Its not possible to create an object of an abstract class
//        Employee E1 = new Employee(101, "Jessica") {
//            @Override
//            public double earnings() {
//                return 0;
//            }
//        };
//
//        System.out.println(E1);

        // Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object.
        // By using the Upcasting, we can easily access the variables and methods of the parent class to the child class.

        // These are examples of Runtime polymorphism (Overriding the method)

        // How salary employee is not an abstract class,I can create the object
        Employee SE1 = new SalariedEmployee(101, "Jessica", 3000);
        System.out.println(SE1);
        System.out.println(SE1.earnings());

        Employee CE1 = new CommissionEmployee(102, "Tiago", 10, 2000);
        System.out.println(CE1);
        System.out.println(CE1.earnings());

        Employee HE1 = new HourlyEmployee(103, "Dafne", 41, 200);
        System.out.println(HE1);
        System.out.println(HE1.earnings());

        Employee BPCE1 = new BasePlusCommissionEmployee(104, "Mara", 10, 2000,1000);
        System.out.println(BPCE1);
        System.out.println(BPCE1.earnings());
    }
}
