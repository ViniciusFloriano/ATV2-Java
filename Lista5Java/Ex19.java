package Lista5Java;
import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		boolean primo = true;
		int contadorDivisoes = 0;

		do {
			System.out.print("Informe um número inteiro para saber se ele é primo: ");
			num = scan.nextInt();
			if (num <= 0) {
				System.out.println("Erro");
			}
		} while (num <= 0);

		System.out.println("Números primos entre 1 e " + num + ":");
		
		for (int i = 2; i <= num; i++) {
            primo = true;

            for (int j = 2; j <= i / 2; j++) {
                contadorDivisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(i + " ");
            }
        }
		
		System.out.println("\nNúmero total de divisões realizadas: " + contadorDivisoes);
		
		scan.close();
	}
}
