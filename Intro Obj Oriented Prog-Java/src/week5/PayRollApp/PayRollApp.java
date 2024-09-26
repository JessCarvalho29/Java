package week5.PayRollApp;

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
