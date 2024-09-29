package Lista5Java;
import java.util.Scanner;
public class Ex30 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo = 0;
		int codigoMaior = 0;
		int codigoMenor = 0;
		int codigoMaisG = 0;
		int codigoMaisM = 0;
		double altura = 0;
		int quantAltura = 0;
		double somaAltu = 0;
		double peso = 0;
		double somaPeso = 0;
		int quantPeso = 0;
		double maior = 0;
		double menor = 0;
		double maisGordo = 0;
		double maisMagro = 0;
		int controlador = 0;
		
		boolean continua = true;

		while (continua) {
			System.out.print("qual o seu codigo: ");
			codigo = scan.nextInt();
			
			if (codigo == 0) {
				continua = false;
			} else { 
				
				do {
					System.out.print("qual a sual altura (metros): ");
					altura = scan.nextDouble();	
					if (altura <= 0) {
						System.out.println("Erro");
					}
				} while (altura <= 0);
				somaAltu += altura;
				quantAltura++;
				
				do {
					System.out.print("qual o seu peso (Kg): ");
					peso = scan.nextDouble();
					if (peso <= 0) {
						System.out.println("Erro");
					}
				} while (peso <= 0);
				somaPeso += peso;
				quantPeso++;
				
				if (controlador == 0) {
					codigoMaior = codigo;
					codigoMenor = codigo;
					codigoMaisG = codigo;
					codigoMaisM = codigo;
					maior = altura;
					menor = altura;
					maisGordo = peso;
					maisMagro = peso;
				} else {
					if (altura > maior) {
						codigoMaior = codigo;
						maior = altura;
					} else if (altura < menor) {
						codigoMenor = codigo;
						menor = altura;
					}
					
					if (peso > maisGordo) {
						codigoMaisG = codigo;
						maisGordo = peso;
					} else if (peso < maisMagro) {
						codigoMaisM = codigo;
						maisMagro = peso;
					}
				}
				controlador++;

			}
		}
		
		System.out.println("");
		System.out.println("O codigo do cliente maior: " + codigoMaior);
		System.out.println("A altura do cliente maior: " + maior);
		System.out.println("");
		System.out.println("O codigo do cliente menor: " + codigoMenor);
		System.out.println("A altura do cliente menor: " + menor);
		System.out.println("");
		System.out.println("O codigo do cliente mais gordo: " + codigoMaisG);
		System.out.println("O peso do cliente mais gordo: " + maisGordo);
		System.out.println("");
		System.out.println("O codigo do cliente mais magro: " + codigoMaisM);
		System.out.println("O peso do cliente mais magro: " + maisMagro);
		System.out.println("");
		System.out.println("A média das alturas é: " + (somaAltu / quantAltura));
		System.out.println("A média dos pesos é: " + (somaPeso / quantPeso));


		
		scan.close();
	}
}

