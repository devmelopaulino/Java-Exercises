import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
				
		double[] numeros = GuardarNumeros(SelecionarQuantidade());
		System.out.println("");		
		MostrarValores(numeros);
		System.out.println("");	
		Somar(numeros);
		System.out.println("");	
		FazerMedia(numeros);
	}
	private static int SelecionarQuantidade()
	{
		System.out.print("Quanto numeros voce vai digitar? ");
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		return quantidade;
	}
	private static double[] GuardarNumeros(int quantidade)
	{
		Scanner leitor = new Scanner(System.in);
		double[] numeros = new double[quantidade];
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Digite um numero: ");
			numeros[i] = leitor.nextInt();
		}
		return numeros;
	}	
	
	private static double Somar(double[] valores)
	{
		double soma = 0;
		for(int i = 0; i < valores.length; i++)
		{
			soma += valores[i];
		}
		System.out.print("SOMA = " + soma);
		return soma;
	}
	
	private static double FazerMedia(double[] valores)
	{
		double soma = 0;
		for(int i = 0; i < valores.length; i++)
		{
			soma += valores[i];
		}
		System.out.print("MEDIA = " + (soma / valores.length));
		return soma / valores.length;
	}
		
	private static void MostrarValores(double[] valores)
	{
		System.out.print("Valores = ");
		for(int i = 0; i < valores.length; i++)
		{			
			System.out.print(" " + valores[i]);
		}
	}
}
