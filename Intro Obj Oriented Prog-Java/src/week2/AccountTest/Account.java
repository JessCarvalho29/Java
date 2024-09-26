package week2.AccountTest;

public class Account {

    public String name;
    private double balance;

//    this. = means the current object (will be replaced with the name of the current object)

//    Constructor is the object initialization
    public Account(String name, double balance){
        this.name = name;
        if(balance >= 0) {
            this.balance = balance;
        }
    }

    public void setName(String updatedName){
        this.name = updatedName;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return balance;
    }

    // Way 1
    public double creditBalance(double amount){
        if(amount >= 0) {
            balance = balance + amount;
        }
        return balance;
    }

    // Way 2
    public void debitBalance(double amount){
        if(balance >= amount && amount >= 0) {
            balance = balance - amount;
            System.out.println("Balance after debit: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
