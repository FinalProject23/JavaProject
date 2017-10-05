import java.util.Scanner;
import java.util.Random;




/* This program is basically a hangman game but written in Java. Made for classwork/entertainment purposes only.
+// It will show the gallows, add a limb each time you get it wrong, and show you the letters that you have guessed. 
+Chooses a random word from the string array to use for the game */
public class Hangman {
	
static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) 
	{
				//Create a char array of 26 characters.
				//abcdefghijklmnopqrstuvwxyz
				char[]array = new char[26];
				int index = 0;
				for(char c = 'a'; c <= 'z'; c++) {
					array[index++] = c;
				}
				Random random = new Random();
		 		//Create string array for words that are used in game. 
		 		String [] words = {"royal", "heavy", "failure", "memes", "symbolic", "big"};
		 		//Randomly select a word from the word array.
				int word = random.nextInt(words.length);
		 		//System.out.println("Welcome to Hangman!");
		 		//System.out.println("Your word is " + words[word]);
		 		System.out.println(" _                                             \r\n" + 
		 				"| |                                            \r\n" + 
		 				"| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \r\n" + 
		 				"| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \r\n" + 
		 				"| | | | (_| | | | | (_| | | | | | | (_| | | | |\r\n" + 
		 				"|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\r\n" + 
						"                    __/ |                      \r\n" + 
		 				"                   |___/                       ");
		 		
		 		hangman();
		
		
		

	}
	//Used to display hangman gallows
	public static void hangman()
	{
		System.out.println(" Please guess a letter!");
		 userguess = input.nextLine();
	}

}