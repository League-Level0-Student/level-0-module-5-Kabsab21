package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {
	static int number1 =0;
	static int number2 =0;
	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		 number1 = Integer.parseInt(input1);
		 number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task == 3) {
			add(number1, number2);
		}
		if(task == 2) {
			subtract(number1, number2);
		}
		if(task == 1) {
			multiply(number1, number2);
		}
		if(task == 0) {
			divide(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	

	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 
	 static void add(int num1, int num2) {
		int  add = num1+num2;
	 JOptionPane.showMessageDialog(null, " The answer is "+add+".");
	 }
	 
	 static void subtract(int num1, int num2) {
		 int  sub = num1-num2;
		 JOptionPane.showMessageDialog(null, " The answer is "+sub+".");
	 }
	 
	 static void multiply(int num1, int num2) {
		 int  mult = num1*num2;
		 JOptionPane.showMessageDialog(null, " The answer is "+mult+".");
	 }
	 
	static  void divide(int num1, int num2) {
		 int  div = num1/num2;
		 JOptionPane.showMessageDialog(null, " The answer is "+div+".");
	 }
	 
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
