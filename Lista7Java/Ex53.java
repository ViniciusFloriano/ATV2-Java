package Lista7Java;
import java.util.Scanner;
import java.io.*;
public class Ex53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        int n = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int soma = 0;
        float media = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        char salvar = ' ';
        char carregar = ' ';
        
        do {
            System.out.print("Digite um valor inteiro ímpar entre 3 e 11: ");
            n = scan.nextInt();
            if (n < 3 || n > 11 || n % 2 == 0) {
                System.out.println("Entrada inválida. O número deve ser ímpar e estar entre 3 e 11.");
            }
        } while (n < 3 || n > 11 || n % 2 == 0);
        
        int matriz[][] = new int[n][n];
        System.out.println("\nInforme os valores para a matriz " + n + "x" + n + ":");
        for (int i = INI; i < n; i++) {
            for (int j = INI; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for (int i = INI; i < n; i++) {
            for (int j = INI; j < n; j++) {
                int valor = matriz[i][j];
                soma += valor;

                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;

                if (valor % 2 == 0) contadorPares++;
                else contadorImpares++;

                if (i == j) somaDiagonalPrincipal += valor;

                if (i + j == n - 1) somaDiagonalSecundaria += valor;
            }
        }
        
        media = (float) soma / (n * n);
        
        System.out.println("\nMatriz:");
        for (int i = INI; i < n; i++) {
            for (int j = INI; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nResultados:");
        System.out.println("Soma dos elementos: " + soma);
        System.out.printf("Média dos elementos: %.2f\n", media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade de pares: " + contadorPares);
        System.out.println("Quantidade de ímpares: " + contadorImpares);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        
        System.out.print("\nDeseja salvar os dados em um arquivo? (s/n): ");
        salvar = scan.next().toLowerCase().charAt(0);
        if (salvar == 's') {
            salvarArquivo(matriz, soma, media, maior, menor, contadorPares, contadorImpares, somaDiagonalPrincipal, somaDiagonalSecundaria);
        }
        
        System.out.print("Deseja carregar os dados do arquivo? (s/n): ");
        carregar = scan.next().toLowerCase().charAt(0);
        if (carregar == 's') {
            carregarArquivo();
        }
        
        scan.close();
    }
    
    private static void salvarArquivo(int[][] matriz, int soma, float media, int maior, int menor, int contadorPares, int contadorImpares, int somaDiagonalPrincipal, int somaDiagonalSecundaria) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados_matriz.txt"))) {
            pw.println("Matriz:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    pw.print(matriz[i][j] + "\t");
                }
                pw.println();
            }

            pw.println("\nResultados:");
            pw.println("Soma dos elementos: " + soma);
            pw.printf("Média dos elementos: %.2f\n", media);
            pw.println("Maior valor: " + maior);
            pw.println("Menor valor: " + menor);
            pw.println("Quantidade de pares: " + contadorPares);
            pw.println("Quantidade de ímpares: " + contadorImpares);
            pw.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
            pw.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

            System.out.println("\nDados salvos no arquivo 'dados_matriz.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
    
    private static void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("dados_matriz.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

