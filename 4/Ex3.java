import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();

        for(int i = 0; i < x; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }

        leitor.close();
    }
}