package edu.vericio.operadoresjava;

public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operadores unários (+, -, ++, --, !) atuam juntos a outros operadores
        // aritméticos.
        // Ex:
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero = ++numero;

        System.out.println(numero);

        numero = --numero;

        System.out.println(numero);

        // Exemplo de repetição

        int numero1 = 10;
        // repetição
        numero1 = numero1 + 1;
        // numero ++ tem o mesmo efeito de numero + 1
        numero1++;

        System.out.println(numero1);
        // Outro exemplo seria utilizar o '++' imprimindo direto no Sysout.
        System.out.println(++numero1); // Para que o resultado seja impresso de uma vez.
        System.out.println(numero1++); // Desse modo será necessária outra impressão porque a somar será feita após
        // a chamada da variável
        // O mesmo serve para o decremento '--' .

        // Exemplo de verdadeiro ou falso: '!' Ele tem o efeito de transformar Falso em
        // Verdadeiro e vice versa.

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

    }
}
