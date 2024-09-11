import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(Calcular(InserirValores()));
    }

    private static double[] InserirValores() {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[2];
        valores[0] = scanner.nextDouble();
        valores[1] = scanner.nextDouble();
        return valores;
    }

    private static String Calcular(double[] valores) {
        return (((valores[1] - valores[0]) / valores[0]) * 100) + "%";
    }
}