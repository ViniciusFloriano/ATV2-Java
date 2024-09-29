package Lista6Java;
import java.util.Scanner;
public class Ex39 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int INI = 0;
		final int MAX = 5;
		int vet[] = new int[MAX];
		int num = 0;
		
		for (int i = INI; i < MAX; i++) {
			do {
				System.out.print("Informe um número inteiro: ");
				num = scan.nextInt();
				if (num < 0) {
					System.out.println("Erro");
				}
			} while (num < 0);
			vet[i] = num;
		}
		
		for (int i = INI; i < MAX; i++) {
			System.out.println("número " + (i + 1) + ": " + vet[i]);
		}
		
		scan.close();
	}
}
