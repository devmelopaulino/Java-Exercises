import java.util.Scanner;
//Fatorial
public class Ex5 {
	public static void main(String[] args) {
		
		System.out.println("Escreva um numero inteiro para saber seu fatorial: ");
		System.out.println(CalcularFatorial(ReceberNumero()));	
	}
	
	private static int ReceberNumero()
	{
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		leitor.close();
		return 	numero;
	}
	private static int CalcularFatorial(int numero)
	{
		int fatorial = 1;

        for(int i = 1; i <= numero; i++)
        {
        	fatorial = fatorial * i;
        }

        return fatorial;
	}
}