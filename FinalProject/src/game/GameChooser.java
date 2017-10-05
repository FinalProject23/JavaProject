package game;

import java.util.Scanner;

public class GameChooser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your game: \n1 for Hangman \n2 for Tic Tac Toe");
		int game = input.nextInt();
		
		if(game == 1)
		{
			HangmanGame.main(args);
		}
		else
		{
			TicTacToe.main(args);
		}
		
		

	}

}
