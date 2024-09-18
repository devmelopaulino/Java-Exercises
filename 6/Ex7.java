import java.util.Scanner;
import java.util.Arrays;
//Mediano

public class Ex7 {
	public static void main(String[] args) {
		
		System.out.println("Escreva três numeros, e receba o mediano: ");
		System.out.println(CalcularMediano(ReceberNumeros()));	
	}
	
	private static int[] ReceberNumeros()
	{
		Scanner leitor = new Scanner(System.in);
		int[] numeros = new int[3];
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = leitor.nextInt();
		}
		leitor.close();
		return numeros;
	}
	private static int CalcularMediano(int[] numeros)
	{		
		Arrays.sort(numeros);
        return numeros[ (numeros.length) / 2 ];
	}
}