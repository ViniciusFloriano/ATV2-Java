package Lista5Java;
import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		int maior = 0;
		int menor = 0;
		int soma = 0;

		do {
			System.out.print("Informe quantos números terão o conjunto: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);
		
		
		int vet[] = new int [max];
		
		for (int i = INI; i < max; i++) {
			System.out.print("Informe os valores do conjunto: ");
			vet[i] = scan.nextInt();
			if (i == 0) {
				maior = vet[i];
				menor = vet[i];
			} else {
				if (vet[i] > maior) {
					maior = vet[i];
				} else if (vet[i] < menor) {
					menor = vet[i];
				}
			}
			soma += vet[i];
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		scan.close();
	}
}
