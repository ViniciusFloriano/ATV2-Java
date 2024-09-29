package Lista6Java;
import java.util.Scanner;
public class Ex46 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		String texto = "";

		System.out.print("Informe um texo: ");
		texto = scan.nextLine();

		char letras[] = new char[texto.length()];

		for (int i = INI; i < texto.length(); i++) {
			letras[i] = texto.charAt(i);
		}

		System.out.println("Vetor com as letras do texto: ");
		for (int i = INI; i < texto.length(); i++) {
			if (i == texto.length()-1) {
				System.out.println(letras[i]);
			} else {
				System.out.print(letras[i] + ", ");
			}
		}

		scan.close();
	}
}
