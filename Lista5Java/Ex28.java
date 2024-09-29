package Lista5Java;
import java.util.Scanner;
public class Ex28 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double temp = 0;
		double soma = 0;
		int numTemp = 0;
		double maior = 0;
		double menor = 0;
		boolean continua = true;

		while (continua) {
			System.out.print("Temperatura " + (numTemp + 1) + ": ");
			temp = scan.nextDouble();
			if (temp == 999) {
				continua = false;
			} else { 
				soma += temp;
				if (numTemp == 0) {
					maior = temp;
					menor = temp;
				} else {
					if (temp > maior) {
						maior = temp;
					} else if (temp < menor) {
						menor = temp;
					}
				}
				numTemp++;
			}
		}
		

		System.out.println("Maior temp: " + maior);
		System.out.println("Menor temp: " + menor);
		System.out.println("Média das temperatura: " + (soma / numTemp));
		
		scan.close();
	}
}

