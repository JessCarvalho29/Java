public class PatientTest {
    public static void main(String[] args){

        Patients patient1 = new Patients("Mark", 65, 100);
        Patients patient2 = new Patients("Elis", 30, 200);

        System.out.println("Patient 1: ");
        System.out.println("Name: " + patient1.getName());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Bill to pay: " + patient1.getBillToPay());
        System.out.println("Bill to pay with discount: " + patient1.discount());

        System.out.println("Patient 2: ");
        System.out.println("Name: " + patient2.getName());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Bill to pay: " + patient2.getBillToPay());
        System.out.println("Bill to pay with discount: " + patient2.discount());

    }

}
