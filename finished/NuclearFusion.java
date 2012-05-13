package finished;



import java.util.ArrayList;
import java.util.Scanner;

public class NuclearFusion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String parse = input.nextLine();
		ArrayList<String> atom = new ArrayList<String>();
		for (int i = 0; i < parse.length(); i++) 
			atom.add(parse.substring(i, i+1));

		int fussions = 0;
		boolean fused;
		do {
			fused = true;
			for (int i = 0; i < atom.size()-1; i++) {
				if(atom.get(i).equals(atom.get(i+1))){
					atom.remove(i);
					fussions++;
					fused = false;
					break;	
				}		
			}
		} while (!fused);
		System.out.println(fussions);

	}

}
