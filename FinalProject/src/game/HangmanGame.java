package game;

import java.util.Scanner;
import java.util.Random;



/* This program is basically a hangman game but written in Java. Made for classwork/entertainment purposes only.
// It will show the gallows, add a limb each time you get it wrong, and show you the letters that you have guessed. 
Chooses a random word from the string array to use for the game */
<<<<<<< HEAD
public class HangmanGame
{
=======
public class HangmanGame {

>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	static char userGuess = 0;
	//Create string array for words that are used in game. 
	static String [] words = {"royal", "heavy", "scuzz", "memes", "dizzy", "abuzz"};
<<<<<<< HEAD
	static char [] alaphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
=======
	static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
	static char [] guessedLetters = new char[26];
	//Randomly select a word from the word array.
	static int word = random.nextInt(words.length);
	static String hiddenWord = words[word], newHiddenWord = null;
<<<<<<< HEAD
	
	public static void main(String[] args) 
	{
=======
	static int letterAt = 0;
	
	public static void main(String[] args) {
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
		//System.out.println("Welcome to Hangman!");
		//System.out.println("Your word is " + words[word]);
		display();
		hangman();
<<<<<<< HEAD
		//Replaces all the characters in the word with "-"s
	
		for(int x = 0; x < hiddenWord.length(); x++)
		newHiddenWord = hiddenWord.replaceAll(".", "-");

		System.out.println();
		System.out.println(newHiddenWord);
		System.out.println(" Welcome to hangmen! Press Y to play!");
		userGuess = input.next().charAt(0);
		System.out.println("Please guess a letter. The word is 5 letters long");
		userGuess = input.next().charAt(0);
		
			
		
=======
		
		//Replaces all the characters in the word with "-"s
		for(int x = 0; x < hiddenWord.length(); x++)
			newHiddenWord = hiddenWord.replaceAll(".", "-");
		
		System.out.println();
		System.out.println(newHiddenWord);
		
		do {
		System.out.println("Guess a letter!");
		userGuess = input.next().charAt(0);
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
		
		/* Replacing hidden characters with correct ones the user guesses. 
		.indexOf detects to see if the character is in the string, if it is it returns a positive number, if not it returns a negative number.
		We put in an if statement for when the user correctly guesses a letter in the word. */
		
<<<<<<< HEAD
			
		
		
		if(words[word].indexOf(userGuess) != -1)
		{
			hiddenWord = words[word].replace('-', userGuess);
			System.out.println("You guessed the letter correctly!");
		}
		else
		{
			System.out.println("Incorrect!");
			System.out.println(newHiddenWord);
			hangmanHead();
			
		}
		
	}
=======
		if(hiddenWord.indexOf(userGuess) != -1)
		{
			
			newHiddenWord = newHiddenWord.replace('-', userGuess);
			System.out.println(newHiddenWord);
			System.out.println("Correct!");
		}
		else
		{
			hangmanHead();
			System.out.println("Incorrect!");
			System.out.println(guessedLetters);
			System.out.println(newHiddenWord);
		}
	}while(!newHiddenWord.equals("-"));
		
	}
	
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
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
<<<<<<< HEAD
		
		
		
	
}
=======
	}
	
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
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
<<<<<<< HEAD
		
	}

=======
	}
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
	
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
<<<<<<< HEAD
		
=======
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
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
<<<<<<< HEAD
		
=======
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd
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
		
<<<<<<< HEAD
=======
	        
	   
	}
>>>>>>> 1ac47ddeca0a2dabc704905a2dc41637e31813cd

}
}
