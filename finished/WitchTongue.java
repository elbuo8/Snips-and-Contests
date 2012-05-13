package finished;


import java.util.Scanner;

//import java.util.Scanner;

public class WitchTongue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letters = "abcdefghijklmnopqrstuvwxyz";
		
		String solver = "the magic words are squeamish ossifrage";
		solver = solver.replace(" ", "");
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		message = message.replace(" ", "");
		String result = "";
		int checker;
		int i = 0;
		int length = message.length();
		do {
			checker = 26 - letters.indexOf(solver.charAt(i));
			if(checker + (letters.indexOf(message.charAt(i))-1) > 26)
			{
				checker = letters.indexOf(message.charAt(i)) - letters.indexOf(solver.charAt(i));
			}
			else {
				checker += letters.indexOf(message.charAt(i));   
			}

			result += letters.charAt(checker);
			i++;

		} while (i < length);
		
		
		System.out.println(result);
	}

}
