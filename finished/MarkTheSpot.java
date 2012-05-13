package finished;
import java.util.Scanner;

public class MarkTheSpot {
	
//Create a program that asks the user for an integer N. 
//The program must print an X shape that is N-characters wide and N-characters high.
//For instance, if N = 3, then the program would print the following symbol:

	/**
	 * @param args
	 */
	//R = 0
	//for [spaces x R] X [spaces x (N-2-2R)] X endln
	//[spaces x ...?] X
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number bitch");
		int N = input.nextInt();
		System.out.println("");
		String X = "X";
		if (N < 3 || N > 20 || (N%2 ==0))
		{
			System.out.println("N has to be bigger than 3 and less than 20 and odd");
			System.exit(0);
		}
		String start = "";
		String middle = "";
		
		int off = 0;
		int center = N - 2;
		for (int i = 0; i < (N/2); i++)
		{
			for(int j = 0; j < off; j++)
			{
				start += " ";
			}
			for (int k = 0; k < center; k++)
			{
				middle += " ";
			}
			off++;
			center -= 2;
			System.out.print(start);
			System.out.print(X);
			System.out.print(middle);
			System.out.println(X);
			start = "";
			middle = "";
			
		}
		int spot = (int) Math.ceil(N/2);
		for(int i = 0; i < spot; i++ )
		{
			start += " ";
		}
		System.out.print(start);
		System.out.println(X);
		
		start = "";
		middle = "";
		
		off = spot;
		center = 1;

		for (int i = 0; i < (N/2); i++)
		{
			for(int j = 0; j < (off - 1); j++)
			{
				start += " ";
			}
			for (int k = 0; k < center; k++)
			{
				middle += " ";
			}
			off --;
			center += 2;
			System.out.print(start);
			System.out.print(X);
			System.out.print(middle);
			System.out.println(X);
			start = "";
			middle = "";
			
		}
			
	}

}
