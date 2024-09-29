package Lista6Java;
import java.util.Scanner;
public class Ex40 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int INI = 0;
		final int MAX = 10;
		int vet[] = new int[MAX];
		int num = 0;
		
		for (int i = INI; i < MAX; i++) {
			System.out.print("Informe um número: ");
			num = scan.nextInt();
			vet[i] = num;
		}
		
		for (int i = (MAX-1); i >= INI; i--) {
			System.out.println("número " + (i + 1) + ": " + vet[i]);
		}
		
		scan.close();
	}
}
