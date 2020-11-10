import java.util.Scanner;

public class RomanNumeralsTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number to convert to Roman Numerals: ");
		int numeral = scan.nextInt();
		
		String thousands=null;
		String hundreds=null;
		String tens=null;
		String ones = null;
		int tdigit=0;
		int hdigit=0;
		
		
		if (numeral > 3999) {
			System.out.println("Invalid input. Must be a number between 1 and 3,999.");
		}
		
		if (numeral >= 1000) {
			tdigit = Integer.parseInt(Integer.toString(numeral).substring(0, 1));
			
			if (tdigit == 3) {
				thousands= ("MMM");
			}
			if (tdigit == 2)	{
				thousands= ("MM");
			}
			if (tdigit == 1) {
				thousands= ("M");
			}
			}
		if (numeral >=100) {
			if (numeral >=1000) {
				int thousandsNum = (tdigit*1000);
				hdigit = (numeral-thousandsNum)/100;
			}
				else {
					hdigit=numeral/100;
				}
			
			if (hdigit== 9) {
				hundreds= ("CM");
			}
			if (hdigit== 8) {
				hundreds= ("DCCC");
			}
			if (hdigit== 7) {
				hundreds= ("DCC");
			}
			if (hdigit== 6) {
				hundreds= ("DC");
			}
			if (hdigit== 5) {
				hundreds= ("D");
			}
			if (hdigit== 4) {
				hundreds= ("CD");
			}
			if (hdigit==3) {
				hundreds= ("CCC");
			}
			if (hdigit==2) {
				hundreds= ("CC");
			}
			if (hdigit==1) {
				hundreds= ("C");
			}
			if (hdigit==0) {
				hundreds = ("");
			}
			}
		if (numeral>=10) {
			int digit = (numeral/10) % 10;
			
			if (digit == 9) {
				tens= ("XC");
			}
			if (digit == 8) {
				tens= ("LXXX");
			}
			if (digit == 7) {
				tens= ("LXX");
			}
			if (digit == 6) {
				tens= ("LX");
			}
			if (digit == 5) {
				tens= ("L");
			}
			if (digit == 4) {
				tens= ("XL");
			}
			if (digit == 3) {
				tens= ("XXX");
			}
			if (digit == 2) {
				tens= ("XX");
			}
			if (digit == 1) {
				tens= ("X");
			}
			if (digit == 0) {
				tens= ("");
			}
		}
		
		if (numeral >=1) {
			int digit = numeral %10;
			
			if (digit == 9) {
				ones= ("IX");
			}
			if (digit == 8) {
				ones= ("VIII");
			}
			if (digit == 7) {
				ones= ("VII");
			}
			if (digit == 6) {
				ones= ("VI");
			}
			if (digit == 5) {
				ones= ("V");
			}
			if (digit == 4) {
				ones= ("IV");
			}
			if (digit == 3) {
				ones= ("III");
			}
			if (digit == 2) {
				ones= ("II");
			}
			if (digit == 1) {
				ones= ("I");
			}
			if (digit == 0) {
				ones= ("");
			}
			
			}
		if (thousands != null) {
			System.out.println(thousands+hundreds+tens+ones);
		}
		else
			if (hundreds != null) {
				System.out.println(hundreds+tens+ones);
			}
			else
				if (tens != null) {
					System.out.println(tens+ones);
				}
				else
					if (ones != null) {
						System.out.println(ones);
					}
		scan.close();
			}
		
}
		//int I = 1;
		//int V = 5;
		//int X = 10;
		//int L = 50;
		//int C = 100;
		//int D = 500;
		//int M = 1000;