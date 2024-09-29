package Lista5Java;
import java.util.Scanner;
public class Ex32 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 5;
		int codigoCidade = 0;
		int veiculos = 0;
		int acidentes = 0;
		int somaVeiculos = 0;
		int somaAcidentes = 0;
		int codigoMaior = 0;
		int maiorAcidente = 0;
		int codigoMenor = 0;
		int menorAcidente = 0;
		int cidadeMenosAcidentes = 0;
		
		for (int i = INI; i < MAX; i++) {
			System.out.print("qual o código da cidade: ");
			codigoCidade = scan.nextInt();
			System.out.print("qual o número de veículos de passeio (em 1999):  ");
			veiculos = scan.nextInt();
			System.out.print("qual o número de acidentes de trânsito com vitímas (em 1999):  ");
			acidentes = scan.nextInt();
			somaVeiculos += veiculos;
			if (veiculos < 2000) {
				somaAcidentes += acidentes;	
				cidadeMenosAcidentes++;
			}
			
			if (i == 0) {
				codigoMaior = codigoCidade;
				codigoMenor = codigoCidade;
				maiorAcidente = acidentes;
				menorAcidente = acidentes;
			} else {
				if (acidentes > maiorAcidente) {
					codigoMaior = codigoCidade;
					maiorAcidente = acidentes;
				} else if (acidentes < menorAcidente) {
					codigoMenor = codigoCidade;
					menorAcidente = acidentes;
				}
			}
		}
		
		System.out.println("Cidade com maior índice de acidentes: " + codigoMaior);
		System.out.println("Índice de acidentes: " + maiorAcidente);
		System.out.println("Cidade com menor índice de acidentes: " + codigoMenor);
		System.out.println("Índice de acidentes: " + menorAcidente);
		System.out.println("Média de carros nas 5 cidades: " + (somaVeiculos / 5));
		System.out.println("Média de acidentes em cidades com menos de 2000 veiculos: " + (somaAcidentes / cidadeMenosAcidentes));
		
		scan.close();
	}
}

