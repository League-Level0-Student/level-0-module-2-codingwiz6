//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("What is your question for the 8ball?");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	Random ran=new Random();
	//     Limit the random numbers to be between 0 and 3
int number=ran.nextInt(4); 
	

	
	// 4. If the random number is 0
if (number==0){
	JOptionPane.showInputDialog("Yes");

}
	// -- tell the user "Yes"

	// 5. If the random number is 1
else if (number==1){
	JOptionPane.showInputDialog("No");

}
	// -- tell the user "No"

	// 6. If the random number is 2
if (number==2){
	JOptionPane.showInputDialog("Maybe you should ask Google");

}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
}