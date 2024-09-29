package Lista5Java;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 10;
		int vet[] = new int [MAX];
		int quantPar = 0;
		int quantImpar = 0;

		for (int i = INI; i < MAX; i++) {
			System.out.print("Informe um número: ");
			vet[i] = scan.nextInt();
		}
		
		for (int i = INI; i < MAX; i++) {
			if (vet[i] % 2 == 0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		
		System.out.println("A quantidade de números pares é: " + quantPar);
		System.out.println("A quantidade de números impares é: " + quantImpar);
		
		scan.close();
	}
}
