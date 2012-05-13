package finished;
import java.util.Scanner;
import java.lang.String;


public class Minesweeper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insert dimensions");
		int m = input.nextInt();
		int n = input.nextInt();
		input.nextLine();

		String[][] map;

		while (m > 0 && n > 0 && n <= 100 && m <= 100)
		{
			map = new String[m][n];


			//Create & fill array
			for(int i = 0; i < m; i++)
			{
				String parse;
				parse = input.nextLine();

				for(int j = 0; j < n; j++)
				{
					map[i][j] = parse.substring(j, j+1);
				}			
			}
			

			//Replace safe fields with 0
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(map[i][j].equals("."))
					{
						map[i][j] = "0";
					}
				}
			}

			//Find * and add 1 to neighbors
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(map[i][j].equals("*"))
					{
						//Do not overwrite a * field
						try
						{
							if (!map[i][j+1].equals("*"))
								map[i][j+1] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i][j-1].equals("*"))
								map[i][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i+1][j].equals("*"))
								map[i+1][j] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i-1][j].equals("*"))
								map[i-1][j] += 1;
						}
						catch(Exception e){}						
						try
						{
							if (!map[i-1][j-1].equals("*"))
								map[i-1][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i+1][j+1].equals("*"))
								map[i+1][j+1] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i+1][j-1].equals("*"))
								map[i+1][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
							if (!map[i-1][j+1].equals("*"))
								map[i-1][j+1] += 1;
						}
						catch(Exception e){}
					}
				}
			}

			//Change to appropriate value
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(!map[i][j].equals("*"))
					{
						int count = map[i][j].length()-1;
						map[i][j] = Integer.toString(count);
					}
				}
			}
			
			//Print Grid
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(map[i][j]);
				}
				System.out.println();
			}

			
			m = input.nextInt();
			n = input.nextInt();
			input.nextLine();

		}

	}

}
