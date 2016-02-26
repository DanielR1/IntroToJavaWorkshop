package day5;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		
		Robot ninja = new Robot();
		ninja.setX(700);
		ninja.setY(350);
		ninja.penDown();

		// 12. Set the robot speed to 10
ninja.setSpeed(10);
		// 13. Make all the code below repeat 25 times

			for (int i = 0; i < 25; i++) {
				
			
		ninja.turn(360/8);
		
			
		ninja.move(64);

			
			
			ninja.turn(-40);
			ninja.setPenColor(Color.orange);
			ninja.move(flameSize);
			
			
			ninja.turn(170);
		
			ninja.move(flameSize);
		
			ninja.turn(64);
		ninja.setPenColor(Color.black);
			ninja.move(baseSize);
			}
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.

		
	}

}


