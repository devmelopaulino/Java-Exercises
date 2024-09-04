import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int y = leitor.nextInt();

        while(x != 0 && y != 0)
        {
            if(x > 0 && y >  0)
            {
                System.out.println("primeiro");
            }
            else if(x > 0 && y <  0)
            {
                System.out.println("quarto");
            }
            else if(x < 0 && y >  0)
            {
                System.out.println("segundo");
            }
            else
            {
                System.out.println("terceiro");
            }
            x = leitor.nextInt();
            y = leitor.nextInt();
        }

        leitor.close();
    }
}