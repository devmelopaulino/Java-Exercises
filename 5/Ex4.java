import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {	
		System.out.println(Retornar(InserirNumero()));			
    }
	
	private static double InserirNumero() 
	{	
		Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();  
        return numero;
	}
	
	private static int Retornar(double numero)
	{
		if(numero > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}