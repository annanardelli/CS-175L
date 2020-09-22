package housepainting;
import java.util.Scanner;
public class house {
	public static void main(String []args) {
		Scanner in= new Scanner(System.in);
		//Scanner line means we're taking keyboard input
	
		System.out.println ("Please enter the base length of the house:");
		int houseLength = in.nextInt();
		System.out.println ("Please enter the width of the house to the edge of the roof:");
		int houseWidth = in.nextInt();
		
		//math
		int lengthxWidth = (houseLength*houseWidth);
		int houseArea = 2*(lengthxWidth);
		
		System.out.println ("Please enter the height of the house to the peak of the roof:");
		int roofHeight = in.nextInt();
		
		//math
		int roofEquationSmaller = (roofHeight-houseWidth);
		int roofEquationSmall = (houseLength*roofEquationSmaller);
		double half = 0.5*roofEquationSmall;
		double roof = 2*(half+lengthxWidth);
		
		
		System.out.println ("Please enter the number of windows:");
		int windowNumber = in.nextInt();
		System.out.println ("Please enter the length of the windows:");
		int windowLength = in.nextInt();
		System.out.println ("Please enter the width of the windows:");
		int windowWidth = in.nextInt();
		
		//math
		int windows = (windowLength*windowWidth);
		int windowArea = (windows*windowNumber);
		
		
		System.out.println ("Please enter the number of doors:");
		int doorNumber = in.nextInt();
		System.out.println ("Please enter the length of the doors:");
		int doorLength = in.nextInt();
		System.out.println ("Please enter the width of the doors:");
		int doorWidth = in.nextInt();
		
		//math
		int doors = (doorLength*doorWidth);
		int doorArea = (doors*doorNumber);
		int doorsAndWindows = doorArea+windowArea;
		
		double house= (houseArea+roof);
		double houseFinal=(house-doorsAndWindows);
		
		System.out.println ("Please enter the cost per square foot:");
		int cost = in.nextInt();
		
		//math 
		double price= (cost*houseFinal);
		System.out.println ("Square footage to be painted: "+houseFinal);
		System.out.println ("Final Cost: $" +price);
		
		in.close();
	}
}
