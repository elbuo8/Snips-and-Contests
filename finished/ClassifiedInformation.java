package finished;
import java.util.Scanner;


public class ClassifiedInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a sentence dude");
		String sentence = input.nextLine();
		System.out.println("Insert number of secret words");
		int numofwords = input.nextInt();
		input.nextLine();
		for (int i = 0; i < numofwords; i++)
		{
			System.out.println("Insert a secret word dude");
			String secret = input.nextLine();
			String stars = "";
			int j = secret.length();
			for(int k = 0; k < j; k++)
			{
				stars += "*";
			}
			sentence = sentence.replace(secret, stars);
		}
		
		System.out.println(sentence);
		
	}

}
