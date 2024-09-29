package Lista5Java;
import java.util.Scanner;
public class Ex38 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		String strNum = "";
		String numInvertido = "";
		
		do {
			System.out.print("Informe um número inteiro: ");
			num = scan.nextInt();
			if (num <= 0) {
				System.out.println("Erro");
			}
		} while (num <= 0);
		
		strNum = Integer.toString(num);
		numInvertido = new StringBuilder(strNum).reverse().toString();
		
		System.out.println("Número que você digitou: " + num);
		System.out.println("Número que você digitou invertido: " + numInvertido);
		
		scan.close();
	}
}


