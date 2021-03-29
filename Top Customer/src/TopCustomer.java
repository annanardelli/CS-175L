/**
 * This program uses two ArrayLists to determine and then print
 * the name of the top customer at a store.
 */
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class TopCustomer {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		
		//Creates the two ArrayLists
		ArrayList <String> customers = new ArrayList<String> ();
		ArrayList <Double> prices = new ArrayList<Double> ();
		System.out.print("Enter the first price: ");
		
		//takes input from user and sends the ArrayLists to the nameOfBestCustomer() method
		while (input.hasNextDouble()) {
			double price = input.nextDouble();
			if (price == 0) {
				TopCustomer bestCust= new TopCustomer();
				System.out.println("Best customer's name: " + bestCust.nameOfBestCustomer(customers, prices));
				break;
			}
			prices.add(price);
			System.out.println("Enter the name: ");
			String name = strings.nextLine();
			customers.add(name);
			System.out.println("Enter the price or 0 to end: ");
		}
		strings.close();
		input.close();
	}
	public String nameOfBestCustomer(ArrayList<String> customers, ArrayList<Double> prices) {
		//finds the max price
			double maxNumber= Collections.max(prices);
		//finds the index of the max price in the ArrayList
			int index= prices.indexOf(maxNumber);
		//finds the matching name in the other ArrayList
			String name = customers.get(index);
			return name;
		}	
	}
