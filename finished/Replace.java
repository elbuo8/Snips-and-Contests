package finished;
import java.util.Scanner;

public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a frase dude");
		String frase = input.nextLine();
		System.out.println("Insert a word dude");
		String word = input.nextLine();
		int i = word.length();
		String stars = "";
		for(int j= 0; j < i; j++)
		{
			stars += "*";
		}
		String replacement = frase.replaceAll(word, stars );
		System.out.println(replacement);
	}

}
