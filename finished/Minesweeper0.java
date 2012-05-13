package finished;
import java.util.Scanner;
//import java.util.StringTokenizer;
import java.lang.String;


public class Minesweeper0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insert dimensions");
		int m = input.nextInt();
		int n = input.nextInt();

		String[][] map;

		while (m > 0 && n > 0)
		{
			map = new String[m][n];


			for(int i = 0; i <= m; i++)
			{
				String parse = input.nextLine();
				for(int j = 1; j < parse.length(); j++)
				{
					map[i][j] = parse.substring(j-1, j);
				}
			}
			
			

			//Replace dots with 0
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

			//Find * and replace with 011
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(map[i][j].equals("*"))
					{
						try
						{
							map[i][j+1] += 1;
						}
						catch(Exception e){}
						try
						{
							map[i][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
							map[i+1][j] += 1;
						}
						catch(Exception e){}
						try
						{
							map[i-1][j] += 1;
						}
						catch(Exception e){}						
						try
						{
							map[i-1][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
							map[i+1][j+1] += 1;
						}
						catch(Exception e){}
						try
						{
							map[i+1][j-1] += 1;
						}
						catch(Exception e){}
						try
						{
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

		}

	}

}
