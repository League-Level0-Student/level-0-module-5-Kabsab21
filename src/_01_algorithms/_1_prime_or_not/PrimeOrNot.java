package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main( String[] args) {
	String prime = JOptionPane.showInputDialog(null, " type in a Number." );
	 int num = Integer.parseInt(prime);
	 for(int i = 0; i < num; i++) {
	 if(num > 1 && num%i==0) {
			JOptionPane.showMessageDialog(null, " your number is prime." );
		} else if(num > 1) {
			JOptionPane.showMessageDialog(null, " your number is composite." );
		}

	 }
	}


}
