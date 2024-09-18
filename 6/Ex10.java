import java.util.Scanner;
import java.util.Arrays;
public class Ex10 {
	
	public static void main(String[] args) {
		
		System.out.println("Escreva um numero e descubra seus divisores");
		MostrarDivisores(ReceberNumero());	
	}
	
	private static int ReceberNumero()
	{
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		leitor.close();
		return numero;
	}
	 public static void MostrarDivisores(int numero) {

		 
		 for(int i = 1; i <= numero; i++){
			 
			 if(numero % i == 0)
			 {
				 if(i != numero)
				 {
					 System.out.print(i + ", ");
				 }
				 else
				 {
					 System.out.print("e " + i);
				 }
				 }
			 		 
		 }		 
	    }
}
