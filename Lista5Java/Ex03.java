package Lista5Java;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo = "";
		String estadoCivil = "";
		
		do {
			
			System.out.print("Informe seu nome: ");
			nome = scan.nextLine();
			
			if (nome.length() <= 3) {
				System.out.println("Erro, nome deve ter mais que 3 caracteres");
			}
			
		} while (nome.length() <= 3);
		
		
		do {
			
			System.out.print("Informe sua idade: ");
			idade = scan.nextInt();
			
			if (idade < 0 || idade > 150) {
				System.out.println("Erro, idade tem que ser > 0 e < 150");
			}
			
		} while (idade < 0 || idade > 150);
		
		
		do {
			
			System.out.print("Informe seu salário: R$");
			salario = scan.nextDouble();
			
			if (salario < 0) {
				System.out.println("Erro, salario deve ser > 0");
			}
			
		} while(salario < 0);
		
		
		scan.nextLine();
		
		
		do {
			
			System.out.print("Informe seu sexo (f ou m): ");
			sexo = scan.nextLine();
			
			if (!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo)) {
				System.out.println("Erro, sexo deve ser f ou m");
			}
			
		} while (!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo));
		
		
		do {
			
			System.out.print("Informe seu estado civil (s, c , v ou d): ");
			estadoCivil = scan.nextLine();
			
			if (!"s".equalsIgnoreCase(estadoCivil) && !"c".equalsIgnoreCase(estadoCivil) && !"v".equalsIgnoreCase(estadoCivil) && !"d".equalsIgnoreCase(estadoCivil)) {
				System.out.println("Erro, estado civil deve ser s, c, v ou d");
			}
			
		} while (!"s".equalsIgnoreCase(estadoCivil) && !"c".equalsIgnoreCase(estadoCivil) && !"v".equalsIgnoreCase(estadoCivil) && !"d".equalsIgnoreCase(estadoCivil));
		
		scan.close();
	}
}
