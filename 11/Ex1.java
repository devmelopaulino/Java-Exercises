import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Divisão");
        try {
            System.out.println(Dividir(ReceberNumeros()));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }    
    }

    private static double[] ReceberNumeros() {
        int qt = 2;
        Scanner leitor = new Scanner(System.in);
        double[] numeros = new double[qt];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextDouble();
        }        
        return numeros;
    }

    private static double Dividir(double numeros[]) {
        if (numeros[1] == 0) {
            throw new ArithmeticException("Não é possível dividir por 0");
        }
        return numeros[0] / numeros[1];
    }
}
