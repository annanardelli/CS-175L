
/*
 * Simulates a bank. Contains methods to withdraw, deposit, and recover current balance.
 * Set up for three customers all using the same bank location.
 * Doesn't use a scanner to accept user input because the instructions didn't call for one,
 * but could be easily added.
 * 
 */

public class BankSimulation {
	
	double balance;
	String address;
	String bankAddress;
	String name;
	
	/*
	 * Global variables so that the methods can access them.
	 */
	
	private BankSimulation (String bAddress) {
		bankAddress= bAddress;
		
		/*
		 * Constructor for an object that stores the address of the banks.
		 */
	}
	

	private BankSimulation (String customer, String homeAddress, double amount) {
		name=customer;
		address=homeAddress;
		balance=amount;
		
		/*
		 * Constructor for an object that stores the name, address, and initial deposit of
		 * a customer.
		 */
	}
	
	private void deposit(double amount) {
	      balance = balance + amount;
	      
	      /*
	       * Calculates a deposit based on a given amount.
	       */
	   }
	
	private void withdraw(double amount) {
		   if (amount>balance) System.out.println("Insufficient Funds");
		   else balance = balance - amount;
		   
		   /*
		    * Calculates a withdrawal based on a given amount.
		    */
	   }
	
	public double getBalance() {
	      return balance;
	      
	      /*
	       * Returns current balance.
	       */
	   }
	
	public String getBankAddress() {
		return bankAddress;
		
		/*
		 * Returns the address of the bank that the customer uses.
		 */
	}

	public static void main (String[] args) {
		BankSimulation customer1 = new BankSimulation("Anna Nardelli", "1753 Kimberly Drive Wall, NJ 07719", 6000);
		BankSimulation bankLocation = new BankSimulation("16 Cedar Ave West Long Branch, NJ 07764");
		BankSimulation customer2 = new BankSimulation("Dylan O'Brien", "365 Lydia Avenue Freehold, NJ 07728", 10000);
		BankSimulation customer3 = new BankSimulation("Isaac Lahey", "897 Wolf Street Manasquan, NJ 08736", 8056);
		customer1.deposit(5043);
		customer2.deposit(4346);
		customer3.deposit(4650);
		customer1.withdraw(2235);
		customer2.withdraw(8942);
		customer3.withdraw(47);
		System.out.println("Customers: ");
		System.out.println(customer1.name + ", " + customer1.address);
		System.out.println(customer2.name + ", " + customer2.address);
		System.out.println(customer3.name + ", " + customer3.address);
		System.out.println("");
		System.out.println(customer1.name+ "'s current balance is $" + customer1.getBalance());
		System.out.println(customer2.name+ "'s current balance is $" + customer2.getBalance());
		System.out.println(customer3.name+ "'s current balance is $" + customer3.getBalance());
		System.out.println("");
		System.out.println("The bank is located at " +bankLocation.getBankAddress() + ".");
		
		/*
		 * I have provided three fake accounts for this simulation.
		 * Makes a deposit and a withdrawal from each account.
		 * Prints the names and addresses of the customers.
		 * Prints the current balances in each account using getBalance.
		 */
		
	}
	
}
