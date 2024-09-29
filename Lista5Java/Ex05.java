package Lista5Java;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX = 20;
		final int INI = 1;
		
		for (int i = INI; i <= MAX; i++) {
			//para imprimir um embaixo do outro
			//System.out.println(i);
			
			//para imprimir um do lado do outro
			if (i == MAX) {
				System.out.print(i);
			} else {				
				System.out.print(i + ", ");
			}
		}
		
		scan.close();
	}
}
