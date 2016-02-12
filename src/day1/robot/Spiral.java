package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		Robot hi = new Robot();
	
hi.penDown();
hi.setPenWidth(5);
hi.setSpeed(100);
		
for (int i = 0; i < 360; i++) {
	hi.move(1*i);
	hi.turn(10);
	hi.setRandomPenColor();
}
			
	
			

			

			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}
