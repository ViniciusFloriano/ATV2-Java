package Lista5Java;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0;
		int ini = 0;
		int num = 0;

		System.out.print("Informe o ponta A: ");
		ini = scan.nextInt();
		System.out.print("Informe o ponta B: ");
		max = scan.nextInt();

		if (max < ini) {
			System.out.print("Números dentro do intervalo: ");
			
			for (int i = max; i <= ini; i++) {
				if (i == max) {
					num = max;
					System.out.print(num + ", ");
				} else if (i == ini) {
					num += 1;
					System.out.print(num);
				} else {	
					num += 1;
					System.out.print(num + ", ");
				}
			}
		} else {
			System.out.print("Números dentro do intervalo: ");
			
			for (int i = ini; i <= max; i++) {
				if (i == ini) {
					num = ini;
					System.out.print(num + ", ");
				} else if (i == max) {
					num += 1;
					System.out.print(num);
				} else {	
					num += 1;
					System.out.print(num + ", ");
				}
			}
		}

		scan.close();
	}
}
