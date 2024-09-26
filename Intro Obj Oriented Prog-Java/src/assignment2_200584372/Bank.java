package assignment2_200584372;

import java.util.Collection;
import java.util.HashMap;

public class Bank {

    private final String bankName;
    private final BranchLocation branchLocation;

    public Bank(String bankName, BranchLocation branchLocation) throws IllegalArgumentException {
        if (!bankName.matches("^[a-zA-Z0-9]*$")) {
            throw new IllegalArgumentException("Bank Name only can have alphanumerical characters");
        } else {
            this.bankName = bankName;
        }

        this.branchLocation = branchLocation;

    }

//    https://www.w3schools.com/java/java_hashmap.asp
    private final HashMap<String, Account> accounts = new HashMap<>();

    public void addAccount(String accountNumber, double accountBalance, String accountName){
        if (accounts.containsKey(accountNumber)){
            throw new IllegalArgumentException("Account number already exists");
        }
        var account = new Account(accountNumber, accountBalance, accountName);
        accounts.put(account.getAccountNumber(), account);
    }

    public String getBankName() {
        return bankName;
    }

    public BranchLocation getBranchLocation() {
        return branchLocation;
    }

    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }

    public void deleteAccount(String accountNumber){
        accounts.remove(accountNumber);
    }

    public Collection<Account> viewAccounts(){
        return accounts.values();
    }

    public BankBranchSummary getSummary(){
        var numberOfAccounts = accounts.values().size();
//        var sumOfBalances = accounts.values().stream().mapToDouble(Account::getAccountBalance).sum();

        var sumOfBalances = 0.0;
        for (Account account : accounts.values()){
            sumOfBalances += account.getAccountBalance();
        }

        var avgBalance = sumOfBalances / numberOfAccounts;

        return new BankBranchSummary(numberOfAccounts, sumOfBalances, avgBalance);

    }





}
