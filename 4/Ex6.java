import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();

        int soma = 0;
        
        while (numero > 0) {
            int digito = numero % 10;
            
            soma += digito;
            
            numero /= 10;
        }

        System.out.println(soma);

        scanner.close();
    }
}