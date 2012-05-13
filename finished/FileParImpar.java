package finished;



import java.io.FileReader;
import java.util.Scanner;

public class FileParImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader;
		try
		{
			reader = new Scanner(new FileReader("parimpar.in"));
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}

		int lines = reader.nextInt();
		reader.nextLine();
		for (int i = 0; i < lines; i++) {
			String[] numbers = reader.nextLine().split(" ");
			int par = 0;
			int impar = 0;
			for (int j = 1; j < numbers.length; j++) {
				if(Integer.parseInt(numbers[j])%2 == 0)
					par++;
				else
					impar++;
			}
			if(par > impar)
				System.out.println("PAR");
			else if(par < impar)
				System.out.println("IMPAR");
			else
				System.out.println("EMPATE");
 		}
		
		System.out.println("<END>");
		reader.close();

	}

}
