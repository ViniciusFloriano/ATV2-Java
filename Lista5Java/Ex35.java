package Lista5Java;
import java.util.Scanner;
public class Ex35 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int INI = 0;
		final int MAX = 6;
		boolean continua = true;
		String op = "";
		int codigo = 0;
		int quantidade = 0;
		double precoTotal = 0;
		double produtos[] = new double[MAX];
		produtos[0] = 0;
		produtos[1] = 0;
		produtos[2] = 0;
		produtos[3] = 0;
		produtos[4] = 0;
		produtos[5] = 0;

		while (continua) {
			do {
				System.out.print("informe o codigo do produto (100 a 105): ");
				codigo = scan.nextInt();		
				if (codigo < 100 || codigo > 105) {
					System.out.println("Erro");
				}
			} while (codigo < 100 || codigo > 105);
			System.out.print("informe a quantidade: ");
			quantidade = scan.nextInt();	
			if (codigo == 100) {
				produtos[0] = quantidade;
			} else if (codigo == 101) {
				produtos[1] = quantidade;
			} else if (codigo == 102) {
				produtos[2] = quantidade;
			} else if (codigo == 103) {
				produtos[3] = quantidade;
			} else if (codigo == 104) {
				produtos[4] = quantidade;
			} else if (codigo == 105) {
				produtos[5] = quantidade;
			} 
			scan.nextLine();
			System.out.print("quer continuar (s ou n)? ");
			op = scan.nextLine();
			if (!"s".equalsIgnoreCase(op)) {
				continua = false;
			}
		}

		for (int i = INI; i < MAX; i++) {
			if (i == 0 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) cachorro-quente sera: R$ " + (produtos[i] * 1.20));
				precoTotal += (produtos[i] * 1.20);
			} else if (i == 1 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) bauru simples sera: R$ " + (produtos[i] * 1.30));
				precoTotal += (produtos[i] * 1.30);
			} else if (i == 2 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) bauru com ovo sera: R$ " + (produtos[i] * 1.50));
				precoTotal += (produtos[i] * 1.50);
			} else if (i == 3 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) hambúrguer sera: R$ " + (produtos[i] * 1.20));
				precoTotal += (produtos[i] * 1.20);
			} else if (i == 4 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) cheeseburguer sera: R$ " + (produtos[i] * 1.30));
				precoTotal += (produtos[i] * 1.30);
			} else if (i == 5 && produtos[i] != 0) {
				System.out.println("O preço a ser pego pelo(s) refrigerante sera: R$ " + (produtos[i] * 1.00));
				precoTotal += (produtos[i] * 1.00);
				System.out.println("O preço total do pedido sera: R$ " + precoTotal);
			}
		}
		
		scan.close();
	}
}


