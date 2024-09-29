package Lista6Java;
import java.util.Scanner;
public class Ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 10;
        final int MAX3 = 20;
        int vetor1[] = new int[MAX];
        int vetor2[] = new int[MAX];
        int vetor3[] = new int[20];
        
        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = INI; i < MAX; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (int i = INI; i < MAX; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scan.nextInt();
        }
        
        for (int i = INI, j = INI; i < MAX; i++) {
            vetor3[j++] = vetor1[i];
            vetor3[j++] = vetor2[i];
        }
        
        System.out.println("\nVetor intercalado:");
        for (int i = INI; i < MAX3; i++) {
            System.out.print(vetor3[i] + " ");
        }
        
        scan.close();
    }
}

