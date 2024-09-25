import java.util.Scanner;;

public class Ex1 {


	public static void main(String[] args) {

		System.out.println(ConverterParaReal(ReceberValor()));
	}
	
	private static double ReceberValor()
	{
		Scanner leitor = new Scanner(System.in);
		double valorDolar = leitor.nextDouble();
		return valorDolar;
	}
	private static double ConverterParaReal(double valor)
	{
		return valor * 5.15;
	}
	
}