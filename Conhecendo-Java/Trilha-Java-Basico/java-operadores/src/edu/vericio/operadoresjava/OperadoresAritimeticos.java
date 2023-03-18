package edu.vericio.operadoresjava;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        // Operadores Aritiméticos: '+, -, /, *, %' - Lembrando que o simbolo '%' não é
        // porcentagem, é denominado
        // módulo.
        // Atenção que quando utilizamos o operador '+' em variáveis do tipo
        // String(texto) ele realizará a
        // concatenação de textos.
        // Ex:
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Resultado: " + resultado);

    }
}
