package Lista5Java;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0;
		int ini = 0;
		int num = 0;
		int soma = 0;
		
		System.out.print("Informe o ponta A: ");
		ini = scan.nextInt();
		System.out.print("Informe o ponta B: ");
		max = scan.nextInt();

		if (max < ini) {
			System.out.print("Números dentro do intervalo: ");
			
			for (int i = max; i <= ini; i++) {
				if (i == max) {
					num = max;
					soma += num;
					System.out.print(num + ", ");
				} else if (i == ini) {
					num += 1;
					soma += num;
					System.out.println(num);
				} else {	
					num += 1;
					soma += num;
					System.out.print(num + ", ");
				}
			}
			
			System.out.println("A soma dos números do intervalo é: " + soma);
		} else {
			System.out.print("Números dentro do intervalo: ");
			
			for (int i = ini; i <= max; i++) {
				if (i == ini) {
					num = ini;
					soma += num;
					System.out.print(num + ", ");
				} else if (i == max) {
					num += 1;
					soma += num;
					System.out.println(num);
				} else {	
					num += 1;
					soma += num;
					System.out.print(num + ", ");
				}
			}
			
			System.out.println("A soma dos números do intervalo é: " + soma);
		}

		scan.close();
	}
}
