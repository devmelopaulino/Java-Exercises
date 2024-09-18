import java.util.Scanner;
import java.util.Arrays;
//Fibonacci

public class Ex8 {
	
	public static void main(String[] args) {
		
		System.out.println("Escreva um número para descobrir sua posição fibonacci");
		System.out.println(CalcularFibonacci(ReceberNumero()));	
	}
	
	private static int ReceberNumero()
	{
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		leitor.close();
		return 	numero;
	}
	 public static int CalcularFibonacci(int numero) {
	        if (numero <= 1) {
	            return numero; 
	        } else {
	            return CalcularFibonacci(numero - 1) + CalcularFibonacci(numero - 2); 
	        }
	    }
}
