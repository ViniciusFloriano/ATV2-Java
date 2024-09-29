package Lista5Java;
import java.util.Scanner;
public class Ex23 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		int max = 0;
		int soma = 0;

		do {
			System.out.print("Informe a quantidade de turmas: ");
			max = scan.nextInt();
			if (max <= 0) {
				System.out.println("Erro");
			}
		} while (max <= 0);
		
		int vet[] = new int[max];
		
		for (int i = INI; i < max; i++) {
			do {
				System.out.print("Informe quantos alunos tem na turma " + (i + 1) + ": ");
				vet[i] = scan.nextInt();
				if (vet[i] > 40) {
					System.out.println("Erro");
				}
			} while (vet[i] > 40);
			soma += vet[i];
        }
		
		System.out.println("a número médio de alunos por turma é: " + (soma / max));
		
		scan.close();
	}
}
