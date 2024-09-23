package Lista5Java;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		do {
			
			if (num < 0 || num > 10) {
				System.out.println("Erro");
			}
			
			System.out.print("Informe uma nota (0 a 10): ");
			num = scan.nextInt();
			
		} while (num > 10 || num < 0);
		
		scan.close();
	}
}
