package finished;



import java.util.ArrayList;
import java.util.Scanner;

public class librarian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int p;
		do{
			p = input.nextInt();
		}while(p < 0 || p >= 100 );

		String sentence = input.nextLine();

		for(int i = 1; i <= p; i++){
			sentence += " ";
			sentence += input.nextLine();
		}
		sentence = sentence.toLowerCase();
		String[] sentenced = sentence.split(" ");
		
		ArrayList<String> words = new ArrayList<String>();
		
		for (int i = 0; i < sentenced.length; i++) {
			for (int j = 0; j < words.size(); j++) {

			}
		}
		

	}

}
