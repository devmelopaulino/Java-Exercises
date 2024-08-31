import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double areaTrianguloRetangulo = (A*C) / 2;
		double areaCirculo = 3.14159 * (C*C);
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;

        System.out.println("TRIANGULO: " + areaTrianguloRetangulo);
        System.out.println("CIRCULO: " + areaCirculo);
        System.out.println("TRAPEZIO: " + areaTrapezio);
        System.out.println("QUADRADO: " + areaQuadrado);
        System.out.println("RETANGULO: " + areaRetangulo);

		leitor.close();
	}
}