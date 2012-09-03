package finished;

import java.util.Scanner;

/**
 * 
 * @author yamilasusta
 *
 */
public class TicTacToe1 {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		
		int player = input.nextInt();
		System.out.println(player + 1);
		int z = player + player;
		
		input.nextLine();

		//read the board.
		for (int i = 0; i < matrix.length; i++) {
			String[] parsedInput = input.nextLine().split(" ");
			for (int j = 0; j < parsedInput.length; j++) {
				matrix[i][j] = Integer.parseInt(parsedInput[j]);
			}
		}
		
		if(findSpot(matrix, player).contains(",")) {
			String[] parse = findSpot(matrix, player).split(",");
			try {
				
			} catch (Exception e) {

			}
			
			
		}
		else {
			findEmptySpot(matrix, player);
		}
		
		
		
	}
	

	static String findSpot(int[][] matrix, int player) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == player) {
					return i + "," + j;
				}
			}
		}
		return "";
	}
	
	static void findEmptySpot(int[][] matrix, int player) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == -1) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
