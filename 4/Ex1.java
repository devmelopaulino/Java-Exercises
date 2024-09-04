import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senha = 2002;
        int entradaSenha = leitor.nextInt();
        while(entradaSenha != senha)
        {
            System.out.println("Senha Invalida");
            entradaSenha = leitor.nextInt();
        }
        if(entradaSenha == senha)
        {
            System.out.println("Acessi Permitido");
        }
        leitor.close();
    }
}