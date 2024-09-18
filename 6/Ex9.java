import java.util.Scanner;
import java.util.Arrays;
//Ordenar Array

public class Ex9 {
	
	public static void main(String[] args) {
		
		System.out.println("Escreva uma quantidade de numeros e serie de numeros dessa quantidade para sereme ordenados");
		System.out.println(Arrays.toString(Ordenar(ReceberNumeros())));	
	}
	
	private static int[] ReceberNumeros()
	{
		Scanner leitor = new Scanner(System.in);
		int quantidadeNumeros = leitor.nextInt();
		int[] numeros = new int[quantidadeNumeros];
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = leitor.nextInt();
		}
		leitor.close();
		return numeros;
	}
	 public static int[] Ordenar(int numeros[]) {

		 Arrays.sort(numeros);
	     return numeros;

	    }
}