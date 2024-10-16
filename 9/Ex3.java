import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
			
		int[] numeros = GuardarNumeros(SelecionarQuantidade());
		System.out.println("");	
		MostrarValoresPares(numeros);
		System.out.println("");	
		MostrarQuantiadePares(numeros);	
	}
	private static int SelecionarQuantidade()
	{
		System.out.print("Quanto numeros voce vai digitar? ");
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		return quantidade;
	}
	private static int[] GuardarNumeros(int quantidade)
	{
		Scanner leitor = new Scanner(System.in);
		int[] numeros = new int[quantidade];
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Digite um numero: ");
			numeros[i] = leitor.nextInt();
		}
		return numeros;
	}	
	
	private static int MostrarValoresPares(int[] valores)
	{
		int quantidade = 0;
				
		for(int i = 0; i < valores.length; i++)
		{	
			if(valores[i] % 2 == 0)
			{
				quantidade += 1;
			}
		}
		System.out.print("QUANTIDADE DE PARES = " + quantidade);
		return quantidade;
		
	}
		
	private static void MostrarQuantiadePares(int[] valores)
	{
		System.out.print("NUMEROS PARES = ");
		for(int i = 0; i < valores.length; i++)
		{	
			if(valores[i] % 2 == 0)
			{
				System.out.print(" " + valores[i]);
			}
		}
	}
}
