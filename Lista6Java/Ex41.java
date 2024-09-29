package Lista6Java;
import java.util.Scanner;
public class Ex41 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int INI = 0;
		final int MAX = 4;
		int vet[] = new int[MAX];
		int nota = 0;
		int soma = 0;
		
		for (int i = INI; i < MAX; i++) {
			do {
				System.out.print("Informe a nota " + (i + 1) + ": ");
				nota = scan.nextInt();		
				if (nota < 0 || nota > 10) {
					System.out.println("Erro");
				}
			} while (nota < 0 || nota > 10);
			vet[i] = nota;
			soma += nota;
		}
		
		for (int i = INI; i < MAX; i++) {
			System.out.println("nota " + (i + 1) + " " + vet[i]);
		}
		
		System.out.println("a média das notas é: " + (soma / 4));
		
		scan.close();
	}
}
