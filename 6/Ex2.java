import java.util.Scanner;
//Pariedade Verdaderio ou falso
public class Ex2 {
	public static void main(String[] args) {
		
		System.out.println("Escreva um número saber sua pariedade, verdadeiro para par e falso para impar: ");
		System.out.println(VerificarPariedade(ReceberNumero()));	
	}
	
	private static int ReceberNumero()
	{
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		leitor.close();
		return 	numero;
	}
	private static String VerificarPariedade(int numero)
	{
		return (numero % 2 == 0) ? "Verdadeiro" : "Falso";
	}
}