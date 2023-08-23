package brickBreaker;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();
	     GamePlay gamePlay = new GamePlay();
	      
	     //properties of JFrame
	     obj.setBounds(10, 10, 700, 600);                   // size of the window
	     obj.setTitle("BreakoutBall");                      // Title of the window
	     obj.setResizable(false);                           // the ability to make it full screen
	     obj.setVisible(true);
	     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     obj.add(gamePlay);


	}

}
