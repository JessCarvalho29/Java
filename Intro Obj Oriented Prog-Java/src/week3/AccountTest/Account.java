package week3.AccountTest;

import java.util.Random;

public class Account {

    public String name;
    private double balance;
    private static double bankFee = 2.5;
    final private double interest_rate = 0.05;

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
        this.balance = balance + newBalance;
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
        double totalAmount = amount + bankFee;
        if(balance >= totalAmount && totalAmount > 0) {
            balance = balance - totalAmount;
            System.out.println("Debit successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void loanInterestCalculation(double loanAmount){
        if(loanAmount < 0){
            System.out.println("Loan amount must be positive");
            return;
        }

        double interest = loanAmount * interest_rate;
        double totalAmountToBeRepaid = loanAmount + interest;

        System.out.println("Loan amount: " + loanAmount);
        System.out.println("Interest rate: " + interest_rate * 100 + "%");
        System.out.println("Interest amount: " + interest);
        System.out.println("Total amount to be repaid: " + totalAmountToBeRepaid);
    }

    public void addBonus(){
        /* Generate random values between 0.0 and 1.0
            1. Creating the object of the Random Class
            2. Using a method of the static Math Class
        */

        Random random = new Random();
        //double random = Math.random();
        int bonus;

        // Maximum bonus value: 200
        bonus = random.nextInt(201);
        // bonus = (int) (random * 201);

        if(bonus > 0){
            balance += bonus;
            System.out.println("Congratulations!! Bonus added: " + bonus);
            System.out.println("Total balance after adding bonus: " + balance);
        } else {
            System.out.println("No bonus received.");
        }
    }



}
