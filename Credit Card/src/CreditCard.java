/**
 * Takes the dashes/spaces out of a credit card number.
 */

import java.util.Scanner;

public class CreditCard {
	String credit=null;
	String before= null;
	String after=null;

	public static void main (String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println ("Please enter a credit card number or -99 to end:");
		while(input.hasNextLine()) {
			String cc = input.nextLine();
			CreditCard number= new CreditCard(cc);
			if (cc.equalsIgnoreCase("-99")) {
				System.out.println("goodbye");
				break;
				}
			else {
				System.out.println(number.ccNumber());	
				System.out.println ("Please enter a credit card number or -99 to end:");
		}
		}
		input.close();
			}
	
	private CreditCard(String cc) {
		credit=cc;
	}
	
	private String ccNumber() {
		int i = 0;
			while (i < credit.length()) {
				char ch= credit.charAt(i);
				if (ch == '-' || ch == ' ') {
					credit.replace("-", "");
					credit.replace(" ", "");
					before = credit.substring(0, i);
					after = credit.substring(i + 1);
					credit=before+after;
				}
				i++;			
				}
		return credit;
	}
	}
	


	

