import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        double[] numeros = GuardarNumeros(SelecionarQuantidade());
        System.out.println("");
        double maior = MostrarMaior(numeros);
        MostrarPosicaoMaior(numeros, maior);
    }

    private static int SelecionarQuantidade() {
        System.out.print("Quantos numeros voce vai digitar? ");
        Scanner leitor = new Scanner(System.in);
        int quantidade = leitor.nextInt();
        return quantidade;
    }

    private static double[] GuardarNumeros(int quantidade) {
        Scanner leitor = new Scanner(System.in);
        double[] numeros = new double[quantidade];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = leitor.nextDouble();
        }
        return numeros;
    }

    private static double MostrarMaior(double[] valores) {
        double maior = 0; 

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        return maior;
    }

    private static void MostrarPosicaoMaior(double[] valores, double maior) {
        System.out.print("POSICAO DO MAIOR VALOR = ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == maior) { 
                System.out.println(i);
            }
        }
    }
}

