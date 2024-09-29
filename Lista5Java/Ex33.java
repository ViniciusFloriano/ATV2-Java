package Lista5Java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex33 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 5;
		double valorDivida = 0;
		double juros[] = new double[MAX];
		juros[0] = 0;
		juros[1] = 0.10;
		juros[2] = 0.15;
		juros[3] = 0.20;
		juros[4] = 0.25;
		int parcela = 1;

		do {
			System.out.print("qual o valor da divida: ");
			valorDivida = scan.nextDouble();			
		} while (valorDivida <= 0);

		System.out.print("Valor da Dívida |");
		System.out.print("Valor dos Juros |");
		System.out.print("Quantidade de Parcelas |");
		System.out.println("Valor da Parcela");
		for (int i = INI; i < MAX; i++) {
			System.out.print("R$ " + new DecimalFormat("###.00").format((valorDivida + (juros[i] * valorDivida))) + "      |");
			System.out.print("R$ " + new DecimalFormat("##0.00").format(juros[i] * valorDivida) + "         |");
			System.out.print(parcela + "                      |");
			System.out.println("R$ " + new DecimalFormat("###.00").format((valorDivida + (juros[i] * valorDivida)) / parcela));
			if (parcela == 1) {
				parcela *= 3;				
			} else {
				parcela += 3;
			}
		}
		
		scan.close();
	}
}

