import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {   

        System.out.println(CalcularMedia(InserirNumeros()));
	}
    private static double[] InserirNumeros() 
    {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[2]; 

        numeros[0] = scanner.nextDouble();
        numeros[1] = scanner.nextDouble();
        
        scanner.close();

        return numeros;
    }
    private static double CalcularMedia(double[] numeros)
    {
        double resultado = (numeros[0] + numeros[1]) / 2;
        return resultado;
    }
}