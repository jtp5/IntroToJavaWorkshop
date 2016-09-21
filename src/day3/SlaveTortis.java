package day3;

import org.jointheleague.graphical.robot.Robot;

public class SlaveTortis {
	
	void drawShape(int sides, Robot p){
		for (int i = 0; i < sides; i++) {
			p.move(20);
		}
	}
	
	public static void main(String[] args) {
	}
}
