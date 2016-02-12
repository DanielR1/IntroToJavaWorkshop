package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	Robot bb8 = new Robot();
		
		bb8.setSpeed(15);
		bb8.move(100);
		for (int i = 0; i < 18; i++) {
			bb8.turn(-20);
		bb8.move(50);
		for (int j = 0; j < 4; j++) {
			bb8.setRandomPenColor();
		bb8.penDown();
		bb8.move(100);
		bb8.turn(-90);
		bb8.penUp();
		}
		}
		bb8.setPenColor(Color.GREEN);
		bb8.turn(180);
		bb8.move(200);
		bb8.turn(90);
		bb8.move(150);
		bb8.turn(-90);
		bb8.penDown();
		bb8.move(300);
		bb8.penUp();
		bb8.turn(180);
		bb8.move(300);
		bb8.sparkle();
		bb8.move(1000);
	}
}
