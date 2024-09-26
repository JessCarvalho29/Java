package assignment2_200584372;

public class Account {

    private String accountNumber;
    private double accountBalance;
    private String accountName;

    public Account(String accountNumber, double accountBalance, String accountName) throws IllegalArgumentException {

//        https://www.baeldung.com/java-check-string-contains-only-letters-numbers#:~:text=Alphanumeric%20characters%20are%20a%20combination,as%20part%20of%20Alphanumeric%20characters.
        if(!accountNumber.matches("^[a-zA-Z0-9]*$")){
            throw new IllegalArgumentException("Account Number only can have alphanumerical characters");
        } else {
            this.accountNumber = accountNumber;
        }

        if(accountBalance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        } else {
            this.accountBalance = accountBalance;
        }

        if(!accountName.matches("^[a-zA-Z- ]*$")){
            throw new IllegalArgumentException ("Account Name only can have alphabetical characters");
        }
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if(!accountNumber.matches("^[a-zA-Z0-9]*$")){
            throw new IllegalArgumentException("Account Number only can have alphanumerical characters");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance < 0){
            throw new ArithmeticException("Balance cannot be negative");
        } else {
            this.accountBalance = accountBalance;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        if(!accountName.matches("^[a-zA-Z- ]*$")){
            throw new IllegalArgumentException ("Account Name only can have alphabetical characters");
        }
        this.accountName = accountName;
    }





}
