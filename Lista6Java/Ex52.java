package Lista6Java;
import java.util.Scanner;
public class Ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 5;
        int valores[] = new int[MAX];
        float valor = 0;
        
        for (int i = INI; i < MAX; i++) {
        	do {
                System.out.print("Digite um valor entre 0 e 20 para o índice " + (i + 1) + ": ");
                valor = scan.nextInt();
                if (valor < 0 || valor > 20) {
                    System.out.println("Valor inválido! Digite novamente.");
                }
            } while (valor < 0 || valor > 20);
            
        }
        
        System.out.println("\nGráfico gerado:");
        for (int i = INI; i < MAX; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = INI; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        
        scan.close();
    }
}

