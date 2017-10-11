package game;

import java.util.Scanner;
import java.util.Random;

//This is tic tac toe game made in Java. 
public class TicTacToe {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		Random side = new Random();
		int userSide;
		
		
		System.out.println(" _   _      _             _             \r\n" + 
				"| | (_)    | |           | |            \r\n" + 
				"| |_ _  ___| |_ __ _  ___| |_ ___   ___ \r\n" + 
				"| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\\r\n" + 
				"| |_| | (__| || (_| | (__| || (_) |  __/\r\n" + 
				" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
		
		System.out.println();
		System.out.println("Welcome to tic tac toe! Enter 1 or 2 >> ");
		userSide = input.nextInt();
		
		
		grid();

	}
	public static void grid()
	{
		
	}

}
