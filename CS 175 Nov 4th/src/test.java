import java.util.Scanner;
public class test {
public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int grade= scan.nextInt();
	if (grade >=50) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
scan.close();
}
}
