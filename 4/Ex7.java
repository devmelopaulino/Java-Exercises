import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeN = scanner.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < quantidadeN; i++) {
            System.out.print(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}