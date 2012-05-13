package finished;


import java.util.Scanner;

public class CommonLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two words:");
		String[] words = input.nextLine().split(" ");
		String output = "";
		for (int i = 0; i < words[0].length(); i++) {
			boolean contain = words[1].contains(words[0].substring(i, i+1));
			if(contain)
				output+= words[0].substring(i, i+1).toUpperCase();
			else
				output+= words[0].substring(i, i+1);
		}
		output += " ";
		for (int i = 0; i < words[1].length(); i++) {
			boolean contain = words[0].contains(words[1].substring(i, i+1));
			if(contain)
				output+= words[1].substring(i, i+1).toUpperCase();
			else
				output+= words[1].substring(i, i+1);
		}
		System.out.println(output);
	}
	
}
