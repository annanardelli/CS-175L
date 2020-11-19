import java.util.Scanner;
public class NamePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter something to print 1,000,000 times: ");
		String words = scan.nextLine();
		int counter= 0;
		while (counter<=1000000) {
			System.out.println(words);
			counter++;
		}
		scan.close();
	}
}
