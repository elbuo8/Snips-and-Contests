package finished;
import java.util.Scanner;


public class TriangleDrw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number bigger or equal to 1");
		int N = input.nextInt();
		if(N < 1)
		{
			System.out.println("Number wasn't bigger than 1");
			System.exit(N);
		}
		String hash = "#";
		for (int i = 1; i <= N; i++)
		{
			System.out.println(hash);
			hash += "#";
		}
		for (int j = 1; j <= N; j++)
		{
			hash = hash.substring(0,hash.length()-1);
			System.out.println(hash);
		}
		
	}

}
