package Lista5Java;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		String senha = "";
		
		do {
			
			if (senha.equalsIgnoreCase(nome) && senha != "") {
				System.out.println("Erro");
			}
			
			System.out.print("Informe seu nome: ");
			nome = scan.nextLine();			
			System.out.print("Informe sua senha: ");
			senha = scan.nextLine();
			
		} while (senha.equalsIgnoreCase(nome));
		
		scan.close();
	}
}
