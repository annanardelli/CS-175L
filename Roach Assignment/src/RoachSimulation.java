import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class RoachSimulation {

public static void main(String[] args) {
	
	DecimalFormat decFormat = new DecimalFormat("0");
	
	//Takes initial roach population from user, creates new object bugs.
	String input = JOptionPane.showInputDialog("Enter the initial roach population: ");
	double inPopulation = Double.parseDouble(input);
	RoachPopulation bugs = new RoachPopulation(inPopulation);
	
	//Cycle 1
	bugs.breed(); //invokes the breed method from RoachPopulation.
	double pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 1 breeding is " + decFormat.format(pop) +".");
	bugs.spray(0.5); //invokes the spray method from RoachPopulation.
	pop=bugs.getRoaches(); //invokes the getRoaches method from RoachPopulation.
	System.out.println("The Roach population after cycle 1 50 percent spraying is " + decFormat.format(pop)+".");
	
	//Cycle 2
	bugs.breed();
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 2 breeding is " + decFormat.format(pop)+".");
	bugs.spray(0.6);
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 2 60 percent spraying is " + decFormat.format(pop)+".");
	
	//Cycle 3
	bugs.breed();
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 3 breeding is " + decFormat.format(pop)+".");
	bugs.spray(0.7);
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 3 70 percent spraying is "+ decFormat.format(pop)+ ".");
	
	//Cycle 4
	bugs.breed();
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 4 breeding is "+ decFormat.format(pop)+".");
	bugs.spray(0.8);
	pop=bugs.getRoaches();
	System.out.println("The Roach population after cycle 4 80 percent spraying is "+ decFormat.format(pop)+".");
}
}
