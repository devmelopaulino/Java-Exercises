import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] numerosSeparados = leitor.nextLine().split(" ");
        
        int cd = Integer.parseInt(numerosSeparados[0]);
        int qt = Integer.parseInt(numerosSeparados[1]);

        double preco = 0.0;

        switch (cd) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Código inválido!");
                return;
        }

        double total = preco * qt;

        System.out.printf("Total: R$ %.2f%n", total);

        leitor.close();
    }
}