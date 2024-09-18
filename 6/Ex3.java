import java.util.Scanner;
//Saudações para nome

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("Escreva um nome, para receber uma saudação personalizada: ");
        System.out.println(GerarSaudacao(ReceberNome()));
    }

    private static String ReceberNome() {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        leitor.close();
        return nome;
    }

    private static String GerarSaudacao(String nome) {
        return "Olá " + nome + ", meu querido Magnata! ";
    }
}