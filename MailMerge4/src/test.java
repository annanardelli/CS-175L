/**
 * 
 * @author AnnaNardelli
 *Replaces text in a form letter with input from user.
 */

import java.util.Scanner;
public class test {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println ("Please enter your first and last name:");
		String name = in.nextLine();
		System.out.println ("Please enter your address:");
		String address = in.nextLine();
		System.out.println ("Please confirm that your address is "+address);
		String answer = in.nextLine();
		String text = "Dear <name>," + System.lineSeparator()
				+ "Please confirm that your address is <address>." + System.lineSeparator()
				+ "Your answer is <answer>." + System.lineSeparator()
				+ "Sincerely," + System.lineSeparator()
				+ "Anna";
		text=text.replaceAll("<name>", name);
		text=text.replaceAll("<address>", address);
		text=text.replaceAll("<answer>", answer);
		System.out.println(text);
		in.close();
	}
	}
