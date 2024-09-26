package assignment2_200584372;

public class BankBranchSummary {

    private final int numberOfAccounts;
    private final double sumOfBalances;
    private final double avgBalance;

    public BankBranchSummary(int numberOfAccounts, double sumOfBalances, double avgBalance) {
        this.numberOfAccounts = numberOfAccounts;
        this.sumOfBalances = sumOfBalances;
        this.avgBalance = avgBalance;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public double getSumOfBalances() {
        return sumOfBalances;
    }

    public double getAvgBalance() {
        return avgBalance;
    }
}
