package BankAccounts.Code;

/**
 * An Interface Class for all accounts
 * 
 * Copyright (c) Bournemouth University
 *
 * @author Ahmed El-Atreby
 * @version 1.0
 */

public interface IAccount {

  /**
   * Method to get account balance
   */
  public double getAccountBalance();

  /**
   * Method to set account balance
   */
  public void setAccountBalance(double balance);

  /**
   * Method to deposit money
   */
  public boolean deposit(double moneyIn);

  /**
   * Method to withdraw money
   */
  public void withdraw(double withdrawMoney);

  /**
   * Method to set account balance
   */
  public void setBalance(double balance);

  /**
   * Method to get account details
   */
  public String accountDetails();

  /**
   * Method to get account type
   */
  public AccountType getAccountType();

  /**
   * Method to get balance format
   */
  public String getStringBalance();

  /**
   * Method to get account number
   */
  public String getAccountNumber();

}// End class IAccount
