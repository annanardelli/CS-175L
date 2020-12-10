/**
 * 
 * Group 2: John Costa, Anna Nardelli, and Alexandra Russo
 * 
 * This program picks a random number between a given upper and lower bound and the user must guess the number.
 * The program returns hints by telling the user if the number is higher or lower than the user’s input.
 * Once the user guesses the number correctly, the program tells the user how many guesses it took them to
 * answer correctly. Additionally, there is an upper bar that allows the user to change the bounds, get a hint, 
 * and see the credits for the game. There is also a button that resets the game so that the user can play again.
 */

//swing - GUI toolkit
import javax.swing.*;
import javax.swing.JOptionPane;

//abstract widget toolkit
import java.awt.*;
import java.awt.event.*;

//for random number generation
import java.util.concurrent.ThreadLocalRandom;

//for fonts
import java.awt.Font;

public class GUI {
	
	int lowerBound = 1;
	
	int upperBound = 100;
	
	int answer = ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
	
	int count = 0;
	
	public GUI() {
		
		//create window
		JFrame GUI = new JFrame("Guess My Number!");
		
		//set size of window
		GUI.setSize(560,300);
		
		//center window on screen
		GUI.setLocationRelativeTo(null);
		
		//create upper menu bar
		JMenuBar UpperMenuBar = new JMenuBar();
		
		//creates colors
	    Color ltBlue= new Color(239, 244, 255);
	    Color blue= new Color(122, 149, 255);
		
	    // creates font
	    Font font = new Font("Helectiva", Font.PLAIN, 18);
	    
		//add buttons to upper menu bar
			//Settings
			JMenu settings = new JMenu("Settings");
			UpperMenuBar.add(settings);
			
			//Help
			JMenu help = new JMenu("Help");
			UpperMenuBar.add(help);
			
			//Info
			JMenu info = new JMenu("Info");
			UpperMenuBar.add(info);
		
		//add list of options to each element in upper menu bar
			//Settings options
			JMenuItem settings_1 = new JMenuItem("Change Upper Bound");
			settings.add(settings_1);
			
				settings_1.addActionListener(new ActionListener() {
			    
					public void actionPerformed(ActionEvent e){  
						String input = JOptionPane.showInputDialog(GUI, "Enter new upper bound:", "Change Upper Bound", JOptionPane.INFORMATION_MESSAGE);
						int newUB = Integer.parseInt(input);
						upperBound = newUB;
						JOptionPane.showMessageDialog(GUI, "Upper bound has been changed to " + upperBound + ". Restart to play using new bounds.", "Change Upper Bound", JOptionPane.INFORMATION_MESSAGE);
					}
				});
			
			JMenuItem settings_2 = new JMenuItem("Change Lower Bound");
			settings.add(settings_2);
			
				settings_2.addActionListener(new ActionListener() {
			    
					public void actionPerformed(ActionEvent e){  
						String input = JOptionPane.showInputDialog(GUI, "Enter new lower bound:", "Change Lower Bound", JOptionPane.INFORMATION_MESSAGE);
						int newLB = Integer.parseInt(input);
						lowerBound = newLB;
						JOptionPane.showMessageDialog(GUI, "Lower bound has been changed to " + lowerBound + ". Restart to play using new bounds.", "Change Lower Bound", JOptionPane.INFORMATION_MESSAGE);
					}
				});
			
			//Help options
			JMenuItem help_1 = new JMenuItem("Get a Hint");
			help.add(help_1);
			
				help_1.addActionListener(new ActionListener() {
			    
					public void actionPerformed(ActionEvent e){  
						int range = upperBound - lowerBound + 1;
						
						int hintRange = (int)(range * 0.28);
						
						int hintUpperBound = answer + hintRange;
						
						int hintLowerBound = answer - hintRange;
						
						if (hintUpperBound > upperBound) {
							hintUpperBound = upperBound;
						}
						
						if (hintLowerBound < lowerBound) {
							hintLowerBound = lowerBound;
						}
						
						if (range <= 20) {
							JOptionPane.showMessageDialog(GUI, "Sorry! A hint would make this too easy!", "Hint", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(GUI, "The answer is somewhere between " + hintLowerBound + " and " + hintUpperBound + ".", "Hint", JOptionPane.INFORMATION_MESSAGE); 
						}
					}
				});
			
			//Info options
			JMenuItem info_1 = new JMenuItem("Credits");
			info.add(info_1);
			
				info_1.addActionListener(new ActionListener() {
			    
					public void actionPerformed(ActionEvent e){  
						JOptionPane.showMessageDialog(GUI, "Created by:\n       John Costa\n       Anna Nardelli\n       Alexandra Russo\nMonmouth University 2020\nCS175-50 Intro to Computer Science\nProfessor Samer Khamaiseh", "Credits", JOptionPane.INFORMATION_MESSAGE); 
					}
				});
			
		//create lower menu bar
		JPanel LowerMenuBar = new JPanel();
		
		//Sets color of the lower menu bar
		LowerMenuBar.setBackground(blue);
		
		//create guess button in advance for use in the input field
		JButton guessButton = new JButton("Guess");
		
		//add input field to lower menu bar
	    	//label for input field
	    	JLabel text = new JLabel("Enter Guess:");
	    	LowerMenuBar.add(text);
	    
	    	//input field
	    	JTextField input = new JTextField(10);
	    	LowerMenuBar.add(input);
	    	
	    		//enables pressing the enter key
	    		input.addActionListener(new ActionListener() {
		    
	    			public void actionPerformed(ActionEvent e){  
	    				guessButton.doClick();
	    			}
	    		});
	    
	    //create output field
	    JTextArea output = new JTextArea();
	    output.setBackground(ltBlue);
	    output.setFont(font);
	    output.setEditable(false);
	    output.setText("I'm thinking of a number between " + lowerBound + " and " + upperBound + "! Can you guess it?");
	
		//add guess and restart buttons to lower menu bar
		    //guess button
	    	//already created above
		    LowerMenuBar.add(guessButton);
		    	
		    	guessButton.addActionListener(new ActionListener() {
			    
		    		public void actionPerformed(ActionEvent e){
		    			
		    			//check if guess is a number
		    			try {
		    				Integer.parseInt(input.getText());
		    			} catch(NumberFormatException ee) {
		    				output.setText("\"" + input.getText() + "\" is not a number! Try again.");
		    				return;
						}
						
		    			int guess = Integer.parseInt(input.getText());
		    			
						//check that the guess is within bounds
						if (guess > upperBound) {
							output.setText("Too big. Pick a number from " + lowerBound + " to " + upperBound + ".");
						} else if (guess < lowerBound) {
							output.setText("Too small. Pick a number from " + lowerBound + " to " + upperBound + ".");
						} else if 
						//compare guess to the real answer
						(guess > answer) {
							count += 1;
							output.setText(Integer.parseInt(input.getText()) + " is too high!");
						} else if (guess < answer) {
							count += 1;
							output.setText(Integer.parseInt(input.getText()) + " is too low!");
						} else {
							count += 1;
							output.setText("You win! The answer was " + answer + ". You got it in " + count + " tries. Restart to play again!");
						}
						
						//highlights previous input so that the user doesn't need to backspace it out
						input.requestFocus();
				        input.selectAll();

		    		}
		    	});
		    	
		    //restart button
		    JButton restartButton = new JButton("Restart");
		    LowerMenuBar.add(restartButton);
		    
		    	restartButton.addActionListener(new ActionListener() {
			    
		    		public void actionPerformed(ActionEvent e){
		    			count = 0;
		    			answer = ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
		    			output.setText("I'm thinking of a number between " + lowerBound + " and " + upperBound + "! Can you guess it?");
		    		}
	    		});

		//organize all the different elements
		    //put the upper menu bar at the top of the window
		    GUI.getContentPane().add(BorderLayout.NORTH, UpperMenuBar);
		    
		    //put the output field in the center of the window
		    GUI.getContentPane().add(BorderLayout.CENTER, output);
		        	
		    //put the lower menu bar at the bottom of the window
		    GUI.getContentPane().add(BorderLayout.SOUTH, LowerMenuBar);
		        
		//make the whole thing visible
		GUI.setVisible(true);
		
		//set window to terminate program on close
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		GUI game = new GUI();
	}	
}