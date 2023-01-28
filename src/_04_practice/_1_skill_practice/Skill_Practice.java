package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_Practice {
	public static class SkillPractice {
		public static void main(String[] args) {

			SkillPractice skills = new SkillPractice();
			skills.skill1();
			skills.skill2();
			skills.skill3();
			skills.skill4();
			skills.skill5();
		}

		void skill1() {
			// Use pop-ups for the following.
			// Ask the user how many dimes they have
			String dimes = JOptionPane.showInputDialog(null, "How many dimes do you got.");

			int dine = Integer.parseInt(dimes);
			// Tell them how many cents they have (hint multiply by 10)

			int cents = dine * 10;
			JOptionPane.showMessageDialog(null, "You my man, have " + cents + " cents.");
			// Ask the user how tall they are (inches)
			String inches = JOptionPane.showInputDialog(null, "how tall are you in inches.");

			int tall = Integer.parseInt(inches);

			// If they are shorter than 36 inches, tell them to eat their Wheaties
			if (tall < 36) {
				JOptionPane.showMessageDialog(null, "Danng bro, your short. drink milk.");
			}

		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console

			for (int i = 1; i < 31; i = i + 3) {
				System.out.println(i);
			}

		}

		void skill3() { // Get a random number that is less than 20 and print it to the console

			Random num = new Random();
			// Get another random number that is less than 10 and print it to the console
			int ran = num.nextInt(11);
			int uh = num.nextInt(21);

			// Using a pop-up, tell the user the difference between the numbers // Hint: use
			// subtraction
			System.out.println(uh);
			System.out.println(ran);
			int wuh = uh - ran;
			JOptionPane.showMessageDialog(null, "the difference between these beutiful random numbers is " + wuh + ".");
		}

		void skill4() { // In a pop-up, ask the user for the city they live in

			String city = JOptionPane.showInputDialog(null, "where do you live. city.");

			// If they answered "San Diego", tell them they live in America's Finest City

			if (city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "you lives in the best city to ever city.");
			} else {
				JOptionPane.showMessageDialog(null, "move to San Diego. now.");
			}

			// Otherwise, tell them to move to San Diego

			// Create a variable - cars - and initialize it to the number of cars your
			// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
			// public transportation."
			String car = JOptionPane.showInputDialog(null, "hows many car does your family owns.");
			// If there is 1 car, use a pop-up to display the make/model of the car
if(car.equals("0")){
	JOptionPane.showMessageDialog(null, "Danng bro, your broke.");
}
int dang = Integer.parseInt(car);
			// If there is more than 1 car, use a pop-up to display how many wheels the //
if(car.equals("1")){
	JOptionPane.showMessageDialog(null, "k.");
}

if(dang>2){
	int wut = dang/2;
	
	JOptionPane.showMessageDialog(null, wut+" is half of the amount of car you haves.");
}
			// cars have between them.

		}

		void skill5() { // In a pop-up, ask the user for the name of their school
			String shcool = JOptionPane.showInputDialog(null, "where do you school.");

			// In another pop-up, tell the user, that their school is a fantastic school. //
			// You must include the name of the school in the message.

			JOptionPane.showMessageDialog(null, shcool + " is amazing. 10/10");

		}
	}

}
