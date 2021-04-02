package BankAccounts.Code;

/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

// This is the child class Saving Account extends from Account class
public class SavingAccount extends Account {

    public SavingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.SAVINGS_ACCOUNT;
    }

    /**
     * Method to add 10% interest to saving account
     * 
     * @return double this will return the amount of interest for the user
     */
    public double addInterest() {
        System.out.println(String.format("Interest: " + "£%.2f", this.getAccountBalance() * 0.1));
        deposit(this.getAccountBalance() * 0.1);
        return balance;
    }

    /**
     * Method for saving account unable to withdraw money
     * 
     * @param money
     * @return boolean this will inform the user that a savings account cannot
     *         overdraw
     */
    @Override
    public boolean canWithdraw(double money) {
        if (money < 0) {
            System.err.println("Error message- Savings account cannot overdrawn ");
            return false;
        } else {
            return true;
        }
    }

}// End class SavingAccount
