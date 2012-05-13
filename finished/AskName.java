package finished;
import java.util.Scanner;


public class AskName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Insert your name dude");
		String name = input.nextLine();
		if(name.equals("Yamil"))
		{
			System.out.println("Hello "+ name);
		}
		else
		{
			System.out.println("You suck");
		}
		
	}

}
