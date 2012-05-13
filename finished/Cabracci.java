package finished;



import java.util.Scanner;

public class Cabracci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int runs = 0;
		do {
			System.out.print("Enter 4 numbers: ");
			String[] lines = input.nextLine().split(" ");
			int x = Integer.parseInt(lines[0]);
			int y = Integer.parseInt(lines[1]);
			int z = Integer.parseInt(lines[2]);
			int i = Integer.parseInt(lines[3]);
			int counter = 3;
			do {
				int temp = x + y + z - 3;
				x = y;
				y = z;
				z = temp;
				counter++;
			} while (counter != i);
			System.out.println("The number is: "+z);
			runs++;
		} while(runs != 5);

	} 

}
