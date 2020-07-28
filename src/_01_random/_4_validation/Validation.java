//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i = 0; i < 10; i++) {
			
		
		int randomNumber = randomMaker.nextInt(6);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Good job with working on this java code!");
		}
		else if (randomNumber==1) {
			JOptionPane.showMessageDialog(null, "I like your color choice ");
		}
		
		else if (randomNumber==2) {
			JOptionPane.showMessageDialog(null, "Roses are red, Violets and blue, Sugar is sweet and so are you! :)");
		}	
		
		else if (randomNumber==3) {
			JOptionPane.showMessageDialog(null, " Nice job!!! "); 
		}
		else if (randomNumber==4) {
			JOptionPane.showMessageDialog(null, "Good things will happen in the future ");
		}
		
		else if (randomNumber==5) {
			JOptionPane.showMessageDialog(null, "I like your shirt");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
}