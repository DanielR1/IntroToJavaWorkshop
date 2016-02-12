package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Square {
public static void main(String[] args) {
	Robot bb8 = new Robot();
	Robot bb9 = new Robot();
bb8.setPenColor(Color.blue);
bb9.setPenColor(Color.RED);
bb8.penDown();
bb9.penDown();
bb8.setSpeed(10);
bb9.setSpeed(10);
bb9.turn(-90);
bb8.move(500);
bb9.move(500);
bb8.penUp();
bb9.penUp();
bb8.turn(-90);
bb9.turn(90);
bb8.move(500);
bb9.move(500);
bb8.turn(-90);
bb9.turn(90);
bb8.penDown();
bb9.penDown();
bb8.move(500);
bb9.move(500);
bb8.turn(180);
bb9.turn(-90);
}
}
