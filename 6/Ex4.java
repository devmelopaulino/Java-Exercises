import java.util.Scanner;
//Maior Numero

public class Ex4 {
	public static void main(String[] args) {
		
		System.out.println("Escreva dois números inteiros, para saber o maior deles: ");
		System.out.println(RetornarMaior(ReceberNumeros()));	
	}
	
	private static int[] ReceberNumeros()
	{
		Scanner leitor = new Scanner(System.in);
		int[] numeros = new int[2];
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = leitor.nextInt();
		}
		leitor.close();
		return numeros;
	}
	private static int RetornarMaior(int numeros[])
	{
		int maiorNumero = numeros[0];
		for(int i = 0; i < numeros.length; i++)
		{
			maiorNumero = (numeros[i] > maiorNumero) ? numeros[i] : maiorNumero;
		}
		return maiorNumero;
	}
}