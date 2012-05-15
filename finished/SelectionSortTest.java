package finished;

import java.util.Random;
import java.util.Scanner;


public class SelectionSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int smalln, bign, runs;
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the smallest N");
		smalln = input.nextInt();
		System.out.println("Insert biggest N");
		bign = input.nextInt();
		System.out.println("Number of runs");
		runs = input.nextInt();
		
		for (int i = 0; i < runs; i++) {
			System.out.println("Run #" + (i+1));
			int[] array = new int[smalln + new Random().nextInt(bign - smalln + 1)];
			for (int j = 0; j < array.length; j++) 
				array[j] = new Random().nextInt();

			long start = System.currentTimeMillis();
			sort(array);
			long end = System.currentTimeMillis();
			
			System.out.println(end - start);
			
		}
		
	}
	/**
	 * Selection sort
	 * @param array to be sorted
	 */
	static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j])
					min = j;
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

}
