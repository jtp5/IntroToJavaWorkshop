package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		int x = 2;
		Robot Bender = new Robot(200,500);
		for (int i = 0; i < 4; i++) {
			Bender.penDown();
			Bender.sparkle();
			Bender.setSpeed(5);
			Bender.move(450);
			Bender.turn(90);
		}
			
	
		
	}
}
