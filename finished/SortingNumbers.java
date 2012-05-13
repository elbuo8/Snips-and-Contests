package finished;
import java.util.Scanner;
//import java.util.Arrays;


public class SortingNumbers {

	/**
	 Create a program that receives a list of integers from the user, ranging from -1000000 to 1000000. 
	 The integers will be on a single line and separated by commas.
	 For the purposes of this exercise, you may not ask the user for the number of integers to be submitted ahead.
	 Once the numbers have been submitted, your program must organize the integers in increasing order and print them out. 
	 The output must also be separated by commas.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insert a bunch of numbers separated by coma bitch");
		String[] array1 = input.nextLine().split(",");
		int length = array1.length;
		int[] array2 = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			array2[i] = Integer.parseInt(array1[i]); 
		}
		
		for(int i = 0; i < length; i++)
		{
			if(array2[i] > 1000000 || array2[i] < -1000000)
			{
				System.out.println("Not in range");
				return;
			}
		}
		
//		Arrays.sort(array2);
		
//		Bubble Sort Test
		int swap;
		boolean swapped = true;
		
		while(swapped)
		{
			for(int i = 1; i <= length-1; i++)
			{
				if(array2[i-1] > array2[i])
				{
					swap = array2[i];
					array2[i] = array2[i-1];
					array2[i-1] = swap;
					swapped = true;
				}
				else
					swapped = false;
			}
		}
		
		
		
		
		for (int i = 0; i < length; i++)
		{
			if(i == length -1 )
			{
				System.out.print(array2[i]);
			}
			else
			{
				System.out.print(array2[i] + ",");
			}

		}

	}

}
