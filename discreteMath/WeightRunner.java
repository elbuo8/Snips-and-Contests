package discreteMath;


public class WeightRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int base = 15; //Change base

		for (int i = 1; i <= 20; i++) 
			for (int j = 1; j <= 100; j++) 
				if (getWeight(Integer.toString(i, base)) + getWeight(Integer.toString(j, base)) == getWeight(Integer.toString((i+j), base)))  
					System.out.println(i + " " + j);

	}

	static int getWeight(String x) {
		String parse = "0123456789ABCDE".toLowerCase();
		int result = 0;
		
		for (int i = 0; i < x.length(); i++) 
			result += parse.indexOf(x.substring(i, i+1));
		
		return result;
	}
}
