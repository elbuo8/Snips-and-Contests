package finished;



import java.util.ArrayList;
import java.util.Scanner;

public class QuickBlue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.nextLine();
		ArrayList<String> lastm = new ArrayList<String>();
		int timemegaman = 0;
		while (x != 0) {
			String parser = input.nextLine();
			timemegaman += Integer.parseInt(parser.substring(0, 1));
			for (int j = 0; j < Integer.parseInt(parser.substring(0, 1)); j++) 
				lastm.add(parser);
			x--;
		}
		x = input.nextInt();
		input.nextLine();
		int timequick = 0;
		ArrayList<String> lastq = new ArrayList<String>();
		while (x != 0) {
			String parser = input.nextLine();
			timequick += Integer.parseInt(parser.substring(0, 1));
			for (int j = 0; j < Integer.parseInt(parser.substring(0, 1)); j++) 
				lastq.add(parser);
			x--;
		}
		
		if(timemegaman < timequick){
			System.out.println("MEGAMAN");
			System.out.println(lastq.get(timequick-timemegaman).substring(2));
		}
		else if (timemegaman > timequick) {
			System.out.println("QUICK MAN");
			System.out.println(lastm.get(timemegaman-timequick+1).substring(2));
		}
		else {
			System.out.println("DRAW");
		}
		
		
	}

}
