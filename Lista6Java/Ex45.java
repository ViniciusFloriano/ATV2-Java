package Lista6Java;
import java.util.Scanner;
import java.util.Random;
public class Ex45 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		final int INI = 0;
		final int MAX = 26;
		char alfabeto[] = new char[MAX];
		int tamanhoSenha = 0;
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        char consoantes[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm','n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('a' + i);
        }
		
		do {
			System.out.print("Informe o tamanho da senha: ");
			tamanhoSenha = scan.nextInt();
			if (tamanhoSenha <= 0 || tamanhoSenha > 26) {
				System.out.println("Erro");
			}
		} while (tamanhoSenha <= 0 || tamanhoSenha > 26);

		StringBuilder senha = new StringBuilder();
		
		for (int i = INI; i < tamanhoSenha; i++) {
            if (i % 2 == 0) {
                senha.append(consoantes[random.nextInt(consoantes.length)]);
            } else {
                senha.append(vogais[random.nextInt(vogais.length)]);
            }
        }
		
		if (tamanhoSenha % 2 != 0) {
            senha.setCharAt(tamanhoSenha - 1, consoantes[random.nextInt(consoantes.length)]);
        }
		
		System.out.println("Senha gerada: " + senha);
		
		scan.close();
	}
}
