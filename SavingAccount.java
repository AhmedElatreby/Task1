public class SavingAccount extends Account {

    public SavingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.CHECKING_ACCOUNT;
    }

    
    /** 
     * @return double
     */
    // Create a method to add 10% interest to saving account
    public double addInterest() {
        deposit(this.getAccountBalance() * 0.1);
        return balance;
    }

  
    
    /** 
     * @param money
     * @return boolean
     */
    // create a method saving account cannot overdraw
    @Override
    public boolean canWithdraw(double money) {
        if (money < 0) {
            System.err.println("Unable to complete transection due to insufficient credit");
            return false;
        } else {
            return true;
        }

    }

    
    /** 
     * @param balance
     * @return double
     */
    @Override
    public double setAccountBalance(double balance) {
        // TODO Auto-generated method stub
        return 0;
    }

}
