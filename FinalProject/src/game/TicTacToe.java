package game;

import java.util.Scanner;
import java.util.Random;

//This is tic tac toe game made in Java. 
public class TicTacToe {
	static Scanner input = new Scanner(System.in);
	static Random side = new Random();
	static String userMove;
	static String userSymbol;
	static String player1;
	static String player2;
	public static void main(String[] args) {
	
		final int SIZE = 3;
		char[][] board = new char[SIZE][SIZE]; //game board
		resetBoard(board); // initialize the board (with ' ' for all cells)
		
		System.out.println(" _   _      _             _             \r\n" + 
				"| | (_)    | |           | |            \r\n" + 
				"| |_ _  ___| |_ __ _  ___| |_ ___   ___ \r\n" + 
				"| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\\r\n" + 
				"| |_| | (__| || (_| | (__| || (_) |  __/\r\n" + 
				" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
		
		System.out.println();
		System.out.println("Welcome to tic tac toe!");
		System.out.println("Which Symbol would you want to play, \"x\" or \"o\"? ");
		 userSymbol = input.nextLine();
		 if(userSymbol == "x");
		 {
			 
		 }
		 
		System.out.println("Would you like to go first \"1\" or second \"2\"? ");
		userMove = input.nextLine();
		
		
		
		showBoard(board);
		
		
		

	}
	private static void resetBoard(char[][] board) 
	{
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				board[i][j] = ' ';
		
	}
	private static void showBoard(char[][] board) 
	{
		int numRow = board.length;
		int numCol = board[0].length;
		
		System.out.println();
		//First write the column header
		System.out.print("   ");
		for (int i =0; i < numCol; i++)
			System.out.print(i + "    ");
		System.out.print('\n');
		System.out.println(); // blank line after header
		
		//Then write the table
		for(int i = 0; i < numRow; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < numCol; j++) {
				if ( j != 0)
					System.out.print("|");
				System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
			if(i != (numRow -1)) {
				// separator line
				System.out.print("   ");
				for(int j = 0; j < numCol; j++) {
					System.out.print("+");
					System.out.print("---");
				}
				System.out.println();
			}
		}
		System.out.println();
		
	}
	public static void board()
	{
		
		
		 
	}

}
