package Lista7Java;
import java.util.*;
import java.io.*;
public class Ex57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        final int INI = 0;
        final int MAX = 6;
        int numCartelas = 0;
        char salvar = ' ';
        char carregar = ' ';
        
        System.out.print("Digite a quantidade de cartelas que deseja preencher: ");
        numCartelas = scan.nextInt();
        
        int[][] cartelas = new int[numCartelas][MAX];
        
        for (int i = INI; i < numCartelas; i++) {
            Set<Integer> numeros = new HashSet<>();
            while (numeros.size() < 6) {
                int numero = rand.nextInt(60) + 1;
                numeros.add(numero);
            }
            int j = INI;
            for (int numero : numeros) {
                cartelas[i][j++] = numero;
            }
        }
        
        System.out.println("\nCartelas preenchidas:");
        for (int i = INI; i < numCartelas; i++) {
            System.out.print("Cartela " + (i + 1) + ": ");
            Arrays.sort(cartelas[i]);
            for (int j = INI; j < 6; j++) {
                System.out.print(cartelas[i][j] + " ");
            }
            System.out.println();
        }
        
        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            int numero = rand.nextInt(60) + 1;
            numerosSorteados.add(numero);
        }
        System.out.println("\nNúmeros sorteados:");
        System.out.println(numerosSorteados);
        
        System.out.println("\nAnálise de acertos:");
        for (int i = INI; i < numCartelas; i++) {
            int acertos = contarAcertos(cartelas[i], numerosSorteados);
            System.out.print("Cartela " + (i + 1) + ": ");
            for (int j = INI; j < 6; j++) {
                System.out.print(cartelas[i][j] + " ");
            }
            System.out.println("- Acertos: " + acertos);
        }
        
        System.out.print("\nDeseja salvar os dados em um arquivo? (s/n): ");
        salvar = scan.next().toLowerCase().charAt(0);
        if (salvar == 's') {
            salvarDados(cartelas, numCartelas);
        }
        
        System.out.print("Deseja carregar os dados do arquivo? (s/n): ");
        carregar = scan.next().toLowerCase().charAt(0);
        if (carregar == 's') {
            carregarDados();
        }
        
        scan.close();
    }
    
    private static int contarAcertos(int[] cartela, Set<Integer> numerosSorteados) {
        int acertos = 0;
        for (int numero : cartela) {
            if (numerosSorteados.contains(numero)) {
                acertos++;
            }
        }
        return acertos;
    }
    
    private static void salvarDados(int[][] cartelas, int numCartelas) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados_loteria.txt"))) {
            pw.println("Cartelas preenchidas:");
            for (int i = 0; i < numCartelas; i++) {
                pw.print("Cartela " + (i + 1) + ": ");
                Arrays.sort(cartelas[i]);
                for (int j = 0; j < 6; j++) {
                    pw.print(cartelas[i][j] + " ");
                }
                pw.println();
            }
            pw.println("\nNúmeros sorteados:");
            Random rand = new Random();
            Set<Integer> numerosSorteados = new HashSet<>();
            while (numerosSorteados.size() < 6) {
                int numero = rand.nextInt(60) + 1;
                numerosSorteados.add(numero);
            }
            pw.println(numerosSorteados);

            System.out.println("\nDados salvos no arquivo 'dados_loteria.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private static void carregarDados() {
        try (BufferedReader br = new BufferedReader(new FileReader("dados_loteria.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

