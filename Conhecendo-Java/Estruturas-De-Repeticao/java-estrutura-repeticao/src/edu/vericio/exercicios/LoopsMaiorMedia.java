package edu.vericio.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */

public class LoopsMaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

        int numero; // guarda o número
        int maior = 0; // guarda o maior número
        int soma = 0; // guarda a soma

        int count = 0; // controla o loop
        // loop
        do {
            System.out.println("Numero: "); // Peça um número
            numero = sc.nextInt(); // Enetrada de dados, Inteiro.

            soma = soma + numero; // soma o número informado + a variável soma
            System.out.println("Soma: " + soma); // Imprime a soma da variável anterior

            if (numero > maior) // Se o valor que o usuário digitou for maior que o valor armazenado na variável maior
                maior = numero; // Atribua o valor deste número a variável maior

            count = count + 1; // Soma o valor 1 ao contador até atingir o loop (count < 5)
            //System.out.println("Maior: " + maior); // Se for posto aqui, toda vez que for inserido o número
            // ele vai mostrar o maior número inserido logo a baixo
        } while (count < 5); // Enquanto o contador tiver o valor menor que 5

        // Imprimindo o maior número digitado e a média dos mesmos
        System.out.println("Maior: " + maior); // Imprime o maior número
        System.out.println("Média: " + (soma/5)); // Imprime e faz a média

        sc.close();
    }
}
