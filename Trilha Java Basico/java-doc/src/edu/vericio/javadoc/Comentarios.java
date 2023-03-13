package edu.vericio.javadoc;

public class Comentarios {
    // public static void main(String[] args) {
    // Olá, eu sou um comentário em uma única linha

    /* Olá, eu sou um comentário que posso ser mais detalhado quando necessário */

    // }

    /**
     * Estas duas estrelinhas acima serve para identificar que vamos elaborar um
     * comentário a nível de documentação e não dentro do método.
     */

    // public void metodo(){}

    /**
     * Esse método não está completamente inteligivel, devemos nos atentar aos nomes
     * das nossas variáveis para que qualquer um possa entender
     */

    public int somaMultiplica(int n, int x, String m) {

        int r = 0; // r é igual ao resultado
        if (m == "M") { // M = multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}