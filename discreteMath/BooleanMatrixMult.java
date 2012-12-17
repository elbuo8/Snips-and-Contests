package discreteMath;

import java.util.Scanner;

public class BooleanMatrixMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert dimensions in #x# format");
		Scanner input = new Scanner(System.in);

		String[] parseInput = input.nextLine().split("x");

		int[][] matrix1 = new int[Integer.parseInt(parseInput[0])][Integer.parseInt(parseInput[1])];
		int[][] matrix2 = new int[Integer.parseInt(parseInput[1])][Integer.parseInt(parseInput[0])];
		int[] resultMatrix = new int[Integer.parseInt(parseInput[0])*Integer.parseInt(parseInput[0])];

		
		System.out.println("First Matrix");
		for (int i = 0; i < matrix1.length; i++) 
			for (int j = 0; j < matrix1[0].length; j++) 
				matrix1[i][j] = input.nextInt();

		System.out.println("Second Matrix");
		for (int i = 0; i < matrix2.length; i++) 
			for (int j = 0; j < matrix2[0].length; j++) 
				matrix2[i][j] = input.nextInt();


		int index = 0;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				int[] parseArray = new int[matrix1[0].length];
				for (int k = 0; k < matrix1[0].length; k++) {
					parseArray[k] = matrix1[i][k]*matrix2[k][j];
				}
				
				resultMatrix[index++] = containsOne(parseArray) ? 1 : 0;
			}
		}
		
		
		for (int i = 0; i < resultMatrix.length; i++) {
			if(i % matrix1.length == 0) System.out.println();
			System.out.print(resultMatrix[i] + " ");

		}

	}
	
	static boolean containsOne(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				return true;
			}
		}
		return false;
	}

}
