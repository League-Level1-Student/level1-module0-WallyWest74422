package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		
	
Robot zane = new Robot();
zane.moveTo(20, 450);
zane.penDown();
zane.setSpeed(200);
int randomChoice = 0;
Random number = new Random();
String size = "hi";
for(int i=0;i<9;i++) {
randomChoice = number.nextInt((2-(0)+1))+(0);
if(randomChoice==0) {
	 size = "small";
	drawHouse(zane, size, Color.BLUE);
}else if(randomChoice==1) {
 size = "medium";
 drawHouse(zane, size, Color.RED);
}else if(randomChoice==2) {
	 size = "large";
drawHouse(zane,size,Color.PINK);
}


}

}
public static void drawPointyRoof(Robot object) {
	object.turn(45);
	object.move(40);
	object.turn(90);
	object.move(40);
	object.turn(45);
}
public static void drawFlatRoof( Robot object) {
	object.turn(90);
	object.move(50);
	object.turn(90);
}

	public static void drawHouse(Robot temp, String height, Color color){
		temp.setPenColor(color);
		int moveHeight = 0;
		if(height.equals("small")){
		  moveHeight = 60;
		}
		else if(height.equals("medium")){
		  moveHeight = 120;
		}
		else if(height.equals("large")){
		  moveHeight = 250;
		}

		temp.move(moveHeight);
		if(height.equals("large")) {
			drawFlatRoof(temp);
		}else {
		drawPointyRoof(temp);
		}temp.move(moveHeight);
		temp.turn(-90);
		temp.setPenColor(0, 255, 0);
		temp.move(37);
		temp.turn(-90);
		temp.setPenColor(0, 0, 0);
	}
}

