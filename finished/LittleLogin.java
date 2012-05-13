package finished;
import java.util.Scanner;
import java.util.Arrays;

public class LittleLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] array1 = {"angel","gustavo","jonellys","nelian","samuel"};
		String[] array2 = {"arduino","lol","epic","dango","samus"};
		
		System.out.println("Username bitch");
		String username = input.nextLine();
		username = username.toLowerCase();
		
		boolean check;
		check = Arrays.asList(array1).contains(username);
		if(check == false)
		{
			System.out.println("No such user");
			return;
		}
		int indexuser = 0;
		for(int i = 0; i < array1.length; i++)
		{
			if ( array1[i].equals(username))
				{
				indexuser = i;
				break;
				}
		}
		
//		int indexuser = Arrays.binarySearch(array1, username);
		
		System.out.println("Insert password dude");
		String password = input.nextLine();
		password = password.toLowerCase();
		
		if(array2[indexuser].equals(password))
		{
			System.out.println("Welcome home " + array1[indexuser]);
			return;
		}
		else
		{
			System.out.println("Wrong combo.");
			return;
		}
		
	}

}
