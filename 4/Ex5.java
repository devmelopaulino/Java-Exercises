import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int r = 1;

        for(int i = 1; i <= x; i++)
        {
            r = r * i;
        }

        System.out.println(r);

        leitor.close();
    }
}