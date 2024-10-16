import java.util.Scanner; 

public class Ex1 { 

	public static void main(String[] args) { 

		System.out.println("Escreva o Salario:"); 

		Scanner LM_Leitor = new Scanner(System.in); 

		double LM_Valor = LM_Leitor.nextDouble();	 

		LM_Leitor.close(); 

		System.out.println("Reajuste:"); 

		System.out.println(LM_Valor + (LM_Valor * 0.115)); 

	} 

} 