package finished;



import java.util.Scanner;

public class RomantoArabic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cheat = "Entre el numero romano (999 para terminar): ";
		System.out.print(cheat);
		String parse = input.nextLine();
		while (!parse.equals("999")) {
			String[] parsed = parse.split("");
			int value = 0;
			for (int i = 1; i < parsed.length; i++) {
				if (parsed[i].equals("I")) 
					parsed[i] = "1";
				else if(parsed[i].equals("V"))
					parsed[i] = "5";
				else if(parsed[i].equals("X"))
					parsed[i] = "10";
				else if(parsed[i].equals("L"))
					parsed[i] = "50";
				else if(parsed[i].endsWith("C"))
					parsed[i] = "100";
				else if(parsed[i].equals("D"))
					parsed[i] = "500";
				else if(parsed[i].equals("M"))
					parsed[i] = "1000";
			}
			for (int i = parsed.length-1; i > 1 ; i--) {
				if(Integer.parseInt(parsed[i])>= Integer.parseInt(parsed[i-1]))
					value += Integer.parseInt(parsed[i]);
				else 
					value -= Integer.parseInt(parsed[i]);
			}
			value += Integer.parseInt(parsed[1]);
			System.out.println(parse + " = " + value);
			System.out.println();
			System.out.print(cheat);
			parse = input.nextLine();
		}
		System.out.println("<END>");
	}

}
