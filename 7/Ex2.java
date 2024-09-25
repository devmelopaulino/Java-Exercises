import java.util.Scanner;;

public class Ex2 {


	public static void main(String[] args) {

		System.out.println(CalculoSalarial(ReceberValor()));
	}
	
	private static double ReceberValor()
	{
		Scanner leitor = new Scanner(System.in);
		double valor = leitor.nextDouble();
		return valor;
	}
	private static String CalculoSalarial(double valor)
	{
		if(valor <= 675 )
		{
			return "Até 1 salário";
		}
		else if(valor > 675 && valor <= 1935 )
		{
			return "Até 3 salários";
		}	
		else if(valor > 1935 && valor <= 3225 )
		{
			return "Até 5 salários";
		}	
		else if(valor > 3225 )
		{
			return "Acima de 5 salários";
		}
		else
		{
			return "";
		}
	}
	
}