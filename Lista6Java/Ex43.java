package Lista6Java;
import java.util.Scanner;
public class Ex43 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 20;
		int vet[] = new int[MAX];
		int par[] = new int[MAX];
		int impar[] = new int[MAX];
		int quantPar = 0;
		int quantImpar = 0;
		int num = 0;

		for (int i = INI; i < MAX; i++) {
			System.out.print("Informe um número: ");
			num = scan.nextInt();
			vet[i] = num;
			if (vet[i] % 2 == 0) {
				par[quantPar] = vet[i];
				quantPar++;
			} else {
				impar[quantImpar] = vet[i];
				quantImpar++;
			}
		}
		
		System.out.println("Vetor total");

		for (int i = INI; i < MAX; i++) {
			if (i == (MAX-1)) {
				System.out.println(vet[i]);
			} else {
				System.out.print(vet[i] + ", ");
			}
		}

		System.out.println("Vetor Par");

		for (int i = INI; i < quantPar; i++) {
			if (i == (quantPar-1)) {
				System.out.println(par[i]);
			} else {
				System.out.print(par[i] + ", ");
			}
		}

		System.out.println("Vetor Impar");
		
		for (int i = INI; i < quantImpar; i++) {
			if (i == (quantImpar-1)) {
				System.out.println(impar[i]);
			} else {
				System.out.print(impar[i] + ", ");
			}
		}

		scan.close();
	}
}
