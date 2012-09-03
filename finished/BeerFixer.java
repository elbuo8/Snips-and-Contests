package finished;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BeerFixer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new FileReader("newbeers.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (input.hasNext()) {
			list.add(input.nextLine());
		}
		
		Collections.sort(list);
		FileWriter writer = new FileWriter("newsortedbeers.txt");
		for (int i = 0; i < list.size(); i++) {
			writer.write(list.get(i) + "\n");
		}
		writer.flush();
		writer.close();



	}

}
