package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot hi = new Robot();
			

	
	void go() {
	

		
		hi.setSpeed(1000000);

		
		int side = 50;
		
		for (int i = 0; i < 60; i++) {
			
		

			// 9. Change the color of the pen to a random color
			hi.setRandomPenColor();
	
			
			side+=10;
	
		
			drawTriangle(side);
	
			// 10. Turn the tortoise 6 degrees to the right
			hi.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		hi.penDown();
		for (int i = 0; i < 3; i++) {
			hi.move(length);
			hi.turn(120);
			
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
