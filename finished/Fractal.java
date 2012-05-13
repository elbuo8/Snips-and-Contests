package finished;


import java.util.ArrayList;
import java.util.Scanner;

public class Fractal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int x = input.nextInt();

		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i < x; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if(i%j == 0)
					prime = false;
			}
			if(prime){
				if(x%i == 0)
					primes.add(i);
			}

		}
		for (int k = 1; k < primes.size(); k++) {
			for (int i = 0; i < primes.size(); i++) {
				for (int j = 1; j < primes.size(); j++) {
					if(primes.get(i) + primes.get(j) == primes.get(primes.size()-k)) {
						System.out.println(primes.get(primes.size()-k));
						return;
					}
				}
			}
		}

		System.out.println("NONE");
		return;
	}

}
