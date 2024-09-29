package Lista5Java;
import java.util.Scanner;
public class Ex29 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0;
		int ini = 0;
		int num = 0;

		System.out.print("Informe o número que você quer ver a tabuada: ");
		num = scan.nextInt();
		
		System.out.print("Informe onde a tabuada começara: ");
		ini = scan.nextInt();
		
		do {
			System.out.print("Informe onde a tabuada terminara: ");
			max = scan.nextInt();
			if (max < ini) {
				System.out.println("O final da tabuada deve ser maior que o inicio");
			}
		} while (max < ini);


		for (int i = ini; i <= max; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		scan.close();
	}
}
