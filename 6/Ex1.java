import java.util.Scanner;
//Numero Dobrados
public class Ex1 {
	public static void main(String[] args) {
		
		System.out.println("Escreva um número para ser dobrado: ");
		System.out.println(DobrarNumero(ReceberNumero()));	
	}
	
	private static int ReceberNumero()
	{
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		leitor.close();
		return 	numero;
	}
	private static int DobrarNumero(int numero)
	{
		return numero = numero * 2;
	}
}
