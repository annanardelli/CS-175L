import java.util.Scanner;

public class BankThreshold {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to start your account: $");
		double newAmt = input.nextDouble();
		System.out.println ("Enter interest value (decimal):");
		double newInt =input.nextDouble();
		BankAccount myBankAccount = new BankAccount(newAmt, newInt);
		System.out.print("Please enter a threshold: ");
		while (input.hasNextDouble()) {
			double balance = input.nextDouble();
			int months = 0;
			while (myBankAccount.getBalance() <balance) {
				myBankAccount.interest();
				months++;
			}
		System.out.println("The threshold will be exceeded in "+months+" months.");
		System.out.println("The balance is $"+myBankAccount.getBalance());
		System.out.print("Please enter a threshold: $");
		}
		System.out.println("Invalid Input.");
		input.close();
		
			}
		
		}
