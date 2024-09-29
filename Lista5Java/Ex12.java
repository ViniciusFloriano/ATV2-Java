package Lista5Java;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 3;
		int max = 0;
		int n1 = 1;
		int n2 = 1;
		int seq;

		System.out.print("Informe até que número você quer a sequência de Fibonacci: ");
		max = scan.nextInt();

		if (max <= 0) {
			System.out.println("O número deve ser maior que 0.");
		} else {
			System.out.println("Série de Fibonacci até o " + max + "º termo: ");

			if (max == 1) {
				System.out.print(n1);
			} else if (max == 2) {
				System.out.print(n1 + ", " + n2);
			} else {
				System.out.print(n1 + ", " + n2 + ", ");
				for (int i = INI; i <= max; i++) {
					seq = n1 + n2;
					if (i == max) {
						System.out.print(seq);
					} else {
						System.out.print(seq + ", ");
					}
					n1 = n2;
					n2 = seq;
				}
			}
		}

		scan.close();
	}
}
