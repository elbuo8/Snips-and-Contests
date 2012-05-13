package finished;

import java.io.FileReader;
import java.util.Scanner;

public class BalancedParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader;
		try
		{
			reader = new Scanner(new FileReader("PARENTESIS.TXT"));
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}

		
		while (reader.hasNext()) {
			String parse = reader.nextLine();
			int left = 0;
			int right = 0;
			boolean valid = true;
			for (int i = 0; i < parse.length(); i++) {
				char cheat = parse.charAt(i);
				if(cheat == '(')
					left++;
				else if(cheat == ')')
					right++;
				
				if (right > left)
					valid = false;
			}
			
			if(valid)
				System.out.println(parse + " IS WELL-FORMED");
			else 
				System.out.println(parse + " IS NOT WELL-FORMED");
		}
		reader.close();

	}

}
