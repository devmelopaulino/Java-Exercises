import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[3];
        notas[0] = scanner.nextDouble();
        notas[1] = scanner.nextDouble();
        notas[2] = scanner.nextDouble();
        
        scanner.nextLine();
        
        String letra = scanner.nextLine();
        System.out.println(ReceberValores(letra, notas));
        scanner.close();
    }

    private static double ReceberValores(String letra, double[] notas) {
        if(letra.equals("A")) {
            return CalcularMediaAritimerica(notas);
        }
        if(letra.equals("P")) {
            return CalcularMediaPonderada(notas);
        } else {
            return 0;
        }	
    }

    private static double CalcularMediaAritimerica(double[] numeros) {
        return (numeros[0] + numeros[1] + numeros[2]) / 3;
    }

    private static double CalcularMediaPonderada(double[] numeros) {
        return ( (numeros[0] * 5) + (numeros[1] * 3) + (numeros[2] * 2) ) / (5 + 3 + 2);
    }
}
