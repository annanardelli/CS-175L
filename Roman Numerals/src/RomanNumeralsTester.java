import java.util.Scanner;

public class RomanNumeralsTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to convert to Roman Numerals: ");
		int numeral = scan.nextInt();
		
		String thousands=null;
		String hundreds=null;
		String tens=null;
		String ones = null;
		int tDigit = 0;
		
		if (numeral > 3999) {
			System.out.println("Please enter a number between 1 and 3,999.");
		}
		
		if (numeral >= 1000) {
			int tdigit = Integer.parseInt(Integer.toString(numeral).substring(0, 1));
			
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
			int digit = numeral-(tDigit * 1000);
			
			if (digit== 9) {
				hundreds= ("CM");
			}
			if (digit== 8) {
				hundreds= ("DCCC");
			}
			if (digit== 7) {
				hundreds= ("DCC");
			}
			if (digit== 6) {
				hundreds= ("DC");
			}
			if (digit== 5) {
				hundreds= ("D");
			}
			if (digit== 4) {
				hundreds= ("CD");
			}
			if (digit==3) {
				hundreds= ("CCC");
			}
			if (digit==2) {
				hundreds= ("CC");
			}
			if (digit==1) {
				hundreds= ("C");
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
		}
		
		if (numeral >=1) {
			int digit = 4;
			
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
			
			}
		String finalNumber = thousands + hundreds + tens + ones;
		System.out.println (finalNumber);
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