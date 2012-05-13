package finished;
import java.util.Scanner;


public class CortaSentence {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a sentence dude");
		String sentence = input.nextLine();
		System.out.println("Insert a word dude");
		String word = input.nextLine();
		if(sentence.contains(word))
		{
			System.out.println("I haz it bish!");
		}
		else
		{
			System.out.println("I don't have it nigga");
		}
	}

}

