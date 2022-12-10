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
		int chara = name.length();
		String character =  "";

		for(int i = 0; i < chara; i++ ) {
		// 2. Print upper case name to the console using .toUpperCase()
			String up =	name.toUpperCase();	
		//    Run your program to see that this works.String up = name.toUpperCase();
		// 3. Loop through each character of the name (steps 4 - 7).
			
		//    HINT: Use .length() to determine the number of characters in the String.
			
			// 4. Create a char variable to store the next character of the name
			//    use .charAt()
			char charac = up.charAt(i); 
			String down = name.toLowerCase(); 
			
			char as = down.charAt(i);
			
			// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
		if(i%2>0){

			System.out.println(charac);	
		
		}else if(i%2==0) {
		
			
				System.out.println(as);	
			
		}
		character = character+String.valueOf(charac)+String.valueOf(as);				
		
		
		}
		JOptionPane.showMessageDialog(null,"the goofy name is "+ character +".");
		
	}
	
	}		
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	


