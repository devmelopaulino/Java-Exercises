import java.util.Scanner;;

public class Ex3 {


	public static void main(String[] args) {

		System.out.println(CalculoSalarial(ReceberValores()));
	}
	
	private static double[] ReceberValores()
	{
		Scanner leitor = new Scanner(System.in);
		double[] valores = new double[4];
		
		System.out.println("Numero de carros vendidos");
		valores[0] = leitor.nextDouble();
		
		System.out.println("Valor total de suas vendas");
		valores[1] = leitor.nextDouble();
		
		System.out.println("Salário fixo");
		valores[2] = leitor.nextDouble();
		
		System.out.println("Valor que ele recebe por carro vendido");
		valores[3] = leitor.nextDouble();
				
		return valores;
	}
	private static double CalculoSalarial(double valores[])
	{
						
		return valores[2] + (valores[0] * valores[3]) + (valores[1] * 0.05);
	}
	
}