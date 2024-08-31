import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args) {
        
		Scanner leitor = new Scanner(System.in);
	    int num = leitor.nextInt();
		double horas = leitor.nextDouble();
		double valor = leitor.nextDouble();
		
		double resultado = horas * valor;
		
		System.out.println("NUMBER = " + num);
		System.out.println("SALARY = " + "U$ " + resultado);
		
		leitor.close();
	}
}