import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class TopCustomer {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		ArrayList <String> customers = new ArrayList<String> ();
		ArrayList <Double> prices = new ArrayList<Double> ();
		while (input.hasNextDouble()) {
			//int counter = 0;
			System.out.println("Enter the price or 0 to end: ");
			double price = input.nextDouble();
			if (price == 0) {
				input.close();
				strings.close();
				//RUN TOP CUSTOMER FINDER
			}
			prices.add(price);
			System.out.println("Enter the name: ");
			String name = strings.next();
			customers.add(name);
			//counter++;
		}
}
	public String nameOfBestCustomer(ArrayList<String> customers, ArrayList<Double> prices) {
			double maxNumber= Collections.max(prices);
			//int i =0;
			int index= prices.indexOf(maxNumber);
			//for (double price: prices) {
				//if (price != maxNumber) {
					 // i++;
				//}
				//else {
					//break;
				//}
			String name = customers.get(index);
			return name;
		}
			
	}
