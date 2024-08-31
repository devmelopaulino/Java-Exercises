import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String numerosJuntos = leitor.nextLine();

        String[] numerosSeparados = numerosJuntos.split(" ");

        int numero1 = Integer.parseInt(numerosSeparados[0]);
        int numero2 = Integer.parseInt(numerosSeparados[1]);

        if (numero1 >= numero2) {
            if (numero1 % numero2 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (numero2 % numero1 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        leitor.close();
    }
}
