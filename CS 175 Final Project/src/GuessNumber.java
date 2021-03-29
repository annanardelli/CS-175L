import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class GuessNumber extends JFrame{
	private JLabel title;
	private JLabel display;
	private JLabel tries;
	private JButton button;
	private JTextField t1;
	private GuessNumber.bListener bListener;
	//private GuessNumber.bListener2 bListener2;
	private static final long serialVersionUID = 1L;
	
	//Creates the random number for the game
	int random=(int) (Math.random()*100); 
    int count=0;
	
	public GuessNumber() {
		
		Container c = getContentPane();
		c.setLayout(null);
		Color myColor= new Color(167, 233, 249);
		c.setBackground(myColor); 

		Font titleText = new Font("Serif", Font.PLAIN, 25);
		Font text = new Font("Serif", Font.PLAIN, 18);
		
		//Creates the label that prompts the user to guess numbers
        JLabel guess=new JLabel("Guess a Number Between 1 and 100:");
        guess.setFont(text);
        guess.setSize(300,35);
        guess.setLocation(125,60);
        
        //Sets title on the top border
        setTitle("Guess the Number Game");
        
        // Creates title line
        title= new JLabel("Guess the Number Game");
        title.setFont(titleText);
        title.setSize(300, 50);
        title.setLocation(130, 25);
        
      //Creates Label for the display message        
        display=new JLabel("Guess your first number to start!");
        display.setFont(text);
        display.setSize(275,20);
        display.setLocation(150,150);
        
        //Creates a label to tell the user how many tries it took to get the answer correct
        tries= new JLabel(" ");
        tries.setFont(text);
        tries.setSize(300, 300);
        tries.setLocation(125, 140);
        
		
		//creates text box for the user input
		t1=new JTextField(10);
        t1.setSize(50,45);
        t1.setLocation(240,100);
        
        
        //Creates button to submit a guess
        button = new JButton("Guess");
        button.setFont(text);
        button.setSize(150,40);
        button.setLocation(195,200);
        bListener=new bListener();        
        button.addActionListener(bListener);
       
        
        //places components into the panel
        c.add(button);
        c.add(display);
        c.add(guess);
        c.add(t1);
        c.add(title);
        c.add(tries);
        
        
        setSize(550,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
		
	}
	

		public class bListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int input = Integer.parseInt(t1.getText());
        if(input<random)
        {
            display.setText(input+" is too low, try again!!");
            count++;
        }    
        else if(input>random)
        {
            display.setText(input+" is too high, try again!!");
            count++;
        }
        else
        {
        	count++;
            display.setText("CORRECT, YOU WIN!!"); 
            tries.setText("You guessed the answer in " + count + " tries!");
        }

        //setting focus to input guess text field
        t1.requestFocus();
        t1.selectAll();

    }
	}
	public static void main(String[] args) {
		new GuessNumber();
}
}
	


