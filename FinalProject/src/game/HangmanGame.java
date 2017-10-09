package game;

import java.util.Scanner;
import java.util.Random;


/* This program is basically a hangman game but written in Java. Made for classwork/entertainment purposes only.
// It will show the gallows, add a limb each time you get it wrong, and show you the letters that you have guessed. 
Chooses a random word from the string array to use for the game */
public class HangmanGame {

	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	static char userGuess = 0;
	//Create string array for words that are used in game. 
	static String [] words = {"royal", "heavy", "scuzz", "memes", "dizzy", "abuzz"};
	static char [] guessedLetters = new char[26];
	//Randomly select a word from the word array.
	static int word = random.nextInt(words.length);
	static String hiddenWord = words[word], newHiddenWord = null;
	
	public static void main(String[] args) {
		//System.out.println("Welcome to Hangman!");
		//System.out.println("Your word is " + words[word]);
		display();
		hangman();
		//Replaces all the characters in the word with "-"s
		
		for(int x = 0; x < hiddenWord.length(); x++)
			newHiddenWord = hiddenWord.replaceAll(".+", "-");
		
		System.out.println();
		System.out.println(newHiddenWord);
		System.out.println("Please guess a letter!");
		userGuess = input.next().charAt(0);
		
		/* Replacing hidden characters with correct ones the user guesses. 
		.indexOf detects to see if the character is in the string, if it is it returns a positive number, if not it returns a negative number.
		We put in an if statement for when the user correctly guesses a letter in the word. */
		
		
		
		if(words[word].indexOf(userGuess) != -1)
		{
			hiddenWord = words[word].replace('-', userGuess);
			System.out.println(hiddenWord);
		}
		else
		{
			System.out.println("Incorrect!");
			System.out.println(newHiddenWord);
			hangmanHead();
		}
		
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
	
	public static void characterInWord()
	{
		
	        
	   
	}

}
