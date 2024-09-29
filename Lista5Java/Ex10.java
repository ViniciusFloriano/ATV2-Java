package Lista5Java;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int base = 0;
		int expoente = 0;
		int resultado = 1;

		System.out.print("Informe a base a ser elevada: ");
		base = scan.nextInt();

		System.out.print("Informe o expoente: ");
		expoente = scan.nextInt();

		for (int i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}
		
		System.out.println(base + " elevado a  " + expoente + " = " + resultado);

		scan.close();
	}
}
