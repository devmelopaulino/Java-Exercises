import java.util.Scanner; 
	public class Ex3 { 
		public static void main(String[] args) { 
			System.out.println("1 potencia"); 
			System.out.println("2 raiz"); 
			System.out.println("3 modulo"); 			
			Scanner LM_leitor = new Scanner(System.in); 
			int LM_escolha = LM_leitor.nextInt(); 			
			if(LM_escolha == 1) 
			{ 
				System.out.println(Potencia()); 
			} 

			else if(LM_escolha == 2) 
			{ 
				System.out.println(Raiz()); 
			} 

			else if(LM_escolha == 3) 
			{ 

				System.out.println(Modulo()); 
			} 
	} 


	private static double Potencia() 
	{	 
		Scanner LM_leitor = new Scanner(System.in); 

		System.out.println("Numero para utilizar potencia:"); 

		double LM_valor1 = LM_leitor.nextDouble(); 

		System.out.println("Numero para ser o expoente:"); 

		double LM_valor2 = LM_leitor.nextDouble();		 

		return Math.pow(LM_valor1, LM_valor2); 
	} 

	private static double Raiz() 
	{	 
		Scanner LM_leitor = new Scanner(System.in); 

		System.out.println("Numero para fazer raiz quadrada:");	 

		double LM_valor1 = LM_leitor.nextDouble(); 

		return Math.sqrt(LM_valor1); 
	} 

	private static double Modulo() 
	{	 
		Scanner LM_leitor = new Scanner(System.in); 

		System.out.println("Numero 1:"); 

		double LM_valor1 = LM_leitor.nextDouble(); 

		System.out.println("Numero 2:"); 

		double LM_valor2 = LM_leitor.nextDouble();		 

		return LM_valor1 % LM_valor2; 
	} 
} 