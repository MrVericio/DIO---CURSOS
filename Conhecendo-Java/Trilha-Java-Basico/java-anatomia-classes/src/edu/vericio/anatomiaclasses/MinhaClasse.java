package edu.vericio.anatomiaclasses;

public class MinhaClasse {

    public static void main(String[] args) {

        // final String BR = "Brasil"; variável com "final" nunca será alterada
        // BR = "Brazil"; Uma variável que já recebeu um valor, não pode receber outro.

        // String meuNome = "Marcos";

        // int anoFabricacao = 1992;

        // boolean verdadeira = false;

        // anoFabricacao = 2018;

        // System.out.print("Olá turma, sejam bem vindos!");

        String primeiroNome = "Marcos";
        String segundoNome = "Verício";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
