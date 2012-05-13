package finished;



import java.util.Scanner;

public class LaOla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mensaje = "Entre una oraci—n (12 a 50 caracteres, adios para salir): ";
		System.out.print(mensaje);
		String palabra = input.nextLine();
		String mensaje2 = "\nEntre la altura de la ola (2 a 6): ";
		System.out.print(mensaje2);
		int wave = input.nextInt();
		input.nextLine();
		//while (palabra.length() > 11 && palabra.length() < 53 && wave > 1 && wave < 7 && !palabra.equals("adios")) {
		palabra = palabra.replaceAll(" ", "*");
		char[][] matrix = new char[wave][palabra.length()];
		int j = wave-1;
		int fixer = -1;
		for (int i = 0; i < wave; i++) {
			for (int k = 0; k < palabra.length(); k++) {
				matrix[i][k] = ' ';
			}
		}
		for (int i = 0; i < palabra.length(); i++) {
			matrix[j][i] = palabra.charAt(i);
			j += fixer;
			if(j == 0 || j == (wave - 1))
				fixer*=-1;
		}
		for (int i = 0; i < wave; i++) {
			System.out.println(matrix[i]);
		}

		//	}


	}

}
