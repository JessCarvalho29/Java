// The purpose of this class is to create new objects using the class ChequingAccount

public class ChequingAccountTestHarness {
    public static void main(String[] args) {

        // Instantiating a new ChequingAccount object and passing the appropriate arguments:
        ChequingAccount check1 = new ChequingAccount("Jessica", "Carvalho", 3.15, 123456);

        // Printing the state of each argument of the object:
        System.out.println("Checking account: " + check1.getAccountNumber());
        System.out.println("First name: " + check1.getFirstName());
        System.out.println("Last name: " + check1.getLastName());
        System.out.println("Balance: " + check1.getBalance());

        // Using method get to change the first and last name of the check1:
        check1.setFirstName("Julia");
        check1.setLastName("Silva");

        // Printing the state of each argument of the object to show updated values:
        System.out.println("Checking account: " + check1.getAccountNumber());
        System.out.println("First name: " + check1.getFirstName());
        System.out.println("Last name: " + check1.getLastName());
        System.out.println("Balance: " + check1.getBalance());

    }
}
