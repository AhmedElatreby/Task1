public class Application
{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("test");
         // Test the Checking Account class
         CheckingAccount checking = new CheckingAccount("Rab Rambo", "696969");
         System.out.println("-----------------------------------------");
         System.out.println("This is the " + checking.getAccountType());
         checking.setBalance(100);
         System.out.println(checking.accountDetails());
         System.out.println(checking.getStringBalance());
         checking.withdraw(4000);
         System.out.println(checking.overdrwan());
         checking.deposit(300);
         System.out.println(checking.getStringBalance());
         System.out.println(checking.overdrwan());
 
         // Test the Savings Account class
         SavingAccount saving = new SavingAccount("Ahmed El-Atreby", "5002658");
         System.out.println("-----------------------------------------");
         saving.setBalance(1000);
         System.out.println("This is the " + saving.getAccountType());
         System.out.println(saving.accountDetails());
         System.out.println(saving.getStringBalance());
         saving.addInterest();
         System.out.println(saving.getStringBalance());
         saving.withdraw(3050);
         System.out.println("-----------------------------------------");
    }
}