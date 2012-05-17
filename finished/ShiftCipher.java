package finished;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ShiftCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("If you want to encrypt press 1, if you wish to decrypt press 2, 0 to exit");

		int menu = input.nextInt();
		input.nextLine();

		if (menu == 1)
			encrypt();
		else if (menu == 2)
			decrypt();
		else
			System.exit(0);
	}

	private static void decrypt() {
		String result = ""; //Encrypted result
		int b = 3; //Key
		
		try
		{
			Scanner reader = new Scanner(new FileReader("encrypted.txt"));
			while (reader.hasNext()) {
				char[] parse = reader.nextLine().toCharArray();
				for (int i = 0; i < parse.length; i++) 
					if (parse[i] != ' ') 
						parse[i] = (char) ((parse[i] - b)%255);
				result += new String(parse);
				result += "\n";
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}

		try {
			FileWriter fw = new FileWriter("encrypt.txt", false);
			fw.write(result);
			fw.close();
		} 
		catch (IOException e) {
			return;
		}

	}

	private static void encrypt() {

		String result = ""; //Encrypted result
		int b = 3; //Key
		
		try
		{
			Scanner reader = new Scanner(new FileReader("encrypt.txt"));
			while (reader.hasNext()) {
				char[] parse = reader.nextLine().toCharArray();
				for (int i = 0; i < parse.length; i++) 
					if (parse[i] != ' ') 
						parse[i] = (char) ((parse[i] + b)%255);
				result += new String(parse);
				result += "\n";
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Not found");
			return;
		}

		try {
			FileWriter fw = new FileWriter("encrypted.txt", false);
			fw.write(result);
			fw.close();
		} 
		catch (IOException e) {
			return;
		}


	}

}
