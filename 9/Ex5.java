import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você vai cadastrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota do 1º semestre: ");
            notas1[i] = scanner.nextDouble();
            System.out.print("Digite a nota do 2º semestre: ");
            notas2[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
    }
}
