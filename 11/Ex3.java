import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);     
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Digite um índice para acessar o array (0 a 4):");       
        try {
            int indice = Integer.parseInt(leitor.nextLine());
            System.out.println("O número no índice " + indice + " é: " + numeros[indice]);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array. " + e.getMessage());
        }
    }
}