package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class idk {
public static void main(String[] args) {
	Robot hi = new Robot();
	hi.setPenColor(Color.cyan);
	hi.setSpeed(10);
	hi.penDown();
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			
		
		hi.move(200);
		hi.turn(90);
		}
		hi.turn(90);
	}
	hi.penUp();
}
}
