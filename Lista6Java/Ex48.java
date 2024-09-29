package Lista6Java;
import java.util.Scanner;
public class Ex48 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		String texto = "";

		System.out.print("Digite os nomes separados por (;): ");
		texto = scan.nextLine();
		
		String nomes[] = texto.split(";");

		System.out.println("Os nomes digitados foram: ");
		for (int i = INI; i < nomes.length; i++) {
			if (i == nomes.length-1) {
				System.out.print(nomes[i]);
			} else {
				System.out.print(nomes[i] + ", ");
			}
		}

		scan.close();
	}
}
