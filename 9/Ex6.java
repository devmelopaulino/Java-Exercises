import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de pessoas: ");
        int N = scanner.nextInt();

        double[] alturas = new double[N];
        char[] generos = new char[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Informe a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            System.out.print("Informe o gênero (M/F) da pessoa " + (i + 1) + ": ");
            generos[i] = scanner.next().charAt(0);
        }

        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        double somaAlturasMulheres = 0;
        int contadorMulheres = 0;
        int contadorHomens = 0;

        for (int i = 0; i < N; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturasMulheres += alturas[i];
                contadorMulheres++;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                contadorHomens++;
            }
        }

        double mediaAlturaMulheres = (contadorMulheres > 0) ? somaAlturasMulheres / contadorMulheres : 0;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Número de homens: " + contadorHomens);

        scanner.close();
    }
}
