import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
        int opcao = EscolherOpcao();
        double[] numeros = InserirNumeros(opcao);
        System.out.println("Média: " + CalcularMedia(numeros));
    }

    private static int EscolherOpcao() {
        System.out.println("Escolha média para 3, 4, 5 números: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        return opcao;
    }

    private static double[] InserirNumeros(int opcao) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[opcao]; 

        System.out.println("Insira " + opcao + " números:");
        for (int i = 0; i < opcao; i++) {
            numeros[i] = scanner.nextDouble();
        }

        return numeros;
    }

    private static double CalcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
}