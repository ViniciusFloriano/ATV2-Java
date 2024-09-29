package Lista6Java;
import java.util.Scanner;
public class Ex44 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 10;
		final int MAXN = 4;
		int vet[] = new int[MAX];
		int soma = 0;
		int quantAlunos = 0;
		int nota = 0;

		for (int i = INI; i < MAX; i++) {
			System.out.println("Aluno " + (i + 1));
			for (int j = INI; j < MAXN; j++) {
				System.out.print("Informe a nota " + (j + 1) + ": ");
				nota = scan.nextInt();
				soma += nota;
			}
			vet[i] = soma / 4;
			if (vet[i] >= 7) {
				quantAlunos++;
			}
		}
		
		System.out.println("quantidade de alunos com média maior ou igual a 7 é: " + quantAlunos);

		scan.close();
	}
}
