package Lista5Java;
import java.util.Scanner;
public class Ex24 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		int soma = 0;

		do {
			System.out.print("Informe a quantidade de CDs: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);
		
		int vet[] = new int[max];
		
		for (int i = INI; i < max; i++) {
			System.out.print("Informe o valor do CD N°" + (i + 1) + ": ");
			vet[i] = scan.nextInt();
			soma += vet[i];
        }
		
		System.out.println("o valor total investido é: " + soma);
		System.out.println("valor médio por CD: " + (soma / max));
		
		scan.close();
	}
}
