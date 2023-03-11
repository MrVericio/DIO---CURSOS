public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
         * Operadores relacionais: ' ==, !=, >, =>, <, <=' avaliam a realção entre
         * variáveis ou expressões
         */
        // Ex:
        int numero1 = 1;
        int numero2 = 2;

        /*
         * if (numero1 > numero2)
         * System.out.println("Número 1 é maior que o número 2");
         * 
         * if (numero1 < numero2)
         * System.out.println("Número 1 é menor que número 2");
         */

        /* Outra forma de fazer o mesmo de uma forma mais simples e fácil: */

        String nomeUm = "Marcos";
        String nomeDois = "Marcos"; /* Mas e se adicionarmos um new String, o resultado vai ser verdadeiro? */
        String nomeTres = new String("Marcos"); /*
                                                 * o resultado não será verdadeiro. A menos que usemos
                                                 * o método .equals
                                                 */

        String nome = nomeUm == nomeTres ? "Sim" : "Não"; /* modo fácil de usar um IF/ELSE */
        System.out.println(nome);
        System.out.println(nome.equals(nome)); /*
                                                * Aqui ele imprimiu veradeir já pode comparar as entradas de forma
                                                * correta
                                                */

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira ");
        }

        System.out.println("Número 1 é igual a número 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número 1 é diferente de número 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Número 1 é maior que número 2? " + simNao);

    }
}
