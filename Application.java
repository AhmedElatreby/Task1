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
        System.out.println("-----------------------------------------");
        
        // Declaring account type
        System.out.println("This is the " + checking.getAccountType());

        // add £100 to the checking account
        checking.setBalance(100);

        // Display account details
        System.out.println(checking.accountDetails());

        // Displaying saving account balance
        System.out.println(checking.getStringBalance());

        // withdraw £3050
        checking.withdraw(50);

        // Declare user withdwan money
        System.out.println(checking.overdrwan());

        // declear user deposit £300
        checking.deposit(-300);

        // Displaying saving account balance
        System.out.println(checking.getStringBalance());

        // Declare user withdwan money
        System.out.println(checking.overdrwan());

        // Test the Savings Account class
        SavingAccount saving = new SavingAccount("Ahmed El-Atreby", "5002658");
        System.out.println("-----------------------------------------");

        System.out.println("This is the " + saving.getAccountType()+"\n");

        // add £100 to the checking account
        saving.setBalance(0);

        // Display account details
        System.out.println(saving.accountDetails());

        // Displaying saving account balance
        System.out.println(saving.getStringBalance());

        // add interest
        saving.addInterest();

        // Displaying saving account balance
        System.out.println(saving.getStringBalance());

        // withdraw £3050
        saving.withdraw(1000);
        System.out.println("-----------------------------------------");
    }
}