import java.text.DecimalFormat;
public class RoachPopulation {


private double population;
/**
 * This allows the whole class to use the variable population.
 */


public RoachPopulation (double inPopulation) {
	DecimalFormat decFormat = new DecimalFormat("0");
	population=inPopulation;
	System.out.println("The initial roach population is: "+ decFormat.format(population)+".");
	
/**
 * Constructs a new simulator to keep track of the roach population.
 * Additionally, prints out the initial roach population (instead
 * of doing it in the RoachSimulation class because every object will
 * need to print out the initial population, so it's less complicated
 * to just have the constructor do it every time).
 */
}

public double breed () {
	population = population*2;
	return population;

/**
 * Multiplies the population by 2 to simulate breeding.
 */
	
}
public double spray (double sprayPct) {
	population = population-(population * sprayPct);
	return population;

/**
 * Subtracts a percentage of the population based on the sprayPct parameter input.
 */
}
public double getRoaches () {
	return population;

/**
 * Returns the current population.
 */
	}
}
