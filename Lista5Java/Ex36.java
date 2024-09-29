package Lista5Java;
import java.util.Scanner;
public class Ex36 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 6;
		boolean continua = true;
		int codigo = 0;
		int votos[] = new int[MAX];
		votos[0] = 0;
		votos[1] = 0;
		votos[2] = 0;
		votos[3] = 0;
		votos[4] = 0;
		votos[5] = 0;
		int totalVotos = 0;

		while (continua) {
			do {
				System.out.print("informe em quem vai votar (1 - Jose, 2 - João, 3 - Marquinhos, 4 - Feuser, 5 - Voto Nulo, 6 - Voto em Branco): ");
				codigo = scan.nextInt();		
				if (codigo < 1 || codigo > 6) {
					System.out.println("Erro");
				}
			} while (codigo < 1 || codigo > 6);	
			if (codigo == 1) {
				votos[0]++;
				totalVotos++;
			} else if (codigo == 2) {
				votos[1]++;
				totalVotos++;
			} else if (codigo == 3) {
				votos[2]++;
				totalVotos++;
			} else if (codigo == 4) {
				votos[3]++;
				totalVotos++;
			} else if (codigo == 5) {
				votos[4]++;
			} else if (codigo == 6) {
				votos[5]++;
			}
			if (codigo == 0) {
				continua = false;
			}
		}

		double percNulo;
		double percBranco;
		percNulo = (totalVotos / (votos[4] * 100));
		percBranco = (totalVotos / (votos[5] * 100));
		
		for (int i = INI; i < MAX; i++) {
			if (i == 0) {
				System.out.println("O total de votos para o candidato 1 - Jose é: " + votos[i]);
			} else if (i == 1) {
				System.out.println("O total de votos para o candidato 2 - João é: " + votos[i]);
			} else if (i == 2) {
				System.out.println("O total de votos para o candidato 3 - Marquinhos é: " + votos[i]);
			} else if (i == 3) {
				System.out.println("O total de votos para o candidato 4 - Feuser é: " + votos[i]);
			} else if (i == 4) {
				System.out.println("O total de votos 5 - Nulo é: " + votos[i]);
			} else if (i == 5) {
				System.out.println("O total de votos 6 - em Branco é: " + votos[i]);
				System.out.println("O percentual de votos nulos sobre o total é: " + percNulo);
				System.out.println("O percentual de votos em branco sobre o total é: " + percBranco);
			}
		}
		
		scan.close();
	}
}


