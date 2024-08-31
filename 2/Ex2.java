import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2 {

	public static void main(String[] args) {	
	    
		Scanner leitor = new Scanner(System.in);		
		
		double raio = leitor.nextDouble();
		
		double resultado = (raio * raio) * 3.14159 ;
		
	    DecimalFormat numeroDecimal = new DecimalFormat("#.####");
	    
	    String numeroFormatado = numeroDecimal.format(resultado);
        
        System.out.println(numeroFormatado);
	}
}