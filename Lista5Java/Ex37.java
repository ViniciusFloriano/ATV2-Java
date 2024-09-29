package Lista5Java;
import java.util.Scanner;
public class Ex37 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 10;
		boolean continua = true;
		int quantAlunos = 0;
		String op = "";
		String respostas[] = new String[MAX];
		//String gabarito[] = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"}; <- versão antes da modificação
		String gabarito[] = new String[MAX];
		int totalNotas = 0;
		int acertos = 0;
		int maiorAcerto = 0;
		int menorAcerto = 0;

		for (int i = INI; i < MAX; i++) {
			System.out.println("Professor, informe a resposta correta da questão " + (i + 1) + ": ");
			gabarito[i] = scan.nextLine();
		}
		
		while (continua) {
			System.out.print("informe a respota de questão 1: ");
			respostas[0] = scan.nextLine();
			System.out.print("informe a respota de questão 2: ");
			respostas[1] = scan.nextLine();
			System.out.print("informe a respota de questão 3: ");
			respostas[2] = scan.nextLine();
			System.out.print("informe a respota de questão 4: ");
			respostas[3] = scan.nextLine();
			System.out.print("informe a respota de questão 5: ");
			respostas[4] = scan.nextLine();
			System.out.print("informe a respota de questão 6: ");
			respostas[5] = scan.nextLine();
			System.out.print("informe a respota de questão 7: ");
			respostas[6] = scan.nextLine();
			System.out.print("informe a respota de questão 8: ");
			respostas[7] = scan.nextLine();
			System.out.print("informe a respota de questão 9: ");
			respostas[8] = scan.nextLine();
			System.out.print("informe a respota de questão 10: ");
			respostas[9] = scan.nextLine();
			for (int i = INI; i < MAX; i++) {
				if (gabarito[i].equalsIgnoreCase(respostas[i])) {
					acertos++;
				}
				if (i == 0) {
					maiorAcerto = acertos;
					menorAcerto = acertos;
				} else {
					if (acertos > maiorAcerto) {
						maiorAcerto = acertos;
					} else if (acertos < menorAcerto) {
						menorAcerto = acertos;						
					}
				}
				totalNotas += acertos;
				quantAlunos++;
			}
			System.out.print("outro aluno vai utilizar (s ou n)? ");
			op = scan.nextLine();
			if (!"s".equalsIgnoreCase(op)) {
				continua = false;
			}
		}
		
		double media = totalNotas / quantAlunos;

		System.out.println("Total de alunos que utilizaram o sistema: " + quantAlunos);
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Média da turma: " + media);
		
		scan.close();
	}
}


