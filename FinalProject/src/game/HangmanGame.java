package game;

import java.util.Scanner;
import java.util.Random;


/* This program is basically a hangman game but written in Java. Made for classwork/entertainment purposes only.
// It will show the gallows, add a limb each time you get it wrong, and show you the letters that you have guessed. 
Chooses a random word from the string array to use for the game */
public class HangmanGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		char userGuess;
		//Create string array for words that are used in game. 
		String [] words = {"royal", "heavy", "scuzz", "memes", "dizzy", "abuzz"};
		//Randomly select a word from the word array.
		int word = random.nextInt(words.length);
		String hiddenWord = words[word];
		//System.out.println("Welcome to Hangman!");
		//System.out.println("Your word is " + words[word]);
		display();
		hangman();
		//Replaces all the characters in the word with "-"s
		for(int x = 0; x < hiddenWord.length(); x++)
		{
			System.out.print(hiddenWord.replaceAll(".+", "-"));
		}
		System.out.println();
		System.out.println("Please guess a letter!");
		
		/* Using placeholder variables to show an example of replacing hidden characters with correct ones the user guesses. 
		.indexOf detects to see if the character is in the string, if it is it returns a positive number, if not it returns a negative number.
		We put in an if statement for when the user correctly guesses a letter in the word. 
		
		if(words[word].indexOf(userGuess) != -1)
		{
			hiddenWord = words[word].replace('-', userGuess);
			System.out.println(hiddenWord)
		}
		*/
	}
	
	// Used to display hangman gallows
	public static void hangman()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|	    \r\n" + 
				"|	       \r\n" + 
				"|     	     \r\n" + 
				"|                  \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
		
		hangmanHead();
		
	}
	
	public static void hangmanHead()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|      (-_-)\r\n" + 
				"|\r\n" + 
				"|	       \r\n" + 
				"|     	     \r\n" + 
				"|                  \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
		hangmanRightArm();
	}
	
	public static void hangmanRightArm()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|      (-_-)\r\n" + 
				"|        |	\r\n" + 
				"|      / | \r\n" + 
				"|     	     \r\n" + 
				"|                  \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
		hangmanLeftArm();
	}
	
	public static void hangmanLeftArm()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|      (-_-)\r\n" + 
				"|        |	\r\n" + 
				"|      / | \\\r\n" + 
				"|     	     \r\n" + 
				"|                  \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
		hangmanRightLeg();
	}
	
	public static void hangmanRightLeg()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|      (-_-)\r\n" + 
				"|        |	\r\n" + 
				"|      / | \\\r\n" + 
				"|        |   \r\n" + 
				"|      /   \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
		hangmanLeftLeg();
	}
	
	public static void hangmanLeftLeg()
	{
		System.out.println("__________\r\n" + 
				"|        |\r\n" + 
				"|        |\r\n" + 
				"|     -------\r\n" + 
				"|      (-_-)\r\n" + 
				"|        |	\r\n" + 
				"|      / | \\\r\n" + 
				"|        |   \r\n" + 
				"|      /   \\ \r\n" + 
				"|  	      \r\n" + 
				"|_________\r\n" + 
				"\r\n" + 
				"");
	}
	
	// Displays the intro to hangman, for style
	public static void display()
	{
		System.out.println(" _                                             \r\n" + 
				"| |                                            \r\n" + 
				"| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \r\n" + 
				"| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \r\n" + 
				"| | | | (_| | | | | (_| | | | | | | (_| | | | |\r\n" + 
				"|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\r\n" + 
				"                    __/ |                      \r\n" + 
				"                   |___/                       ");
	}

}
