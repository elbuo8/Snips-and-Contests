package finished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class SuperWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		input.nextLine();

		ArrayList<String> superwords = new ArrayList<String>();

		String[] dict = new String[w];
		for(int i = 0; i < w; i++)
			dict[i] = input.nextLine();

		//System.out.println("Done ---->>> Starting point.");

		for(int i = 0; i < w; i++)
		{
			if(dict[i].length() == 1 )
				superwords.add(dict[i]);
		}

		for(int i = 0; i < superwords.size(); i++)
		{
			for(int j = 0; j < w; j++)
			{
				if(superwords.get(i).equals(dict[j].substring(0, dict[j].length()-1)) || superwords.get(i).equals(dict[j].substring(1, dict[j].length())))
					superwords.add(dict[j]);
			}
		}

		HashSet<String> h = new HashSet<String>(superwords);
		superwords.clear();
		superwords.addAll(h);

		Collections.sort(superwords);

		for(int i = 0; i < superwords.size(); i++)
			System.out.println(superwords.get(i));


	}

}
