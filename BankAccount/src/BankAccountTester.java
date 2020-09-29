
public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount(1000); //invokes BankAccount code lines 12-15
		myBankAccount.withdraw(500); //runs BankAccount code lines 31-34
		myBankAccount.deposit(1500); //runs BankAccount code lines 21-24
		System.out.println ("Created new Bank Account 'myBankAccount'. ");
		System.out.println ("Deposited $1,000 into myBankAccount.");
		System.out.println ("Withdrew $500 from myBankAccount.");
		System.out.println ("Deposited $1,500 into myBankAccount.");
		System.out.println ("Your total balance is $" +myBankAccount.getBalance());
		
	}

}
