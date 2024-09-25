import java.util.Scanner;;

public class Ex4 {


	public static void main(String[] args) {

		System.out.println(Fatorial(ReceberValor()));
	}
	
	private static int ReceberValor()
	{
		Scanner leitor = new Scanner(System.in);
		int valorDolar = leitor.nextInt();
		return valorDolar;
	}
	private static int Fatorial(int numero)
	{
		int x = 1;
		for(int i = 1; i <= numero; i++)
		{
			x *= i; 
		}		
		return x;
	}
	
}