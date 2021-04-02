package BankAccounts.Code;

/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

// This is the child class Checking Account extends from Account class
public class CheckingAccount extends Account {

    public CheckingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.CHECKING_ACCOUNT;
    }

    /**
     * set a limet for the amount user can withdraw to £5000
     * 
     * @param money
     * @return boolean this will sit a limet for the user to not go over £5000 for
     *         overdraft
     */
    @Override
    protected boolean canWithdraw(double money) {
        if (money > -5000) {
            return true;
        } else {
            System.out.println("Unable to complete transection due to insufficient credit");
            return false;
        }
    }

    /**
     * create a methos checking account can overdrawn
     * 
     * @return this will retrn a String telling the user the stated of the account
     *         if overdrawn or not
     */

    public String overdrawn() {
        if (this.getAccountBalance() < 0) {
            return String.format("You are £%.2f overdrawn", this.getAccountBalance());
        } else {
            return "You are not overdrawn";
        }
    }

}// End class CheckingAccount