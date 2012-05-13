package finished;


import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();

		do {
			numList.add(input.nextInt());
		} while (numList.get(numList.size()-1) != 0);

		numList.remove(numList.size()-1);

		for (int i = 0; i < numList.size(); i++) {
			boolean prime = true;
			boolean perfect = true;

			int number = numList.get(i);
			prime = isPrime(number);
			perfect = isPerfect(number, prime);


			if(!prime && !perfect)
				System.out.println("Dull");
			else if(prime && !perfect)
				System.out.println("Prime");
			else if(!prime && perfect)
				System.out.println("Perfect");
			else
				System.out.println("This program doesn't work");
		}
		return;
	}

	static boolean isPrime(int number){
		if(number == 1)
			return false;
		if(number%2 == 0)
			return false;
		for (int i = 2; i < number-1; i++) {
			if(number%i == 0)
				return false;

		}
		return true;
	}

	static boolean isPerfect(int number, boolean prime){
		if(number == 1)
			return false;
		int sum = 0;
		int number1 = number;
		if(!prime){
			do {
				double fix = Math.ceil(number/2.0);
				sum += (int)fix;
				number = (int)fix;
			} while (number != 1);
		}
		else {
			do {
				sum += number/2;
				number = number/2;
			} while (number != 1);
		}
		if(sum == number1)
			return true;
		else
			return false;
	}

}
