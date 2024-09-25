import java.util.Scanner;;

public class Ex5 {


	public static void main(String[] args) {

		System.out.println(RetornarSinal(ReceberValor()));
	}
	
	private static double ReceberValor()
	{
		Scanner leitor = new Scanner(System.in);
		double valorDolar = leitor.nextDouble();
		return valorDolar;
	}
	private static String RetornarSinal(double valor)
	{
		return (valor >= 0) ? "Positivo" : "Negativo";
	}
	
}