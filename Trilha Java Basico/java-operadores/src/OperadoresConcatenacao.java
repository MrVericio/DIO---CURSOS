public class OperadoresConcatenacao {
    public static void main(String[] args) {
        // Exemplo de como o operador '+' é utilizado para concatenar uma String(texto).
        // Ex:

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        // O que será impresso nas expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);
    }
}
