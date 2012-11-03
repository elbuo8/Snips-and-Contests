package code2040;

import java.util.Scanner;

/**
 * 
 * @author yamilasusta
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		char[][] board = new char[9][9]; 
		buildBoard(board); //Initialize
		printBoard(board); //Print board
		
		//Prepare for inputs
		String prompt = "Enter a move: ";
		System.out.print(prompt);
		Scanner input = new Scanner(System.in);
		String movesInput = input.nextLine().toLowerCase();
		
		//Game loop
		while (!movesInput.equals("quit")) {
			move(board, movesInput);
			printBoard(board);
			System.out.print(prompt);
			movesInput = input.nextLine();
		}
		return;
		
	}
	
	/**
	 * Perform a swap and also verify that the move is valid
	 * @param board
	 * @param move
	 */
	static void move(char[][] board, String move) {
		
		//Obtain the piece
		int row = Integer.parseInt(move.substring(1,2));
		int column = move.charAt(0) - 'a' + 1; //small cheat to map in positions
		
		//Instructions don't mention out of bounds cases but verify anyways
		if(column < 1 || column > 8 || row < 1 || row > 8) return;
		
		//Save the piece and empty the space
		char piece = board[row][column];
		board[row][column] = Character.UNASSIGNED;
		
		//Obtain empty space location in order to verify
		row = Integer.parseInt(move.substring(4,5));
		column = move.charAt(3) - 'a' + 1;
		
		//Instructions don't mention out of bounds cases but verify anyways
		if(column < 1 || column > 8 || row < 1 || row > 8) return;
		
		//Perform movement
		board[row][column] = piece;
		return;
			
	}

	/**
	 * Build board to present it to user
	 * @param board Representation of the board on a 2D char array
	 */
	static void buildBoard(char[][] board) {
		
		//Leave upper left corner empty
		board[0][0] = ' ';
		
		//Small cheat
		char[] back = "RNBKQBNR".toCharArray();
		
		//Build top boarder 
		//Added the build of side border of the board 
		//Build top row 
		//Added all letters
		for (int i = 1; i < board.length; i++) {
			board[0][i] = (char) ('a' + i - 1); //Fill top
			board[i][0] = (char) ('1' + i - 1); //Fill Side
			board[1][i] = back[i-1]; // Fill top row
			board[8][i] = back[i-1]; //Fill last row
			board[2][i] = 'P'; //Fill remaining rows
			board[7][i] = 'P';
		}
		return;
	}

	/**
	 * Print the board on terminal
	 * @param board
	 */
	static void printBoard(char[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == Character.UNASSIGNED) System.out.print('-'); //If not assigned replace with -
				else System.out.print(board[i][j]); //If assigned print content
				System.out.print(' '); //Make it pretty by adding spaces
			}
			System.out.println(); //Next line
		}
		return;
	}
	
}
