import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();

        if(num1 >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }
        leitor.close();
    }
}