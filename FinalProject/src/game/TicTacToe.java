package game;

import java.util.Scanner;
import java.util.Random;

//This is tic tac toe game made in Java. 
public class TicTacToe {
	static Scanner input = new Scanner(System.in);
	static Random side = new Random();
	static char userSide;
  
	public static void main(String[] args) {
		final int SIZE = 3;
		char[][] board = new char[SIZE][SIZE]; //game board
		resetBoard(board); // initialize the board (with ' ' for all cells)
		display();
		
		System.out.println();
		System.out.println("Welcome to tic tac toe!");
		showBoard(board);
		System.out.println("User 1, choose X or O: ");
		userSide = input.next().charAt(0);
		
		if(userSide == 'X' || userSide == 'x')
		{
			
		}
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
	
	public static void display()
	{
		System.out.println(" _   _      _             _             \r\n" + 
				"| | (_)    | |           | |            \r\n" + 
				"| |_ _  ___| |_ __ _  ___| |_ ___   ___ \r\n" + 
				"| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\\r\n" + 
				"| |_| | (__| || (_| | (__| || (_) |  __/\r\n" + 
				" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
	}

}