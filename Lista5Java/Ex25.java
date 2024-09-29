package Lista5Java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 1;
		final int MAX = 50;
		double valor = 1.99;

		System.out.println("Loja Quase Dois - Tabela de Preços");
		
		for (int i = INI; i <= MAX; i++) {
			System.out.println(i + " - R$ " + new DecimalFormat("##0.00").format(valor* i));
        }
		
		scan.close();
	}
}

