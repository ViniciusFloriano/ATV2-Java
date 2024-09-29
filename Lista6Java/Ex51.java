package Lista6Java;
import java.util.Scanner;
public class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 30;
        int idades[] = new int[MAX];
        float alturas[] = new float[MAX];
        float somaAlturas = 0;
        float mediaAltura = 0;
        int contador = 0;
        
        for (int i = INI; i < MAX; i++) {
        	do {
        		System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
        		idades[i] = scan.nextInt();    
        		if (idades[i] <= 0) {
        			System.out.println("Erro");
        		}
        	} while (idades[i] <= 0);
            
        	do {
        		System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
                alturas[i] = scan.nextFloat();    
        		if (alturas[i] <= 0) {
        			System.out.println("Erro");
        		}
        	} while (alturas[i] <= 0);
            
        }
        
        for (int i = INI; i < MAX; i++) {
            somaAlturas += alturas[i];
        }
        
        mediaAltura = somaAlturas / MAX;

        for (int i = INI; i < MAX; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }
        
        System.out.println("\nQuantidade de alunos com mais de 13 anos e altura inferior à média: " + contador);
        
        scan.close();
    }
}

