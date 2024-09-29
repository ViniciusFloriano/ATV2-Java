package Lista5Java;
import java.util.Scanner;
public class Ex27 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor = 0;
		double soma = 0;
		int numProduto = 1;
		double dinheiroRecebido = 0;
		double troco = 0;

		do {
			System.out.print("Produto " + numProduto + ": R$ ");
			valor = scan.nextDouble();
			soma += valor;
			numProduto++;
		} while ( valor != 0);
		

		System.out.println("Total: R$ " + soma);
		
		do {
			System.out.print("Dinheiro : R$ ");
			dinheiroRecebido = scan.nextDouble();
			if (dinheiroRecebido < soma ) {
				System.out.println("Dinheiro insuficiente");
			}
		} while ( dinheiroRecebido < soma);
		
		troco = dinheiroRecebido - soma;
		
		System.out.println("Troco: R$ " + troco);
		
		scan.close();
	}
}

