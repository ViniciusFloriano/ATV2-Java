package Lista5Java;
import java.util.Scanner;
public class Ex34 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 4;
		double num = 0;
		int intervalos[] = new int[MAX];
		intervalos[0] = 0;
		intervalos[1] = 0;
		intervalos[2] = 0;
		intervalos[3] = 0;

		do {
			System.out.print("informe um número (0 a 100, e para parar basta digitar um número negativo): ");
			num = scan.nextDouble();	
			if (num >= 0 && num <= 25) {
				intervalos[0]++;
			} else if (num >= 26 && num <= 50) {
				intervalos[1]++;
			} else if (num >= 51 && num <= 75) {
				intervalos[2]++;
			} else if (num >= 76 && num <= 100) {
				intervalos[3]++;
			} else if (num > 100) {
				System.out.println("Erro");
			}
		} while (num >= 0);

		for (int i = INI; i < MAX; i++) {
			System.out.print("A quantidade de números no intervalo de [0-25] é:");
			System.out.print("A quantidade de números no intervalo de [26-50] é:");
			System.out.print("A quantidade de números no intervalo de [51-75] é:");
			System.out.print("A quantidade de números no intervalo de [76-100] é:");
		}
		
		scan.close();
	}
}