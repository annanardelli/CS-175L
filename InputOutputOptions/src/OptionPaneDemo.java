/*You need both of these imported */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
   This program demonstrates the use of option panes for 
   input and output and printf for output
*/

public class OptionPaneDemo {

	 public static void main(String[] args)
	   {
	      String input = JOptionPane.showInputDialog("Enter spray percentage:");
	      double spraypct = Double.parseDouble(input);
	      /*bugs.spray(spraypct)*/
	      
	      double kill = 20.3*spraypct;
	     
	      /*Using printf print option*/
	      System.out.printf("Killed:  %3.0f", kill);
	     
	      /*define an output format*/
	      DecimalFormat decFormat = new DecimalFormat("0.00");

	      /*Using Decimal Format option*/
	      JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill));
	      
	   }
}
