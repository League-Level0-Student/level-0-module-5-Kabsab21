package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
public class Obedient_Robot {
	
	static Robot rob = new Robot();
	
	public static void main(String[] args) {
  
		String shape = JOptionPane.showInputDialog(null,"square, circle, or triangle?");
		String color = JOptionPane.showInputDialog(null,"red, blue, or green");
		
		if(color.equals("red")) {
			rob.setPenColor(225, 0, 0);
		}
		if(color.equals("blue")) {
			rob.setPenColor(0, 0, 225);
		}
		if(color.equals("green")) {
			rob.setPenColor(0, 225, 0);
		}
			if(shape.equals("square")) {
				square();
			}
			if(shape.equals("triangle")) {
				triangle();
			}
			if(shape.equals("circle")) {
				circle();
			} 
   
	}

	private static void circle() {
		
		rob.penDown();
		rob.setSpeed(10);
		for(int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
			
		}
		rob.hide();
		
	}

	private static void triangle() {
		rob.penDown();
		rob.setSpeed(10);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(135);
		rob.move(140);
	   rob.hide();
		
	}

	private static void square() {
		rob.penDown();
		rob.setSpeed(10);
		 rob.move(100);
		 rob.turn(90);
		 rob.move(100);
		 rob.turn(90);
		 rob.move(100);
		 rob.turn(90);
		 rob.move(100);
		 rob.turn(90);
		 rob.hide();
		
	}
	
			
		
}

	


