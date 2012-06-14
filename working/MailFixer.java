package working;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MailFixer {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new FileReader("batch.txt"));
		
		String list = "";
		
		while(input.hasNext()) {
			list += input.nextLine();
		}
		String[] parsed = list.split(";");
		for (int i = 0; i < parsed.length; i++) {
			System.out.println(parsed[i].trim());
		}
	}

}
