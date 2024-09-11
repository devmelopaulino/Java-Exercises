import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {	
		System.out.println(Calcular(Escolher(), InserirNumeros()));				
    }
	
	private static String Escolher()
	{
		Scanner scanner = new Scanner(System.in);
		String op = scanner.nextLine();
		return op;
	}
	private static double[] InserirNumeros() 
	{	
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[2]; 
        numeros[0] = scanner.nextDouble();
        numeros[1] = scanner.nextDouble();    
        return numeros;
	}
	private static double Calcular(String op, double[] numeros)
	{
		Scanner scanner = new Scanner(System.in);
		double resultado = 0;

		if(op.equals("Adição")) {
		    resultado = numeros[0] + numeros[1];
		} 
		else if(op.equals("Subtração")) {
		    resultado = numeros[0] - numeros[1];
		} 
		else if(op.equals("Multiplicação")) {
		    resultado = numeros[0] * numeros[1];
		} 
		else if(op.equals("Divisão")) {
		    resultado = numeros[0] / numeros[1];
		}
		return resultado;		
	}
}