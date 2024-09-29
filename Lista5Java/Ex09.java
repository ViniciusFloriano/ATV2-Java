package Lista5Java;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int MAX = 10;
		final int INI = 1;
		int num = 0;

		do {

			System.out.print("Informe o número que você quer ver a tabuada (1 a 10): ");
			num = scan.nextInt();
			
			if (num < 0 || num > 10) {
				System.out.println("Erro, o número deve ser entre 1 e 10");
			}
			
		} while (num < 0 || num > 10);

		for (int i = INI; i <= MAX; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		scan.close();
	}
}
