import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		  RetornarNegativos(GuardarNumeros(SelecionarQuantidade()));
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
	private static void RetornarNegativos(int[] numeros)
	{
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < numeros.length; i++)
		{
			if(numeros[i] < 0)
			{
				System.out.println(numeros[i]);
			}
		}
	}
}
