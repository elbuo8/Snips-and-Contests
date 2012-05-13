package finished;
import java.util.Random;
import java.util.Scanner;

public class GiftExchange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Insert first list");
		String[] array1 = input.nextLine().split(",");
		
		System.out.println("Insert second list");
		String[] array2 = input.nextLine().split(",");
		
		if(array1.length != array2.length)
		{
			System.out.println("Not the same length bish");
			return;
		}
		
		
		Random randomizer = new Random(); // WOOT.
		String swap1;
		for (int i = array1.length-1; i > 0; i--)
		{
			int random = randomizer.nextInt(i+1);
			swap1 = array2[i];
			//swap2 = array2[random];
			//array2[i] = swap2;
			//array2[random] = swap1;
			array2[i] = array2[random];
			array2[random] = swap1;
		}
		
		
		for(int i = 0; i < array1.length; i++)	
		{
			System.out.println(array1[i] + "," + array2[i]);
		}
		
	}

}
