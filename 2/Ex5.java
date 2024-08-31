import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	    int cod = leitor.nextInt();
		int qt = leitor.nextInt();
		double valor = leitor.nextDouble();
		
		int cod2 = leitor.nextInt();
		int qt2 = leitor.nextInt();
		double valor2 = leitor.nextDouble();
		
		double resultado1 = qt * valor;
		double resultado2 = qt2 * valor2;
		
		double resultadoFinal = resultado1 + resultado2;
		
		System.out.println("VALOR A PAGAR: R$  " + resultadoFinal);
		
		leitor.close();
	}
}