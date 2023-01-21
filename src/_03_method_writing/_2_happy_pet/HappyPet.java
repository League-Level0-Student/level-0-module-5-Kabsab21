package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		int happinessLevel = 0;
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog(null,"buy a pet.");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i = 0; i < 10; i++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			String[] options = {"abandon", "give it therapy", "feed."};
			int task = JOptionPane.showOptionDialog(null, "make your pet happy", pet , 0, JOptionPane.INFORMATION_MESSAGE, null,
					options, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
if(task == 0){
	
abandon();

}
if(task == 1) {
	
therapy();
happinessLevel = happinessLevel+5;
}
if(task == 2){
	
therapy();
happinessLevel = happinessLevel+10;
}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel == 10)
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
private static void abandon() {
		JOptionPane.showMessageDialog(null, " your pet died. what a waste of money...");

}
private static void therapy() {
	JOptionPane.showMessageDialog(null, " your pet is mentally stable. congrats");

}
private static void feed() {
	JOptionPane.showMessageDialog(null, "your pet is full.");

}
}