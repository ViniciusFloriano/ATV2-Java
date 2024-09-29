package Lista5Java;
import java.util.Scanner;
public class Ex21 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		double soma = 0;

		do {
			System.out.print("Informe a quantidade de pessoas na turma: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);

		double vet[] = new double[max];
		
		for (int i = INI; i < max; i++) {
			System.out.print("Informe a idade da " + (i+1) + "° pessoa: ");
			vet[i] = scan.nextDouble();
			soma += vet[i];
        }
		
		if (soma / max >= 0 && soma / max <= 25) {
			System.out.println("Turma jovem");
		} else if (soma / max >= 26 && soma / max <= 60) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma idosa");
		}
		
		scan.close();
	}
}
