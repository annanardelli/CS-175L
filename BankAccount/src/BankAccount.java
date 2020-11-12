/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestPct;
   /**
      Constructs a bank account with zero balance.
   */
   
   
   public BankAccount(double amount, double interest)
   {
      balance = amount;
      interestPct = interest;
   }
   
   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
 * @return 
   */
   public double withdraw(double amount)
   {
	   if (amount>balance) System.out.println("Insufficient Funds");
	   else balance = balance - amount;
	return balance;
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   
   public double interest()
   {
	return balance= balance+(balance*interestPct);
	   
   }
   
   
   public double getBalance()
   {
      return balance;
   }

}
