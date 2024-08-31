import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();

        if(num1 % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        leitor.close();
    }
}
