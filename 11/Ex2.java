import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        try {
            String entrada = leitor.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println("Você digitou o número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A entrada não é um número válido. " + e.getMessage());
        }

    }
}