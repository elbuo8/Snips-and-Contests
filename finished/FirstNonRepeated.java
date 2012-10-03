package finished;

import java.util.Scanner;

public class FirstNonRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String parse = new Scanner(System.in).nextLine();
		for (int i = 0; i < parse.length(); i++) {
			String letter = parse.substring(i, i+1);
			//System.out.println(parse.substring(0, i) + "," + parse.substring(i, parse.length()));
			if(!parse.substring(0, i).contains(letter) && !parse.substring(i+1, parse.length()).contains(letter)) {
				System.out.println(parse.charAt(i));
				return;
			}
		}

	}

}
