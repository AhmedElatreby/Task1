public interface IAccount {
    // create a getter and setter for the account
    public double getAccountBalance(); 

    public double setAccountBalance(double balance);

    // create a deposit method
    public void deposit(double moneyIn);

    // create a withdrow method
    public void withdraw(double withdrawMoney);

      // Set balance
      public void setBalance(double balance);

    // Get account details
    public String accountDetails();

    // get account type
    public AccountType getAccountType();

    // get balance formate
    public String getStringBalance();

     // get account number
     public String getAccountNumber();

}
