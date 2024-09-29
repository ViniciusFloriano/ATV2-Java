package Lista5Java;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 1;
		int max = 0;
		int n1 = 1;
		int n2 = 1;

		do {
			System.out.print("Informe o número de termos da sequêmcia: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);

		System.out.print("S = ");
		
		for (int i = INI; i <= max; i++) {
			if (max == 1) {
				System.out.println("1/1");
			} else {
				if (i == max) {
					System.out.print(n1 + "/" + n2);
				} else {
					System.out.print(n1 + "/" + n2 + " ");
				}
				n1 += 1;
				n2 += 2;
			}			
		}

		scan.close();
	}
}
