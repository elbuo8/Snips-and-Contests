package finished;
import java.util.Scanner;
public class YoDawg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert three words dude, 2 nouns and 1 verb");
		String X = input.nextLine();
		String Y = input.nextLine();
		String VERB = input.nextLine();
		System.out.println("Yo dawg, I herd you like " + X + ", so I put an " + X + " in your " + Y + " so you can " + VERB + " while you " + VERB);
	}

}
