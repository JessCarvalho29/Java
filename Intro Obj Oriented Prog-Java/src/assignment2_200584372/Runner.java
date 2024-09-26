package assignment2_200584372;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Welcome to the system");
        createBank();

    }


    public static void createBank(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert a bank name: ");
        String bankNameInput = scanner.nextLine();
        boolean isValidLocation = true;
        BranchLocation bankLocationInput = null;

        try {
            System.out.print("Please, insert a bank location: \nToronto\nMississauga\nMilton\nNiagara\n");
            bankLocationInput = BranchLocation.valueOf(scanner.next());
        }
        catch (Exception e){
            System.out.println("Exception occurs: " + e.getMessage());
            isValidLocation = false;
        }
        finally {
            if(!isValidLocation){
                System.out.print("Please, insert a valid bank location: \nToronto\nMississauga\nMilton\nNiagara\n");
                bankLocationInput = BranchLocation.valueOf(scanner.next());
            }
        }

        Bank bank = new Bank(bankNameInput, bankLocationInput);
        systemsFunctions(bank);
    }


    public static void systemsFunctions(Bank bank){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a numeric option: \n1 - Add Account\n2 - View Account Details\n3 - Delete Account\n4 - Summary\n5 - View All Account Details\n");
        int optionUserInput = scanner.nextInt();
        scanner.nextLine();

        if(optionUserInput < 0 || optionUserInput > 5){
            System.out.println("Please choose a valid option: \n1 - Add Account\n2 - View Account Details\n3 - Delete Account\n4 - Summary\n5 - View All Account Details\n");
            optionUserInput = scanner.nextInt();
            scanner.nextLine();
        }

        if(optionUserInput == 1){
            System.out.println("Inform the account number:");
            String accountNumberInput = scanner.nextLine();

            if(!accountNumberInput.matches("^[a-zA-Z0-9]*$")){
                System.out.println("Please insert a valid account number: ");
                accountNumberInput = scanner.nextLine();
            }

            System.out.println("Inform the account Name:");
            String accountNameInput = scanner.nextLine();

            if(!accountNameInput.matches("^[a-zA-Z- ]*$")){
                System.out.println("Please insert a valid account name: ");
                accountNameInput = scanner.nextLine();
            }

            System.out.println("Inform the account balance:");
            double balanceInput = scanner.nextDouble();
            scanner.nextLine();

            if(balanceInput < 0) {
                System.out.println("Please insert a valid balance:");
                balanceInput = scanner.nextDouble();
                scanner.nextLine();
            }

            if(accountNumberInput.matches("^[a-zA-Z0-9]*$") && balanceInput >= 0 && accountNameInput.matches("^[a-zA-Z- ]*$")){
                var account = new Account(accountNumberInput, balanceInput, accountNameInput);
                bank.addAccount(accountNumberInput, balanceInput, accountNameInput);
                System.out.println("Account created successfully!");
                System.out.println("\n");
            }


        } else if(optionUserInput == 2){
            System.out.println("Inform the account number:");
            String accountNumberInput = scanner.nextLine();

            var account = bank.getAccount(accountNumberInput);

            if(account != null) {
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Name: " + account.getAccountName());
                System.out.println("Balance: " + account.getAccountBalance());
                System.out.println("\n");
            } else {
                System.out.println("Account does not exist");
                System.out.println("\n");
                systemsFunctions(bank);
            }


        } else if(optionUserInput == 3) {
            System.out.println("Inform the account number to delete:");
            String accountNumberInput = scanner.nextLine();

            var account = bank.getAccount(accountNumberInput);

            if(account == null) {
                System.out.println("Account does not exist");
                System.out.println("\n");
            } else {
                System.out.printf("Do you confirm the deletion of account %s? \nPlease insert Y or N\n", accountNumberInput);
                char deleteConfirmation = scanner.next().charAt(0);
                scanner.nextLine();

                if (Character.toLowerCase(deleteConfirmation) == 'y') {
                    bank.deleteAccount(accountNumberInput);
                    System.out.println("The account was deleted successfully!");
                    System.out.println("\n");
                } else {
                    System.out.println("The account was not deleted");
                    System.out.println("\n");
                }
            }

        } else if (optionUserInput == 4) {
            var summary = bank.getSummary();

            if (Double.isNaN(summary.getAvgBalance())) {
                System.out.println("Number of accounts: " + summary.getNumberOfAccounts());
                System.out.println("Average balance: 0.0");
                System.out.println("\n");
            } else {
                System.out.println("Number of accounts: " + summary.getNumberOfAccounts());
                System.out.printf("Average balance: %.2f\n", summary.getAvgBalance());
                System.out.println("\n");
            }

        } else if (optionUserInput == 5) {
            var accounts = bank.viewAccounts();

            if(!accounts.isEmpty()) {
                for (Account account : accounts) {
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Account Name: " + account.getAccountName());
                    System.out.println("Balance: " + account.getAccountBalance());
                    System.out.println("\n");
                }
            } else {
                System.out.println("There are no accounts");
                System.out.println("\n");
            }
        }

        System.out.println("Please choose an option: \n1 - Continue in this menu\n2 - Create a new Bank\n3 - Finish");
        int menuUserOption = scanner.nextInt();
        scanner.nextLine();

        if(menuUserOption < 0 || menuUserOption > 3){
            System.out.println("Please choose a valid option: \n1 - Continue in this menu\n2 - Create a new Bank\n3 - Finish");
            menuUserOption = scanner.nextInt();
            scanner.nextLine();
        }

        if(menuUserOption == 1) {
            systemsFunctions(bank);
        } else if (menuUserOption == 2) {
            createBank();
        } else if (menuUserOption == 3){
            System.out.println("Process finished");
        }

    }


}
