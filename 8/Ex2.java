import java.util.Scanner; 
public class Ex2 { 
	public static void main(String[] args) { 
		Scanner LM_leitor = new Scanner(System.in); 

		System.out.println("Valor 1:");	 

		double LM_valor1 = LM_leitor.nextDouble(); 

		System.out.println("Valor 2:");	 

		double LM_valor2 = LM_leitor.nextDouble();	 

		System.out.println(CalcularAcrescimo(LM_valor1, LM_valor2) + "%"); 

} 

private static double CalcularAcrescimo(double LM_valor1, double LM_valor2 ) 
	{ 
		System.out.println("Acrescimo:");	 

		double LM_diferenca = LM_valor2 - LM_valor1;			 

		return (LM_diferenca / LM_valor1) * 100; 
	} 

}