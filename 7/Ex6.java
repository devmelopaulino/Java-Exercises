public class Ex7 {


	public static void main(String[] args) {

		System.out.println(Calcular());
	}
	
	private static int Calcular()
	{
		int valor = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				valor += i;
			}
		}
		return valor;
	}
	
}
