import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {	
		Scanner leitor = new Scanner(System.in);			
		int num1 = leitor.nextInt();
		int num2 = leitor.nextInt();
		int resultado = num1 + num2;	
		System.out.println("Soma = " + resultado);	
		leitor.close();
	}
}