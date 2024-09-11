import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {	
		
		System.out.println(Calcular(InserirSegundos()));
    }
	private static int InserirSegundos() 
	{	
		Scanner scanner = new Scanner(System.in);
		int numeros = scanner.nextInt();    
        return numeros;
	}
	private static String Calcular(int segundos)
	{
		int h = segundos / 3600;
		int m = (segundos % 3600) / 60;
		int s = segundos % 60;
		
		return h + ":" + m + ":" + s;
	}

}