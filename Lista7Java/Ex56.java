package Lista7Java;
import java.util.Scanner;
import java.io.*;
public class Ex56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 5;
        int numAtletas = 0;
        double somaSaltos = 0;
        double menorSalto = Double.MAX_VALUE;
        char salvar = ' ';
        char carregar = ' ';
        
        System.out.print("Digite o número de atletas: ");
        numAtletas = scan.nextInt();
        
        String[] atletas = new String[numAtletas];
        double[][] saltos = new double[numAtletas][MAX];
        double[] medias = new double[numAtletas];
        
        for (int i = INI; i < numAtletas; i++) {
            scan.nextLine();
            System.out.print("\nDigite o nome do atleta " + (i + 1) + ": ");
            atletas[i] = scan.nextLine();

            System.out.println("Digite os 5 saltos do atleta " + atletas[i] + ": ");
            for (int j = INI; j < MAX; j++) {
                System.out.print("Salto " + (j + 1) + ": ");
                saltos[i][j] = scan.nextDouble();
                somaSaltos += saltos[i][j];

                if (saltos[i][j] < menorSalto) {
                    menorSalto = saltos[i][j];
                }
            }

            medias[i] = (somaSaltos - menorSalto) / 4;
            System.out.printf("Média dos saltos do atleta %s (desprezando o pior salto): %.2f\n", atletas[i], medias[i]);
        }
        
        System.out.println("\nSaltos e médias dos atletas:");
        for (int i = INI; i < numAtletas; i++) {
            System.out.print(atletas[i] + ": ");
            for (int j = INI; j < MAX; j++) {
                System.out.printf("%.2f ", saltos[i][j]);
            }
            System.out.printf("- Média: %.2f\n", medias[i]);
        }
        
        double maiorMedia = medias[0];
        double menorMedia = medias[0];
        String atletaCampeao = atletas[0];
        String atletaUltimo = atletas[0];
        
        for (int i = 1; i < numAtletas; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                atletaCampeao = atletas[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                atletaUltimo = atletas[i];
            }
        }
        
        System.out.printf("\nCampeão: %s - Média: %.2f\n", atletaCampeao, maiorMedia);
        System.out.printf("Último lugar: %s - Média: %.2f\n", atletaUltimo, menorMedia);

        System.out.print("\nDeseja salvar os dados em um arquivo? (s/n): ");
        salvar = scan.next().toLowerCase().charAt(0);
        if (salvar == 's') {
            salvarArquivo(atletas, saltos, medias, atletaCampeao, maiorMedia, atletaUltimo, menorMedia);
        }
        
        System.out.print("Deseja carregar os dados do arquivo? (s/n): ");
        carregar = scan.next().toLowerCase().charAt(0);
        if (carregar == 's') {
            carregarArquivo();
        }
        
        scan.close();
    }
    
    private static void salvarArquivo(String[] atletas, double[][] saltos, double[] medias, String atletaCampeao, double maiorMedia, String atletaUltimo, double menorMedia) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados_saltos.txt"))) {
            pw.println("Saltos e médias dos atletas:");
            for (int i = 0; i < atletas.length; i++) {
                pw.print(atletas[i] + ": ");
                for (int j = 0; j < saltos[i].length; j++) {
                    pw.printf("%.2f ", saltos[i][j]);
                }
                pw.printf("- Média: %.2f\n", medias[i]);
            }

            pw.printf("\nCampeão: %s - Média: %.2f\n", atletaCampeao, maiorMedia);
            pw.printf("Último lugar: %s - Média: %.2f\n", atletaUltimo, menorMedia);

            System.out.println("\nDados salvos no arquivo 'dados_saltos.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private static void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("dados_saltos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

