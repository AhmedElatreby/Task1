package BankAccounts.Code;

/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

// This is the supper class Account
// This class implements the IAccount Interface class

public abstract class Account implements IAccount {

    // Define all our main data items (attributes)
    private String accountName, accountNumber;
    protected double balance = 0;
    protected AccountType accountType;

    /**
     * Constructor method
     */
    protected Account(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    /**
     * Get the account number of the customer
     * 
     * @return String account number
     */
    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * create a getter and setter for the account
     * 
     * @return double account balance
     */
    @Override
    public double getAccountBalance() {
        return this.balance;
    }

    /**
     * @param balance set balance this will display user current balance
     */
    @Override
    public void setBalance(double balance) {
        System.out.printf("The current balance is £%.2f%n", balance);

        this.balance = balance;

    }

    /**
     * create a deposit method *
     * 
     * @param moneyIn
     * @return this will return user depositing money in and will tell user to input
     *         the correct amount of money
     */
    public boolean deposit(double moneyIn) {
        if (moneyIn >= 0) {
            this.balance += moneyIn;
        } else {
            System.err.println("Error message- figure cannot be negative");
        }
        return false;

    }

    /**
     * create method for account type
     * 
     * @return this will return the account type
     */
    @Override
    public AccountType getAccountType() {
        System.out.println("-------------------------------------");
        return this.accountType;
    }

    /**
     * create a method formate for the user
     * 
     * @return String
     */
    @Override
    public String getStringBalance() {
        return String.format("£%.2f%n", this.balance);
    }

    /**
     * Method which inform the user of withdrawing money
     * 
     * @param withdrawMoney
     */
    public void withdraw(double withdrawMoney) {
        if (this.canWithdraw(this.balance - withdrawMoney)) {
            System.out.println(String.format("You have withdrawn: " + "£%.2f", withdrawMoney));
            this.balance -= withdrawMoney;
        }
    }

    /**
     * @param balance
     * @return double this will return the balance for the user
     */
    @Override
    public void setAccountBalance(double balance) {
        this.balance = balance;

    }

    /**
     * Method to get all neccessary info of the customer
     * 
     * @return return all account information (String)
     */

    public String accountDetails() {
        return String.format("Customer Name: %s%nAccount Number: %s%nThe current balance is: £%.2f", this.accountName,
                this.accountNumber, this.balance, this.getStringBalance());
    }

    protected abstract boolean canWithdraw(double money);
}// End class Account
