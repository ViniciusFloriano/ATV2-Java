package Lista6Java;
import java.util.Scanner;
public class Ex42 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int INI = 0;
		final int MAX = 10;
		char vet[] = new char[MAX];
		char letra = ' ';
		int quantConsoante = 0;
		
		for (int i = INI; i < MAX; i++) {
			System.out.print("Informe uma letra: ");
			letra = scan.nextLine().charAt(0);	
			vet[i] = letra;
			if (vet[i] != 'a' && vet[i] != 'A' && vet[i] != 'e' && vet[i] != 'E' && vet[i] != 'i' && vet[i] != 'I' && vet[i] != 'o' && vet[i] != 'O' && vet[i] != 'u' && vet[i] != 'U') {
				quantConsoante++;
			}
		}
		
		for (int i = INI; i < MAX; i++) {
			if (vet[i] != 'a' && vet[i] != 'A' && vet[i] != 'e' && vet[i] != 'E' && vet[i] != 'i' && vet[i] != 'I' && vet[i] != 'o' && vet[i] != 'O' && vet[i] != 'u' && vet[i] != 'U') {
				System.out.println(vet[i]);
			}
		}
		
		System.out.println("a quatidade de consoantes digitas foi: " + quantConsoante);
		
		scan.close();
	}
}
