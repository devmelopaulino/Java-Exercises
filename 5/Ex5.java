import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {	
		
		System.out.println(Calcular(InserirNumeros()));
    }
	private static int[] InserirNumeros() 
	{	
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[2]; 
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();    
        return numeros;
	}
	private static int Calcular(int[] numeros)
	{
		int resultado = 0;
		
		for(int i = numeros[0] + 1; i < numeros[1]; i++)
		{
			resultado += i;
		}
		return resultado;
	}

}