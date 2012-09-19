package working;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int factorial = input.nextInt();
		while (factorial != 0) {
			System.out.println(isPrime(factorial));
			factorial = input.nextInt();
			input.nextLine();
		}


	}
	
	static boolean isPrime(int n) {
		if (n == 2) return true;
		if (n%2 == 0) return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) 
			if(n%i == 0) return false;
		return true;
	}

}
