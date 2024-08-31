public class Ex4 {

	public static void main(String[] args) {		

		byte b = 10;
        short s = 200;
        int i = 3000;
        long l = 40000L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        // Byte
        System.out.println("Aqui o valor de b é " + b);
        System.out.println("b + 5 = " + (b + 5));
        System.out.println("---------------");

        // Short
        System.out.println("Aqui o valor de s é " + s);
        System.out.println("s * 2 = " + (s * 2));
        System.out.println("---------------");

        // Int
        System.out.println("Aqui o valor de i é " + i);
        System.out.println("i / 10 = " + (i / 10));
        System.out.println("---------------");

        // Long
        System.out.println("Aqui o valor de l é " + l);
        System.out.println("l - 1000 = " + (l - 1000));
        System.out.println("---------------");

        // Float
        System.out.println("Aqui o valor de f é " + f);
        System.out.println("f * 2 = " + (f * 2));
        System.out.println("---------------");

        // Double
        System.out.println("Aqui o valor de d é " + d);
        System.out.println("d / 2 = " + (d / 2));
        System.out.println("---------------");

        // Char
        System.out.println("Aqui o valor de c é " + c);
        System.out.println("c + 1 = " + (char)(c + 1)); // Incrementa o código Unicode do caractere
        System.out.println("---------------");

        // Boolean
        System.out.println("Aqui o valor de bool é " + bool);
        System.out.println("!bool = " + !bool); // Negação lógica

	}

}