public class CheckingAccount extends Account {

    protected CheckingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.CHECKING_ACCOUNT;
    }

    // set a limet for the amount user can withdraw
    @Override
    protected boolean canWithdraw(double money) {
        if (money > -5000) {
            return true;
        } else {
            System.out.println("Unable to complete transection due to insufficient credit");
            return false;
        }
    }

    // create a methos checking account can overdrawn
   
    public String overdrwan() {
        if (this.getAccountBalance() < 0) {
            return String.format("You are £%.2f overdrawn", this.getAccountBalance() * -1);
        } else {
            return "you are not overdrwan";
        }
    }

    @Override
    public double setAccountBalance(double balance) {
        // TODO Auto-generated method stub
        return 0;
    }

}