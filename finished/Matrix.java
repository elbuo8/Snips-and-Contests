package finished;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			for(int j = 1; j <= 100; j++)
			{
				result = i*j;
				System.out.print("\t" + result);

			}
			System.out.println();
		}
		
	}

}
