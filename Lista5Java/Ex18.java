package Lista5Java;
import java.util.Scanner;
public class Ex18 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 2;
		int num = 0;
		boolean primo = true;
		String divisores = "";

		do {
			System.out.print("Informe um número inteiro para saber se ele é primo: ");
			num = scan.nextInt();
			if (num <= 0) {
				System.out.println("Erro");
			}
		} while (num <= 0);

		if (num == 1) {
			primo = false;
		} else {
			for (int i = INI; i <= num / 2; i++) {
				if (num % i == 0) {
					primo = false;
					divisores += i + " ";
				}
			}			
		}
		
		if (primo) {
			System.out.println("o número " + num + " é primo");
		} else {
			System.out.println("o número " + num + " não é primo");
			System.out.println("ele é divisivel por: 1 " + divisores + num);
		}
		

		scan.close();
	}
}
