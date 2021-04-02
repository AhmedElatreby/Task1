import BankAccounts.Code.CheckingAccount;
import BankAccounts.Code.SavingAccount;

/**
 * PURPOSE OF PROJECT: The Bank offers its customers two types of account – a
 * Checking Account and a Savings Account. A Checking Account can be overdrawn
 * (the balance can be less than zero) but a Savings Account cannot. At the end
 * of each month interest is calculated on the amount in the savings account.
 * The interest is added to the balance.
 * 
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public class Application {
    // Main () method. Bank Account
    // Will run from this point

    public static void main(String[] args) {

        // Test the Checking Account class
        CheckingAccount checking = new CheckingAccount("Ahmed El-Atreby", "696969");

        // Declaring account type
        System.out.println("This is the " + checking.getAccountType());
        // add £100 to the checking account
        checking.setBalance(100);

        // Display account details
        System.out.println(checking.accountDetails());

        // Displaying Ckecking account balance
        System.out.println(checking.getStringBalance());

        // withdraw £150
        checking.withdraw(150);

        // Declare user withdwan money
        System.out.println(checking.overdrawn());

        // declear user deposit £200
        checking.deposit(200);

        // Displaying Ckecking account balance
        System.out.println(checking.getStringBalance());

        // Declare user withdwan money
        System.out.println(checking.overdrawn());

        /*
         * testing saving account
         */
        // Create Savings Account class object
        SavingAccount saving = new SavingAccount("Ahmed El-Atreby", "5002658");

        // declear account type
        System.out.println("This is the " + saving.getAccountType());

        // add £100 to the checking account
        saving.setBalance(10);

        // Display account details
        System.out.println(saving.accountDetails());

        // Displaying saving account balance
        System.out.println(saving.getStringBalance());

        // add interest
        saving.addInterest();

        // Displaying saving account balance
        System.out.println(saving.getStringBalance());

        // withdraw £1000
        saving.withdraw(1000);
    }
}// End class Application