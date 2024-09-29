package Lista5Java;
import java.util.Scanner;
public class Ex20 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		double soma = 0;

		do {
			System.out.print("Informe a quantidade de notas: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);

		double vet[] = new double[max];
		
		for (int i = INI; i < max; i++) {
			System.out.print("Informe a nota " + (i+1) + ": ");
			vet[i] = scan.nextDouble();
			soma += vet[i];
        }
		
		System.out.println("a média das " + max + " notas é: " + (soma / max));
		
		scan.close();
	}
}
