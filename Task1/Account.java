// This is the supper class Account
public abstract class Account implements IAccount {
    // declare variables
    private String accountName, accountNumber;
    protected double balance;
    protected AccountType accountType;

    // Constractor methods
    protected Account(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    // Get the account number of the customer
    @Override
    public String getAccountNumber() 
    {
        return this.accountNumber;
    }

    // create a getter and setter for the account
    @Override
    public double getAccountBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // create a deposit method
    public void deposit(double moneyIn) {
        this.balance += moneyIn;
    }

    // create method for account type
    @Override
    public AccountType getAccountType()
    {
        return this.accountType;
    }

    // create a method formate for the user
    @Override
    public String getStringBalance()
    {
        return String.format("%s%.2f","£", this.balance);
    }

    // create a withdrow method
    public void withdraw(double withdrawMoney) {
        if (this.canWithdraw(this.balance - withdrawMoney)) {
            System.out.println("You have withdraw money");
            this.balance -= withdrawMoney;
        }
    }

    // Get all neccessary info of the customer
    public String accountDetails() {
        return String.format("Customer Name: %s\nAccount Number: %s\nCurrent balance: %s", this.accountName,
                this.accountNumber, this.balance, this.getStringBalance());
    }

    protected abstract boolean canWithdraw(double money);

}
