package Lista5Java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex26 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 1;
		final int MAX = 50;
		double valor = 0;

		do {
			System.out.print("Qual o preço do pão: R$ ");
			valor = scan.nextDouble();
		} while ( valor <= 0);
		
		System.out.println("");
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int i = INI; i <= MAX; i++) {
			System.out.println(i + " - R$ " + new DecimalFormat("##0.00").format(valor* i));
        }
		
		scan.close();
	}
}

