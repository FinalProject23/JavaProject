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
	//static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static char[] guessedLetters = new char[26];
	//Randomly select a word from the word array.
	static int word = random.nextInt(words.length);
	static String hiddenWord = words[word], newHiddenWord = null;
	static String letterAt = null;
	//Number of tries will be 6 so the hangman methods can properly execute.
	static int numberOfTries = 6;
	
	public static void main(String[] args) {
		display();
		hangman();
		boolean wordGuessed, lostGame = false;
		
		//Replaces all the characters in the word with "-"s
		for(int x = 0; x < hiddenWord.length(); x++)
			newHiddenWord = hiddenWord.replaceAll(".", "-");
		
		System.out.println();
		System.out.println(newHiddenWord);
		
		do {
		
		System.out.println("Guess a (lowercase plz) letter!");
		userGuess = input.next().charAt(0);
		
		/* Replacing hidden characters with correct ones the user guesses. 
		.indexOf detects to see if the character is in the string, if it is it returns a positive number, if not it returns a negative number.
		We put in an if statement for when the user correctly guesses a letter in the word. */
		
		if(hiddenWord.indexOf(userGuess) != -1)
		{
			letterAt = hiddenWord;
			//newHiddenWord = newHiddenWord.replace();
			System.out.println(newHiddenWord);
			System.out.println("Correct!");
			
			//Use replaceAll to select regex (specific character) to replace. Replace the dashes with the userGuess character so that way
			//the non matching characters can stay as dashes.
		}
		else
		{
			numberOfTries = numberOfTries - 1;
			//If statements to display the other methods for gallows. Never repeats because the numberOfTries value always goes down by one,
			//making the code move onto the next one each time. 
			if(numberOfTries == 5)
			{
				hangmanHead();	
			}

			if(numberOfTries == 4)
			{
				hangmanRightArm();
			}
				
			if(numberOfTries == 3)
			{
				hangmanLeftArm();
			}
					
			if(numberOfTries == 2)
			{	
				hangmanRightLeg();
			}
			
			if(numberOfTries == 1)
			{
				hangmanLeftLeg();
				System.out.println("Oh, too bad! You lost! :(");
				System.out.println("The actual word was " + hiddenWord);
				lostGame = true;
			}	
			
			System.out.println(guessedLetters);
			System.out.println(newHiddenWord);
			System.out.println("Incorrect!");
		}
		
		if(newHiddenWord.equals(hiddenWord))
		{
			wordGuessed = true;
			if(wordGuessed)
			{
				victoryScreen();
			}
			
		}
	}while(lostGame);
		
	}
	
	
	private static void victoryScreen() {
		System.out.println(hiddenWord);
		System.out.println("Congratulations! You won!");
		GameChooser.main(words);
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

}
