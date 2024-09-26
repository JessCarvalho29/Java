// The purpose of this class is to define arguments and initialize the object ChequingAccount in another class.

public class ChequingAccount {

    // Creating the four instance variables:
    String firstName;
    String lastName;
    double balance;
    int accountNumber;

    // Creating the constructor of the ChequingAccount class that takes four arguments:
    public ChequingAccount(String firstName, String lastName, double balance, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Creating a getter and setter for the argument firstName:
    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    // Creating a getter and setter for the argument lastName:
    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public String getLastName(){

        return lastName;
    }

    // Creating a getter and setter for the argument balance:
    public void setBalance(double balance){

        this.balance = balance;
    }

    public double getBalance(){

        return balance;
    }

    // Creating a getter and setter for the argument accountNumber:
    public void setAccountNumber(int accountNumber){

        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){

        return accountNumber;
    }

}
