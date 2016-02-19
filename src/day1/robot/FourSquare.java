package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Daniel = new Robot();

	

	void go() {
	

	

		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			
		
	Daniel.setRandomPenColor();
		

		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
	Daniel.turn(90);
	}
	}
	

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		Daniel.penDown();
	
		Daniel.setSpeed(100000);
		Daniel.setPenWidth(5);
		for (int i = 0; i < 4; i++) {
			
		Daniel.move(200);
		Daniel.turn(-90);
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
