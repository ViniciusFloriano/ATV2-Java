package Lista6Java;
import java.util.Scanner;
public class Ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 5;
        int idades[] = new int[MAX];
        float alturas[] = new float[MAX];
        int maisVelho = 0, maisNovo = 0;
        float maisBaixo = 0, maisAlto = 0;
        
        for (int i = INI; i < MAX; i++) {
        	do {
        		System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
        		idades[i] = scan.nextInt();
        		if (idades[i] <= 0) {
        			System.out.println("Erro");
        		}
        	} while (idades[i] <= 0);
        	
        	do {
        		System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            	alturas[i] = scan.nextFloat(); 
        		if (alturas[i] <= 0) {
        			System.out.println("Erro");
        		}
        	} while (alturas[i] <= 0);
        	       		
            if (i == 0) {
                maisVelho = idades[i];
                maisNovo = idades[i];
                maisAlto = alturas[i];
                maisBaixo = alturas[i];
            } else {
                if (idades[i] > maisVelho) maisVelho = idades[i];
                if (idades[i] < maisNovo) maisNovo = idades[i];
                
                if (alturas[i] > maisAlto) maisAlto = alturas[i];
                if (alturas[i] < maisBaixo) maisBaixo = alturas[i];
            }
        }

        System.out.println("\nIdades e alturas na ordem inversa:");
        for (int i = MAX-1; i >= INI; i--) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }
        
        float somaIdades = 0, somaAlturas = 0;
        
        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }
        
        float mediaIdade = somaIdades / MAX;
        float mediaAltura = somaAlturas / MAX;
        
        System.out.println("\nMais velho tem: " + maisVelho + " anos.");
        System.out.println("Mais novo tem: " + maisNovo + " anos.");
        System.out.println("Mais alto tem: " + maisAlto + " metros.");
        System.out.println("Mais baixo tem: " + maisBaixo + " metros.");
        
        System.out.println("\nPessoas abaixo da média de idade (" + mediaIdade + " anos):");
        for (int i = INI; i < MAX; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " metros");
            }
        }
        
        System.out.println("\nPessoas acima da média de idade (" + mediaIdade + " anos):");
        for (int i = INI; i < MAX; i++) {
            if (idades[i] > mediaIdade) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " metros");
            }
        }
        
        System.out.println("\nPessoas abaixo da média de altura (" + mediaAltura + " metros):");
        for (int i = INI; i < MAX; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " metros");
            }
        }
        
        System.out.println("\nPessoas acima da média de altura (" + mediaAltura + " metros):");
        for (int i = INI; i < MAX; i++) {
            if (alturas[i] > mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " metros");
            }
        }
        
        scan.close();
    }
}

