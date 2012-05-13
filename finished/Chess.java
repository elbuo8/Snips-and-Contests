package finished;



import java.io.FileReader;
import java.util.Scanner;

public class Chess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner reader;
		try
		{
			reader = new Scanner(new FileReader("damas.in"));
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}

		int lines = reader.nextInt();
		reader.nextLine();

		boolean[][] matrix = new boolean[8][8];

		String header = " 1 2 3 4 5 6 7 8";

		String type = reader.nextLine();

		for (int i = 0; i < lines; i++) {
			char[] parse = reader.nextLine().toCharArray();
			matrix[Character.getNumericValue(parse[0])-1][Character.getNumericValue(parse[2])-1] = true;
		}

		int[] counter = new int[8];

		if(type.equals("F")) {	
			for (int i = 0; i < lines; i++) 
				for (int j = 0; j < lines; j++) 
					if (matrix[i][j] == true) 
						counter[i] += 1;
		}
		else {
			for (int i = 0; i < lines; i++) 
				for (int j = 0; j < lines; j++) 
					if (matrix[i][j] == true) 
						counter[j] += 1;		
		}

		int max = counter[0];
		int index = 0;
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] > max) {
				max = counter[i];
				index = i;
			}
		}
		index += 1;
		String result = "";
		if (type.equals("F"))
			result = "Fila con valor mayor: " + index + " Total: " + max;
		else
			result = "Columna con valor mayor: " + index + " Total: " + max;
		System.out.println(result);
		System.out.println();
		System.out.println(header);
		for (int i = 0; i < counter.length; i++) {
			System.out.print(i + 1);
			for (int j = 0; j < counter.length; j++) {
				if (matrix[i][j] == true) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		reader.close();



	}
}