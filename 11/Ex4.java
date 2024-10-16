public class Ex5 {
    public static void main(String[] args) {
        Objeto objeto = null;
        try {
            objeto.imprimirMensagem();
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um método de um objeto nulo.");
        }
    }
}

class Objeto {
    public void imprimirMensagem() {
        System.out.println("Mensagem do objeto.");
    }
}