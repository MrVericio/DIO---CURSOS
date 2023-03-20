package edu.vericio.operadoresrelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Exemplos - Utilizando IF para imprimir a mensagem que desejamos para
        // comparação
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        // int
        if (i1 == i2) {
            System.out.println("i1 é igual a i2");
        } else {
            System.out.println("i1 não é igual a i2");
        }
        if (i1 != i2) {
            System.out.println("i1 é diferente de i2");
        } else {
            System.out.println("i1 não é diferente de i2");
        }
        if (i1 > i2) {
            System.out.println("i1 é maior que i2");
        } else {
            System.out.println("i1 não é maior que i2");
        }
        if (i1 <= i2) {
            System.out.println("i1 é menor ou igual a i2");
        } else {
            System.out.println("i1 não é menor ou igual a i2");
        }

        // float
        if (f1 == f2) {
            System.out.println("f1 é igual a f2");
        } else {
            System.out.println("f1 não é igual a f2");
        }
        if (f1 != f2) {
            System.out.println("f1 é diferente de f2");
        } else {
            System.out.println("f1 não é diferente de f2");
        }
        if (f1 >= f2) {
            System.out.println("f1 é maior que f2");
        } else {
            System.out.println("f1 não é maior que f2");
        }
        if (f1 < f2) {
            System.out.println("f1 é menor ou igual a f2");
        } else {
            System.out.println("f1 não é menor ou igual a f2");
        }

        // char
        if (c1 == c2) {
            System.out.println("c1 é igual a c2");
        } else {
            System.out.println("c1 não é igual a c2");
        }
        if (c1 != c2) {
            System.out.println("c1 é diferente de c2");
        } else {
            System.out.println("c1 não é diferente de c2");
        }
        if (c1 > c2) {
            System.out.println("c1 é maior que c2");
        } else {
            System.out.println("c1 não é maior que c2");
        }
        if (c1 <= c2) {
            System.out.println("c1 é menor ou igual a c2");
        } else {
            System.out.println("c1 não é menor ou igual a c2");
        }

        // string
        if (s1 == s2) {
            System.out.println("s1 é igual a s2");
        } else {
            System.out.println("s1 não é igual a s2");
        }
        if (s1 != s2) {
            System.out.println("s1 é diferente de s2");
        } else {
            System.out.println("s1 não é diferente de s2");
        }
        /*
         * if (s1 >= s2) {
         * System.out.println("s1 é maior que s2");
         * } else {
         * System.out.println("s1 não é maior que s2");
         * }
         * if (s1 < s2) {
         * System.out.println("s1 é menor ou igual a s2");
         * } else {
         * System.out.println("s1 não é menor ou igual a s2");
         * }
         */
        // AQUI TEMOS UM ERRO NO CÓDIGO PORQUE O STRING NÃO SUPORTA OS OPERADORES DE <
        // OU >

        // boolean
        if (b1 == b2) {
            System.out.println("b1 é igual a b2");
        } else {
            System.out.println("b1 não é igual a b2");
        }
        if (b1 != b2) {
            System.out.println("b1 é diferente de b2");
        } else {
            System.out.println("b1 não é diferente de b2");
        }
        /*
         * if (b1 >= b2) {
         * System.out.println("b1 é maior que b2");
         * } else {
         * System.out.println("b1 não é maior que b2");
         * }
         * if (b1 < b2) {
         * System.out.println("b1 é menor ou igual a b2");
         * } else {
         * System.out.println("b1 não é menor ou igual a b2");
         * }
         */
        // AQUI TEMOS UM ERRO NO CÓDIGO PORQUE O BOOLEAN NÃO SUPORTA OS OPERADORES DE <
        // OU >

    }
}
