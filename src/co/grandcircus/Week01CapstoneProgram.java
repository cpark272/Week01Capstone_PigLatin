package co.grandcircus;

import java.util.Scanner;

public class Week01CapstoneProgram {

	public static void main(String[] args) {

		// Set up Scanner object
		Scanner scan = new Scanner(System.in);
		
		String userInput = null;
		
		// Title of the program
		System.out.println("Welcome to the Pig Latin Translator!");
		
		// do-while loop to continue or terminate the program
		//do {
			
			System.out.println("Enter a line to be translated: ");
			
			// User input of the word to be translated to pig latin
			String text = scan.nextLine();
			
			String pigLatin = null;
			
			// For loop to search for the first vowel
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) != 'a' && text.charAt(i) != 'e' && text.charAt(i) != 'i' && text.charAt(i) != 'o' && text.charAt(i) != 'u') {
					//System.out.println("There is no vowel.");
				} else {
					//System.out.println("There is a vowel.");
				}
			}
			
			// Asks if the user wants to continue using the program
						System.out.print("\nTranslate another line? (y/n): ");
						userInput = scan.next();
			
		} while (userInput.equalsIgnoreCase("y");
				

	}

}
