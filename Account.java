/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */
// This is the supper class Account
public abstract class Account implements IAccount {
    // Define all our main data items (attributes)
    private String accountName, accountNumber;
    protected double balance;
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
     * @return String
     */
    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * create a getter and setter for the account
     * 
     * @return double
     */
    @Override
    public double getAccountBalance() {
        return this.balance;
    }

    /**
     * @param balance set balance
     */
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * create a deposit method
     * 
     * 
     * @param moneyIn
     */
    public void deposit(double moneyIn) {
        this.balance += moneyIn;
    }

    /**
     * create method for account type
     * 
     * @return AccountType
     */
    @Override
    public AccountType getAccountType() {
        return this.accountType;
    }

    /**
     * create a method formate for the user
     * 
     * @return String
     */
    @Override
    public String getStringBalance() {
        return String.format("%s%.2f", "£", this.balance);
    }

    /**
     * Method which inform the user of withdrawing money
     * 
     * @param withdrawMoney
     */
    public void withdraw(double withdrawMoney) {
        if (this.canWithdraw(this.balance - withdrawMoney)) {
            System.out.println("You have withdraw money");
            this.balance -= withdrawMoney;
        }
    }

    /**
     * Method to get all neccessary info of the customer
     * 
     * @return return all account information (String)
     */

    public String accountDetails() {
        return String.format("Customer Name: %s\nAccount Number: %s\nCurrent balance: %s", this.accountName,
                this.accountNumber, this.balance, this.getStringBalance());
    }

    protected abstract boolean canWithdraw(double money);
}// End class Account
