package Lista5Java;
import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		String op = "";

		do {
			System.out.print("Informe a quantidade de votantes: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);
		
		for (int i = INI; i < max; i++) {
			do {
				System.out.print("Informe qual canditado você quer votar (1, 2 ou 3): ");
				op = scan.nextLine();				
			} while (!"1".equalsIgnoreCase(op) || !"2".equalsIgnoreCase(op) || !"3".equalsIgnoreCase(op));
			if ("1".equalsIgnoreCase(op)) {
				cand1 += 1;
			} else if ("2".equalsIgnoreCase(op)) {
				cand2 += 1;
			} else if ("3".equalsIgnoreCase(op)) {
				cand3 += 1;
			}
        }
		
		System.out.println("número de votos do candidato 1: " + cand1);
		System.out.println("número de votos do candidato 2: " + cand2);
		System.out.println("número de votos do candidato 3: " + cand3);
		
		scan.close();
	}
}
