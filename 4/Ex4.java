import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int QuantidadeN = leitor.nextInt();
        int dentro = 0;
        int fora = 0;
        int novoNumero = 0;

        for(int i = 0; i < QuantidadeN; i++)
        {
            novoNumero = leitor.nextInt();
            if(novoNumero >= 10 && novoNumero <= 20)
            {
                dentro++;
            }
            else
            {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        leitor.close();
    }
}