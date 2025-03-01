package src;

// Java Program to Create a JPanel with a Box layout 
// and Adding components to it 

// Importing required classes 
import java.awt.BorderLayout;
import javax.swing.*; 

// Main class 
// Extending JFrame class 
public class ctrl extends JFrame { 

	// JFrame 
	static JFrame f; 

	// JButton 
	//static JButton b, b1, b2, b3; 

	// Label to display text 
	static JLabel l; 

	// Main drive method 
	public static void main(String[] args) 
	{ 
		f = new JFrame("Character Roster");

		JPanel p = new JPanel(new BorderLayout());

		// setting insides
		l = new JLabel("Welcome to Geist's Character Roster!", SwingConstants.CENTER);


		p.add(l, BorderLayout.PAGE_START);

		f.add(p);
		f.setVisible(true);


	} 
}
