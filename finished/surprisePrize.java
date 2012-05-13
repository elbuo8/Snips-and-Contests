package finished;


import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class surprisePrize {

	/**
	 * Create a program that receives a list of names and selects one at random.
	 * The person chosen will be on the receiving end of a surprise Pixie Stix toss. 
	 * The names must be read from a text file called "surprise_prize.txt". 
	 * The file will begin with a single integer N, indicating the number of names in the file, where N > 0. 
	 * The next N lines will contain one name each. You may need to use Java's Random class to complete this program. 
	 * Part of the exercise is finding information on how to use it to choose a name at random from the list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader;
		try
		{
			reader = new Scanner(new FileReader("surprise_prize.txt"));
		}
		catch (Exception e)
		{
			System.out.println("File not found");
			return;
		}
		
		int lines = reader.nextInt();
		reader.nextLine();
		if (lines <= 0)
			return;
		
		String[] words = new String[lines];
		
		for (int i = 0; i < lines; i++)
			words[i] = reader.nextLine();
		
		Random rdm = new Random();
		int random = rdm.nextInt(lines);
		System.out.println("Throw pixie dust at " + words[random]);
	}

}
