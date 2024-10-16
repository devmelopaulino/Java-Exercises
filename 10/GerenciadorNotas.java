import java.util.Scanner;
import java.util.Arrays;

public class GerenciadorNotas {
    static final int NUM_ALUNOS = 10;
    static final int NUM_DISCIPLINAS = 3;
    static double[][] notas = new double[NUM_ALUNOS][NUM_DISCIPLINAS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        inserirNotas(scanner);
        exibirEstatisticas();

        System.out.println("Digite o número do aluno (1 a 10) cujas notas você deseja ordenar:");
        int aluno = scanner.nextInt() - 1;
        ordenarNotas(notas[aluno]);
        System.out.println("Notas ordenadas do aluno " + (aluno + 1) + ": " + Arrays.toString(notas[aluno]));

        System.out.println("Digite uma nota para buscar no aluno " + (aluno + 1) + ":");
        double valorBusca = scanner.nextDouble();
        int posicao = buscarNota(notas[aluno], valorBusca);
        if (posicao != -1) {
            System.out.println("Nota " + valorBusca + " encontrada na posição " + (posicao + 1));
        } else {
            System.out.println("Nota " + valorBusca + " não encontrada.");
        }

        calcularMediaAluno();
        calcularMediaTurma();
    }

    public static void inserirNotas(Scanner scanner) {
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("Insira as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < NUM_DISCIPLINAS; j++) {
                System.out.print("Nota da disciplina " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void calcularMediaAluno() {
        for (int i = 0; i < NUM_ALUNOS; i++) {
            double soma = 0;
            for (int j = 0; j < NUM_DISCIPLINAS; j++) {
                soma += notas[i][j];
            }
            double media = soma / NUM_DISCIPLINAS;
            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }
    }

    public static void calcularMediaTurma() {
        double somaTurma = 0;
        for (int i = 0; i < NUM_ALUNOS; i++) {
            for (int j = 0; j < NUM_DISCIPLINAS; j++) {
                somaTurma += notas[i][j];
            }
        }
        double mediaTurma = somaTurma / (NUM_ALUNOS * NUM_DISCIPLINAS);
        System.out.println("Média geral da turma: " + mediaTurma);
    }

    public static void ordenarNotas(double[] notasAluno) {
        for (int i = 0; i < notasAluno.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < notasAluno.length; j++) {
                if (notasAluno[j] < notasAluno[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = notasAluno[minIndex];
            notasAluno[minIndex] = notasAluno[i];
            notasAluno[i] = temp;
        }
    }

    public static int buscarNota(double[] notasAluno, double valor) {
        int inicio = 0;
        int fim = notasAluno.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (notasAluno[meio] == valor) {
                return meio;
            } else if (notasAluno[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void exibirEstatisticas() {
        for (int j = 0; j < NUM_DISCIPLINAS; j++) {
            double maiorNota = Double.MIN_VALUE;
            double menorNota = Double.MAX_VALUE;
            double soma = 0;
            for (int i = 0; i < NUM_ALUNOS; i++) {
                soma += notas[i][j];
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                }
            }
            System.out.println("Disciplina " + (j + 1) + ": Maior nota = " + maiorNota + ", Menor nota = " + menorNota);
        }
    }
}
