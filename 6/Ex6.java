import java.util.Scanner;
//Elevado

public class Ex6 {
	public static void main(String[] args) {
		
		System.out.println("Escreva um double, e outro para o elevar o primeiro: ");
		System.out.println(CalcularFatorial(ReceberNumeros()));	
	}
	
	private static double[] ReceberNumeros()
	{
		Scanner leitor = new Scanner(System.in);
		double[] numeros = new double[2];
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = leitor.nextInt();
		}
		leitor.close();
		return numeros;
	}
	private static int CalcularFatorial(double[] numeros)
	{

        return (int)Math.pow(numeros[0], numeros[1]);
	}
}