package Lista7Java;
import java.util.Scanner;
import java.io.*;
public class Ex55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int INI = 0;
        final int MAX = 2;
        int numAlunos = 0;
        double somaMedias = 0;
        double mediaGeral = 0;
        char salvar = ' ';
        char carregar = ' ';
        
        System.out.print("Digite o número de alunos: ");
        numAlunos = scan.nextInt();
        scan.nextLine();
        
        String[] nomes = new String[numAlunos];
        double[][] notas = new double[numAlunos][MAX];
        double[] medias = new double[numAlunos];
        
        for (int i = INI; i < numAlunos; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scan.nextLine();

            System.out.print("Digite a nota da Prova 1 para " + nomes[i] + ": ");
            notas[i][0] = scan.nextDouble();

            System.out.print("Digite a nota da Prova 2 para " + nomes[i] + ": ");
            notas[i][1] = scan.nextDouble();
            scan.nextLine();

            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }
        
        System.out.println("\nNome e Notas de cada aluno:");
        for (int i = INI; i < numAlunos; i++) {
            System.out.printf("%s - Nota 1: %.2f, Nota 2: %.2f, Média: %.2f\n", nomes[i], notas[i][0], notas[i][1], medias[i]);
        }
        
        double maiorNota = notas[0][0];
        double menorNota = notas[0][0];
        String alunoMaiorNota = nomes[0];
        String alunoMenorNota = nomes[0];
        
        for (int i = INI; i < numAlunos; i++) {
            for (int j = INI; j < MAX; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
        }
        
        System.out.printf("\nMaior Nota: %.2f (Aluno: %s)\n", maiorNota, alunoMaiorNota);
        System.out.printf("Menor Nota: %.2f (Aluno: %s)\n", menorNota, alunoMenorNota);

        double maiorMedia = medias[0];
        double menorMedia = medias[0];
        String alunoMaiorMedia = nomes[0];
        String alunoMenorMedia = nomes[0];
        
        for (int i = 1; i < numAlunos; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }
        
        System.out.printf("\nMaior Média: %.2f (Aluno: %s)\n", maiorMedia, alunoMaiorMedia);
        System.out.printf("Menor Média: %.2f (Aluno: %s)\n", menorMedia, alunoMenorMedia);
        
        for (double media : medias) {
            somaMedias += media;
        }
        
        mediaGeral = somaMedias / numAlunos;
        System.out.printf("\nMédia Geral da Turma: %.2f\n", mediaGeral);
        
        System.out.println("\nAlunos acima da média geral:");
        for (int i = INI; i < numAlunos; i++) {
            if (medias[i] > mediaGeral) {
                System.out.printf("%s (Média: %.2f)\n", nomes[i], medias[i]);
            }
        }
        
        System.out.println("\nAlunos abaixo da média geral:");
        for (int i = INI; i < numAlunos; i++) {
            if (medias[i] < mediaGeral) {
                System.out.printf("%s (Média: %.2f)\n", nomes[i], medias[i]);
            }
        }
        
        System.out.print("\nDeseja salvar os dados em um arquivo? (s/n): ");
        salvar = scan.next().toLowerCase().charAt(0);
        if (salvar == 's') {
            salvarArquivo(nomes, notas, medias, alunoMaiorNota, maiorNota, alunoMenorNota, menorNota, alunoMaiorMedia, maiorMedia, alunoMenorMedia, menorMedia, mediaGeral);
        }
        
        System.out.print("Deseja carregar os dados do arquivo? (s/n): ");
        carregar = scan.next().toLowerCase().charAt(0);
        if (carregar == 's') {
            carregarArquivo();
        }
        
        scan.close();
    }
    
    private static void salvarArquivo(String[] nomes, double[][] notas, double[] medias, String alunoMaiorNota, double maiorNota, String alunoMenorNota, double menorNota, String alunoMaiorMedia, double maiorMedia, String alunoMenorMedia, double menorMedia, double mediaGeral) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados_alunos.txt"))) {
            pw.println("Nome e Notas de cada aluno:");
            for (int i = 0; i < nomes.length; i++) {
                pw.printf("%s - Nota 1: %.2f, Nota 2: %.2f, Média: %.2f\n", nomes[i], notas[i][0], notas[i][1], medias[i]);
            }

            pw.printf("\nMaior Nota: %.2f (Aluno: %s)\n", maiorNota, alunoMaiorNota);
            pw.printf("Menor Nota: %.2f (Aluno: %s)\n", menorNota, alunoMenorNota);
            pw.printf("\nMaior Média: %.2f (Aluno: %s)\n", maiorMedia, alunoMaiorMedia);
            pw.printf("Menor Média: %.2f (Aluno: %s)\n", menorMedia, alunoMenorMedia);
            pw.printf("\nMédia Geral da Turma: %.2f\n", mediaGeral);

            pw.println("\nAlunos acima da média geral:");
            for (int i = 0; i < nomes.length; i++) {
                if (medias[i] > mediaGeral) {
                    pw.printf("%s (Média: %.2f)\n", nomes[i], medias[i]);
                }
            }

            pw.println("\nAlunos abaixo da média geral:");
            for (int i = 0; i < nomes.length; i++) {
                if (medias[i] < mediaGeral) {
                    pw.printf("%s (Média: %.2f)\n", nomes[i], medias[i]);
                }
            }

            System.out.println("\nDados salvos no arquivo 'dados_alunos.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private static void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("dados_alunos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

