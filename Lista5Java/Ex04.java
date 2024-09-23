package Lista5Java;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// o que estiver comentado é a primeira parte da questão e o resto é a modificação
		/*
		 * double populacaoA = 80000;
		 * double populacaoB = 200000;
		 * double taxaA = 0.03;
		 * double taxaB = 0.015;
		 * */
		
		double populacaoA = 0;
		double populacaoB = 0;
		double taxaA = 0;
		double taxaB = 0;
		String continua = "";
		
		do {
			
			//anos esta dentro do do while pq se não a variavel n ia ser setada de volta a 0 e iria acumular os anos
			int anos = 0;
			
			do {
				
				System.out.print("Informe a população do pais A: ");
				populacaoA = scan.nextDouble();
				
				System.out.print("Informe a população do pais B: ");
				populacaoB = scan.nextDouble();
				
				if (populacaoA >= populacaoB && populacaoA < 0 && populacaoB < 0) {
					System.out.println("Erro, a população do pais A deve ser menor que a do pais B");
				}
				
			} while (populacaoA >= populacaoB && populacaoA < 0 && populacaoB < 0);
			
			
			do {
				
				System.out.print("Informe a taxa de crescimento do pais A: ");
				taxaA = scan.nextDouble();
				
				if (taxaA <= 0) {
					System.out.println("Erro, a taxa de crescimento do pais A deve ser > 0");
				}
				
			} while (taxaA < 0);	
				
			
			do {
				
				System.out.print("Informe a taxa de crescimento do pais B: ");
				taxaB = scan.nextDouble();
				
				if (taxaB <= 0 && taxaB > taxaA) {
					System.out.println("Erro, a taxa de crescimento do pais B deve ser > 0 e < que a do pais A");
				}
				
			} while (taxaB <= 0 && taxaB > taxaA);
	
			
			/*
			while (populacaoA <= populacaoB) {
				populacaoA = (populacaoA + (populacaoA * taxaA));
				populacaoB = (populacaoB + (populacaoB * taxaB));
				anos += 1;
			}
			*/
			
			
			while (populacaoA <= populacaoB) {
				populacaoA = (populacaoA + (populacaoA * (taxaA / 100)));
				populacaoB = (populacaoB + (populacaoB * (taxaB / 100)));
				anos += 1;
			}

			
			System.out.println("A quantidade de anos para a população do pais A ultrapasar ou se igualar a do pais B é de " + anos + " anos");
			
			
			//limpeza de buffer
			scan.nextLine();
			
			
			System.out.print("Quer realizar uma nova operação (s ou n)? ");
			continua = scan.nextLine();
			
			
		} while ("s".equalsIgnoreCase(continua));
		
		scan.close();
	}
}
