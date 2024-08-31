import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] numerosSeparados = leitor.nextLine().split(" ");
        
        int hI = Integer.parseInt(numerosSeparados[0]);
        int hF = Integer.parseInt(numerosSeparados[1]);
        int qtHoras;

        if (hI != hF) {
            if (hF >= hI) {
                qtHoras = hF - hI;
                System.out.println("O JOGO DUROU " + qtHoras + " HORA(S)" );
            } else {
                qtHoras = (24 - hI) + hF;
                System.out.println("O JOGO DUROU " + qtHoras + " HORA(S)" );
            }
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        leitor.close();
    }
}