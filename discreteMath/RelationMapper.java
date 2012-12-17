package discreteMath;

import java.util.Scanner;

public class RelationMapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Insert A separated by commas.");
		Scanner input = new Scanner(System.in);

		String[] parseInput = input.nextLine().split(",");

		int[][] matrix1 = new int[parseInput.length][parseInput.length];
		int[][] matrix2 = new int[parseInput.length][parseInput.length];
		int[] resultMatrix = new int[parseInput.length*parseInput.length];

		
		System.out.println("Insert Matrix");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = input.nextInt();
				matrix2[i][j] = matrix1[i][j];
			}
		}

		int iterations = 2;
		
		for (int m = 0; m < iterations; m++) {
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
			
			int k = 0;
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[0].length; j++) {
					matrix1[i][j] = resultMatrix[k++];
				}
			}
			
			//print pares ordenados.
			System.out.print("{");
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[0].length; j++) {
					if(matrix1[i][j] == 1) System.out.print("(" + parseInput[i] + ", " + parseInput[j] + ")");
				}
			}
			System.out.println("}");
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
