package finished;


import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class alphabeticalFile {

	/**
	 * Create a program that receives a list of lowercase words and prints them in alphabetical order. 
	 * The words must be read from a text file called "alpha_file.txt". The file will begin with a single integer N, 
	 * indicating the number of words in the file, where N > 0. The next N lines will contain one word each.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader;
		//Scanner input = new Scanner(System.in);
		
		try
		{
			reader = new Scanner(new FileReader("alpha_file.txt"));
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}
		int lines = reader.nextInt();
		
		String[] words = new String[lines];
		
		for(int i = 0; i < lines; i++)
			words[i] = reader.nextLine();
		
		Arrays.sort(words);
		
		for(int i = 0; i < lines; i++)
			System.out.println(words[i]);
	}

}
