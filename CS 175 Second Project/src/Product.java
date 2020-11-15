import java.util.Scanner;

public class Product {
	
/*
 * This class takes the name, price, and country of origin of a product.
 * It then creates an object out of this information.
 * Then it uses methods to retrieve the name, price, and country of origin
 * and prints it out.
 */
	
private String name;
private int price;
private String origin;

	public Product (String names, int prices, String origins) {
		name=names;
		price=prices;
		origin=origins;
	
	/*
	 * Constructs the product object.
	 */
		
	}
	
	public String getName () {
		return name;
		
		/*
		 * Returns the name of the product.
		 */
	}
	
	public int getPrice () {
		return price;
		
		/*
		 * Returns the price of the product.
		 */
	}

	public String getOrigin () {
		return origin;
		/*
		 * Returns the origin country of the product.
		 */
	}
	
	public static void main (String[] args) {
		Scanner nameScan = new Scanner(System.in);
		Scanner originScan = new Scanner(System.in);
		Scanner productScan = new Scanner(System.in);
		System.out.print("Please enter the name of a product: ");
		String names = nameScan.nextLine();
		System.out.println("Please enter the price of the product: ");
		int prices = productScan.nextInt();
		System.out.println("Please enter the country of origin: ");
		String origins = originScan.nextLine();
		Product product1 = new Product (names, prices, origins);
		System.out.println("The name of the product is " + product1.getName()+".");
		System.out.println("The price of the product is " +product1.getPrice()+ ".");
		System.out.println("The origin country of the product is " + product1.getOrigin()+".");
		nameScan.close();
		productScan.close();
		originScan.close();
		
		/*
		 * Gets the input needed to create the object.
		 * Initializes the object.
		 * Prints out the name, price, and origin country of the product.
		 */
	}
}
