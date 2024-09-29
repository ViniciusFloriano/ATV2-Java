package Lista5Java;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int MAX = 1;
		int ini = 0;
		int fatorial = 0;

		do {
			System.out.print("Informe o número que você quer o fatorial (>0): ");
			ini = scan.nextInt();
			if (ini <= 0) {
				System.out.println("Erro");
			}
		} while (ini <= 0);

		
		fatorial = ini;
		ini = ini - 1;
		
		for (int i = ini; i >= MAX; i--) {
			fatorial *= i;
		}

		System.out.println("O fatorial do número " + ini + " é: " + fatorial);

		scan.close();
	}
}
