package finished;
import java.util.Scanner;

public class Cross {
	
//Create a program that asks the user for an integer N. 
//The program must print an X shape that is N-characters wide and N-characters high.
//For instance, if N = 3, then the program would print the following symbol:

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a word which length is odd");
		String m = input.nextLine();
		int n = m.length();
		System.out.println("");
		
		if (n < 3 || n > 20 || (n % 2 == 0))
		{
			System.out.println("The size must be greater than 3 and less than 20 and odd.");
			return;
		}
		
		char[][] cross = new char[n][n];
		for (int r = 0; r < n; r++)
			for (int c = 0; c < n; c++)
				cross[r][c] = ' ';
		
		for (int t = 0; t < n; t++)
		{
			cross[t][t] = m.charAt(t);
			cross[t][n - t - 1] = m.charAt(t);
		}
		
		for (int t = 0; t < n; t++)
			System.out.println(cross[t]);
	}
}
