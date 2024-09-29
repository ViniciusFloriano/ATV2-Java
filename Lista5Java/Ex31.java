package Lista5Java;
import java.util.Scanner;
public class Ex31 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int TAMV = 2;
		final int MAX = 10;
		int conjuntos[][] = new int [TAMV][MAX];
		int maior = 0;
		int numMaior = 0;
		int menor= 0;
		int numMenor = 0;
		
		for (int j = 0; j < MAX; j++) {
			System.out.print("qual o número do aluno: ");
			conjuntos[0][j] = scan.nextInt();
			System.out.print("qual a altura do aluno (centimetros):  ");
			conjuntos[1][j] = scan.nextInt();
			if (j == 0) {
				numMaior = conjuntos[0][j];
				maior = conjuntos[1][j];
				numMenor = conjuntos[0][j];
				menor = conjuntos[1][j];
			} else {
				if (conjuntos[1][j] > maior) {
					numMaior = conjuntos[0][j];
					maior = conjuntos[1][j];
				} else if (conjuntos[1][j] < menor) {
					numMenor = conjuntos[0][j];
					menor = conjuntos[1][j];
				}
			}
		}
		
		System.out.println("O número do maior aluno: " + numMaior);
		System.out.println("A altura do maior aluno: " + maior + "cm");
		System.out.println("");
		System.out.println("O número do menor aluno: " + numMenor);
		System.out.println("A altura do menor aluno: " + menor + "cm");
		
		scan.close();
	}
}

