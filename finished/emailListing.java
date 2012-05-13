package finished;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class emailListing {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		Scanner reader;

		System.out.println("Name to find");
		String word = input.nextLine();
		
		do{
			if (word.equals(""))
					return;
			try
			{
				reader = new Scanner(new FileReader("mail_listing.txt"));
			}
			catch(Exception e)
			{
				System.out.println("File not found");
				return;
			}
			//reader.reset();
			
			
			boolean found = false;
			
			while(reader.hasNext())
			{
				String line = reader.nextLine();
				if(line.contains(word))
				{
					String email = reader.nextLine();
					System.out.println("Search Results");
					System.out.println(line + " - " + email);
					found = true;
				}
				try
				{reader.nextLine();}
				catch(Exception e){};
			}
			
			if(!found)
			{
				System.out.println("\'" + word + "' was not found. Wanna add him? (y/n)");
				String option = input.nextLine();
				if(!option.equals("y") && !option.equals("n"))
				{
					do
					{
						System.out.println("Wanna add him? (y/n)");
						option = input.nextLine();
					}while(!option.equals("y") && !option.equals("n"));
				}
				
				if(option.equals("y"))
				{
					FileWriter fw;
					try {
						fw = new FileWriter("mail_listing.txt", true);
					} 
					catch (IOException e) {
						return;
					}
					fw.write("\n" + word);
					System.out.println("Insert email");
					
					String email = input.nextLine();
					fw.write("\n" + email);
					fw.close();
				}
				else
				{
					
				}
			}
			System.out.println("Name to find");
			word = input.nextLine();
			reader.close();
			
		}while(!word.equals(""));
	}

}
