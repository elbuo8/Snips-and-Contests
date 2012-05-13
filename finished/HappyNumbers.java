package finished;



import java.util.ArrayList;

public class HappyNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		int number = 1;
		do {
			int result = number;
			do {
				String parse = Integer.toString(result);
				char[] cheat = parse.toCharArray();
				int suma = 0;
				for (int i = 0; i < cheat.length; i++) 
					suma += Math.pow(Character.getNumericValue(cheat[i]), 2);
				result = suma;
			} while (result != 1 && result != 4);
			if(result == 1)
				results.add(number);
			number++;
			
		} while (number != 500);

		for (int i = 1; i <= results.size(); i++) {
			if(i == results.size()){
				System.out.println(results.get(i-1));
				return;
			}
			System.out.print(results.get(i-1) + ", ");
			if(i == 0) {}
			else if(i % 15 == 0)
				System.out.println();
		}
		

	}

}
