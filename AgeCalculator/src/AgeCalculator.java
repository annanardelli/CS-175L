import javax.swing.JOptionPane;

public class AgeCalculator {
	public static void main (String[] args) {
	String birthdate=JOptionPane.showInputDialog ("Please enter your birthdate (MM/DD/YYYY): ");	
	String today=JOptionPane.showInputDialog ("Please enter today's date (MM/DD/YYYY): ");
	String bmonth = birthdate.substring(0, 2);
	String byear = birthdate.substring(6, 10);
	String tmonth = today.substring(0, 2);
	String tyear = today.substring(6, 10);            
	
	int birthMonth = Integer.parseInt(bmonth);
	int birthYear = Integer.parseInt(byear);
	int thisMonth = Integer.parseInt(tmonth);
	int thisYear = Integer.parseInt(tyear);
	
	int numOfYears = thisYear-birthYear;
	int yearMonths= numOfYears*12;
	
	int months = thisMonth-birthMonth;
	int monthsAlive = yearMonths+months;
	
	int yearsAlive = monthsAlive/12;
	int extraMonths = monthsAlive%12;
	
	JOptionPane.showMessageDialog(null, "You are " + yearsAlive + " years and " + extraMonths + " months old.");
		
	}

}
