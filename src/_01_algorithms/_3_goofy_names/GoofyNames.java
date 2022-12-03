package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String name = JOptionPane.showInputDialog(null, "please enter your name.");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.String up = name.toUpperCase();
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
int chara = name.length();
String up = name.toUpperCase();
for(int i = 0; i < chara; i++ ) {
char charac = up.charAt(i);
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
if(i%2>0) {
	up.toLowerCase();
}

System.out.println(charac);	
}
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
	}

	}		
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	


