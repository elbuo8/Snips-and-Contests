package finished;


import java.util.Scanner;

public class ZombieLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		String[] latin = text.split(" ");
 
		String result = "";
		
		for (int i = 0; i < latin.length; i++) {
			if(!latin[i].equals("brains") && !latin[i].equals("brain")) {
			result += latin[i].substring(1,latin[i].length());
			result += latin[i].substring(0, 1);
			result += "uugh ";	
			}
			else {
				result += latin[i];
				result += "nom ";
			}
		}

		System.out.println(result);

	}

}
