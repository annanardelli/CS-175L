import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter amount to start your account: $");
		double newAmt = input.nextDouble();
		System.out.println ("Enter interest value (decimal):");
		double newInt =input.nextDouble();
		BankAccount myBankAccount = new BankAccount(newAmt); //invokes BankAccount code lines 12-15
		System.out.println ("Created new Bank Account 'myBankAccount' with an interest of " +newInt+".");
		System.out.println ("Deposited $"+newAmt+" into myBankAccount.");
		System.out.println ("Please enter an amount to deposit: $");
		double depAmount = input.nextDouble();
		myBankAccount.deposit(depAmount); //runs BankAccount code lines 21-24
		System.out.println("Deposited "+depAmount+" into myBankAccount");
		System.out.println ("Please enter an amount to withdraw: $");
		double amount= input.nextDouble();
		myBankAccount.withdraw(amount); //runs BankAccount code lines 31-34
		System.out.println ("Withdrew $"+amount+" from myBankAccount.");
		System.out.println ("Your current balance is $"+myBankAccount.getBalance()+".");
		myBankAccount.interest(newInt);
		System.out.println ("Your balance after 1 year will be $" +myBankAccount.getBalance()+".");
		input.close();
	}
}