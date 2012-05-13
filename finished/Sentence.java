package finished;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Sentence {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a sentence dude");
		String sentence = input.nextLine();
		System.out.println("Insert a word dude");
		String word1 = input.nextLine();
		StringTokenizer tokens = new StringTokenizer(sentence);
		int i=0;


		String[] array = new String[sentence.length()];
		
		while(tokens.hasMoreTokens())
		{
			array[i] = tokens.nextToken(); //compare with token directly asshole
			i++;
		}
		for(i=0; i < array.length; i++)
		{
			if(array[i].equals(word1))
			{
				System.out.println("I do have the word dude :D");
			}
			
		}
	}

}
