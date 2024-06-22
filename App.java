import javax.swing.*;

public class App {
	
    public static void main(String[] args) throws Exception 
    {
		//Define Board Dimensions
		/**
		Sets the dimensions of the game board to 750 pixels wide and 250 pixels tall.
		**/
        int boardWidth = 750;
        int boardHeight = 250;

        JFrame frame = new JFrame("Chrome Dinosaur");	//create Frame with the title Chorme Dinosaur
			// Set JFrame Properties 
	
		// frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);	//Sets the size of the frame to match the game board dimensions.
        frame.setLocationRelativeTo(null);// Centers the frame on the screen.
        frame.setResizable(false); // Prevents the user from resizing the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures that the application exits when the frame is closed.

		 
        ChromeDinosaur chromeDinosaur = new ChromeDinosaur();	//Instantiates a ChromeDinosaur object, which is the main game panel.
        frame.add(chromeDinosaur);	//add game panel
        frame.pack();	//Causes the frame to be resized to fit the preferred size and layouts of its subcomponents (in this case, the ChromeDinosaur panel).
        chromeDinosaur.requestFocus(); //Requests focus for the game panel to ensure it can capture keyboard input.
        frame.setVisible(true);	//Makes the frame visible on the screen.
    }
}
