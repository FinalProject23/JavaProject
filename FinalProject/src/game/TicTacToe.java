package game;

import java.util.Scanner;
import java.util.Random;

//This is tic tac toe game made in Java. 
public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static Random side = new Random();
	static char player1Symbol;
	static char player2Symbol;
	static int userSide;

	public static void main(String[] args) {
		final int SIZE = 3;
		char[][] board = new char[SIZE][SIZE]; //game boar
		resetBoard(board); // initialize the board (with ' ' for all cells)

		System.out.println(" _   _      _             _             \r\n" + 
				"| | (_)    | |           | |            \r\n" + 
				"| |_ _  ___| |_ __ _  ___| |_ ___   ___ \r\n" + 
				"| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\\r\n" + 
				"| |_| | (__| || (_| | (__| || (_) |  __/\r\n" + 
				" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
		
		System.out.println();
		System.out.println("Welcome to tic tac toe!");
		System.out.println("Which Symbol would you like to play as, \"x\" or \"o\"? ");
		 char player1Symbol = sc.next().toLowerCase().charAt(0);
		 char player2Symbol = (player1Symbol == 'x') ? 'o' : 'x';
		 System.out.println("Player 2 will be " + player2Symbol + ".");
		 
		System.out.println("Would you like to go first \"1st\" or second \"2nd\"? ");
		char player1Move = sc.next().toLowerCase().charAt(0);
		char player2Move = (player1Move == '1') ? '2' : '1';
		showBoard(board);
	
	

		int turn; // 0 -- the player1, 1 -- the player2
		int remainCount = SIZE * SIZE; // empty cell count
		//The First Move.
		if(player1Move == '1')
		{
			turn = 0;
			user1Play(board, player1Symbol); // player1 puts his/her first tic
			
		}
		else {
			turn = 1;
			user2Play(board, player2Symbol); // player2 puts his/her first tic
		}
		//Show board and decrement the count of remaining cells.
		showBoard(board);
		remainCount --;
		// Counting playing the game until Player1 or Player2 wins
		boolean done = false;
		int winner = -1; // 0 -- the user, 1 -- the computer. -1 -- draw
		while(!done && remainCount > 0) {
			// If there is a winner at this time, set t he winner and the done flag to true.
			done = isGameWon(board, turn, player1Symbol, player2Symbol); // Did the turn won?
			if(done)
				winner = turn; // the one who made the last move won the game
			else {
				// No winner yet. Find the next turn and play.
				turn = (turn + 1 ) % 2;
				
				if (turn == 0)
					user1Play(board,player1Symbol);
				else
					user2Play(board,player2Symbol);
				//Show the board after done tic and decrement the rem count.
				showBoard(board);
				remainCount--;
					
			}
		}
		
		//Winner is found. Declare winner.
		if (winner == 0)
			System.out.println("\n** Player 1 won! Congratulations!!.. try bex time player2! **");
		else if (winner == 1)
			System.out.println("\n** Player 2 won! Congratulations!!.. try next time player1! **");
		else 
			System.out.println("\n** It seems to have become a Draw **");
	
	}

	private static void resetBoard(char[][] board) 

	{
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				board[i][j] = ' ';
		
	}

	private static void showBoard(char [][] board) 
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

	public static void user1Play(char[][] board, char player1Symbol)
	{
		System.out.print("\nPlayer 1 will go first please enter the row number and then the column number that you wish to place your piece");
		int rowIndex = sc.nextInt();
		int colIndex = sc.nextInt();
		
		while (board[rowIndex][colIndex] != ' ') {
			System.out.print("\n!! The cell is already taken. \nEnter the row  number and then the column number that you wish to place your piece: ");
			rowIndex = sc.nextInt();
			colIndex = sc.nextInt();
			
		}
		 board[rowIndex] [colIndex] = player1Symbol;
	}
	public static void user2Play(char [][] board, char player2Symbol)
	{
		System.out.print("\nPlayer 2 will go first please enter the row number and then the column number you that wish to place your piece");
		int rowIndex = sc.nextInt();
		int colIndex = sc.nextInt();
		
		while (board[rowIndex][colIndex] != ' ') {
			System.out.print("\n!! The cell is already taken. \nEnter the row number and then the column number that you wish to place your piece: ");
			rowIndex = sc.nextInt();
			colIndex = sc.nextInt();
	}
		board[rowIndex][colIndex] = player2Symbol;
	}
	public static boolean isGameWon(char[][] board, int turn, char player1Symbol, char player2Symbol)
	{
		char symbol;
		if (turn == 0)
			symbol = player1Symbol;
		else
			symbol = player2Symbol;
		int i, j;
		boolean win = false;
		//Check win by a row
		for(i = 0; i < board.length && !win; i++) {
			for (j = 0; j < board[0].length; j++) {
				if (board[i][j]!= symbol)
					break;
			}
			if( j == board[0].length)
				win = true;
		}
		// Check win by a column
		for (j = 0; j < board[0].length && !win; j++) {
			for (i = 0; i < board.length; i++) {
			if(board[i][j] != symbol)
				break;
			}
			if(i == board.length)
				win = true;
			
		}
			//Check win by a diagnoal(2)
		if (!win) {
			for (i = 0; i < board.length; i++) {
				if (board[i][board.length - 1 - i] != symbol)
					break;
			}
			if (i == board.length)
				win = true;
		}
		//Finally return win
		return win;
	}
}	

