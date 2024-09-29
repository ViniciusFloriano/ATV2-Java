package Lista7Java;
import java.util.Scanner;
import java.io.*;
public class Ex54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int NUM_PRODUTOS = 5;
        final int NUM_SUPERMERCADOS = 5;
        double[][] precos = new double[NUM_SUPERMERCADOS][NUM_PRODUTOS];
        double[] mediaPrecosPorProduto = new double[NUM_PRODUTOS];
        double[] somaPrecosPorSupermercado = new double[NUM_SUPERMERCADOS];
        double somaProduto = 0;
        double somaSupermercado = 0;
        int supermercadoMaisBarato = 1;
        int supermercadoMaisCaro = 1;
        char salvar = ' ';
        char carregar = ' ';
        
        for (int i = INI; i < NUM_SUPERMERCADOS; i++) {
            System.out.println("\nSupermercado " + (i + 1) + ":");
            for (int j = 0; j < NUM_PRODUTOS; j++) {
                System.out.print("Digite o preço do produto " + (j + 1) + ": ");
                precos[i][j] = scan.nextDouble();
            }
        }
        
        System.out.println("\nPreços nos supermercados:");
        for (int i = INI; i < NUM_SUPERMERCADOS; i++) {
            System.out.print("Supermercado " + (i + 1) + ": ");
            for (int j = INI; j < NUM_PRODUTOS; j++) {
                System.out.printf("%.2f ", precos[i][j]);
            }
            System.out.println();
        }
        
        for (int j = INI; j < NUM_PRODUTOS; j++) {
            for (int i = INI; i < NUM_SUPERMERCADOS; i++) {
                somaProduto += precos[i][j];
            }
            mediaPrecosPorProduto[j] = somaProduto / NUM_SUPERMERCADOS;
        }
        
        System.out.println("\nMédia de preço por produto:");
        for (int j = INI; j < NUM_PRODUTOS; j++) {
            System.out.printf("Produto %d: %.2f\n", (j + 1), mediaPrecosPorProduto[j]);
        }
        
        for (int i = INI; i < NUM_SUPERMERCADOS; i++) {
            for (int j = INI; j < NUM_PRODUTOS; j++) {
                somaSupermercado += precos[i][j];
            }
            somaPrecosPorSupermercado[i] = somaSupermercado;
        }
        
        System.out.println("\nSoma dos preços por supermercado:");
        for (int i = INI; i < NUM_SUPERMERCADOS; i++) {
            System.out.printf("Supermercado %d: %.2f\n", (i + 1), somaPrecosPorSupermercado[i]);
        }
        
        double menorPrecoTotal = somaPrecosPorSupermercado[0];
        double maiorPrecoTotal = somaPrecosPorSupermercado[0];

        for (int i = 1; i < NUM_SUPERMERCADOS; i++) {
            if (somaPrecosPorSupermercado[i] < menorPrecoTotal) {
                menorPrecoTotal = somaPrecosPorSupermercado[i];
                supermercadoMaisBarato = i + 1;
            }
            if (somaPrecosPorSupermercado[i] > maiorPrecoTotal) {
                maiorPrecoTotal = somaPrecosPorSupermercado[i];
                supermercadoMaisCaro = i + 1;
            }
        }
        
        System.out.println("\nSupermercado mais barato: Supermercado " + supermercadoMaisBarato + " (Total: " + menorPrecoTotal + ")");
        System.out.println("Supermercado mais caro: Supermercado " + supermercadoMaisCaro + " (Total: " + maiorPrecoTotal + ")");
        
        System.out.print("\nDeseja salvar os dados em um arquivo? (s/n): ");
        salvar = scan.next().toLowerCase().charAt(0);
        if (salvar == 's') {
            salvarArquivo(precos, mediaPrecosPorProduto, somaPrecosPorSupermercado, supermercadoMaisBarato, menorPrecoTotal, supermercadoMaisCaro, maiorPrecoTotal);
        }
        
        System.out.print("Deseja carregar os dados do arquivo? (s/n): ");
        carregar = scan.next().toLowerCase().charAt(0);
        if (carregar == 's') {
            carregarArquivo();
        }
        
        scan.close();
    }
    
    private static void salvarArquivo(double[][] precos, double[] mediaPrecosPorProduto, double[] somaPrecosPorSupermercado, int supermercadoMaisBarato, double menorPrecoTotal, int supermercadoMaisCaro, double maiorPrecoTotal) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados_supermercado.txt"))) {
            pw.println("Preços nos supermercados:");
            for (int i = 0; i < precos.length; i++) {
                pw.print("Supermercado " + (i + 1) + ": ");
                for (int j = 0; j < precos[i].length; j++) {
                    pw.printf("%.2f ", precos[i][j]);
                }
                pw.println();
            }

            pw.println("\nMédia de preço por produto:");
            for (int j = 0; j < mediaPrecosPorProduto.length; j++) {
                pw.printf("Produto %d: %.2f\n", (j + 1), mediaPrecosPorProduto[j]);
            }

            pw.println("\nSoma dos preços por supermercado:");
            for (int i = 0; i < somaPrecosPorSupermercado.length; i++) {
                pw.printf("Supermercado %d: %.2f\n", (i + 1), somaPrecosPorSupermercado[i]);
            }

            pw.println("\nSupermercado mais barato: Supermercado " + supermercadoMaisBarato + " (Total: " + menorPrecoTotal + ")");
            pw.println("Supermercado mais caro: Supermercado " + supermercadoMaisCaro + " (Total: " + maiorPrecoTotal + ")");

            System.out.println("\nDados salvos no arquivo 'dados_supermercado.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private static void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("dados_supermercado.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

