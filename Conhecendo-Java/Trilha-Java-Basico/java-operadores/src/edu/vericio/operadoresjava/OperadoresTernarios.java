package edu.vericio.operadoresjava;

public class OperadoresTernarios {
    public static void main(String[] args) {
        // Operadores Ternários são representados por '?' e ":"
        // Lembrando que essa é uma expressão Booleana, que define o que é True ou
        // False.
        // Ex:
        int a, b;

        a = 5;
        b = 6;

        String resultado = " ";
        /* Exemplo de condição utilizando uma estrutura IF/ELSE */

        if (a == b)
            resultado = "verdadeiro";

        else
            resultado = "falso";

        System.out.println(resultado);

        // Uma forma mais fácil e simples de chegarmos ao mesmo resultado é:

        String resultado1 = a != b ? "verdadeiro" : "falso";

        System.out.println(resultado1);
    }
}
