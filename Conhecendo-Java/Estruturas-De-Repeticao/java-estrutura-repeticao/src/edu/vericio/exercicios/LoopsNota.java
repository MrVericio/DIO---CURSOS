package edu.vericio.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */
public class LoopsNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Nota de 0 a 10: "); // Peça uma nota de 0 a 10
        int nota = sc.nextInt(); // Entrada de dados, neste caso de um int

        while (nota < 0 || nota > 10) { // Enquanto o valor da nota for menor que 0 ou maior que 10.
            System.out.println("Nota inválida! Digite novamente: "); // Mensagem que o valor é inválido
            nota = sc.nextInt(); // Entrada do novo valor

        }

        System.out.println("Nota: " + nota); // Saída se o valor estiver dentro do parametro

        sc.close();
    }
}
