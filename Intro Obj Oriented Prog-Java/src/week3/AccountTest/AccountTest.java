package week3.AccountTest;

public class AccountTest {
    public static void main(String[] args){
        Account myAccount = new Account("Juliana", 100);
        Account myAccount1 = new Account("Bruna", 200);
//        syntax: className objectName = new className(parameters);

        myAccount.name = "Jessica";
//        syntax: objectName.property = value;

        System.out.println("Account Holder Name " + myAccount.name);
        System.out.println("Account1 Holder Name " + myAccount1.name);

//        myAccount.balance = 100;
//        Assign value to balance is not possible because it is private, for that, its necessary to create the get and set methods.

        myAccount.debitBalance(50);
        myAccount1.debitBalance(70);

        myAccount.setBalance(1000);
        myAccount1.setBalance(2000);

        System.out.println("Account Balance " + myAccount.getBalance());
        System.out.println("Account1 Balance " + myAccount1.getBalance());

        // Way 1
        double creditBalace = myAccount.creditBalance(100);
        System.out.println("New Account Balance " + creditBalace);

        // Way 2
        myAccount1.debitBalance(100);
//        System.out.println("New Account1 Balance " + myAccount1.getBalance());

        myAccount.loanInterestCalculation(5000);

        myAccount.addBonus();
    }
}
