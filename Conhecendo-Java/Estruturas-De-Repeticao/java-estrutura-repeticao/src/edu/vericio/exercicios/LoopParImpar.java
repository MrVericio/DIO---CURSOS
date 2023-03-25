package edu.vericio.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça N número inteiros
 * calcule e mostre a quantidade de números pares
 * e a quantidade de número ímpares
 */
public class LoopParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

        int quantNumeros; // variável para guardar a quantidade de números
        int numero; // Variável pra guardar o número
        int quantPares = 0, quantImpares = 0; // Variável pra guardar a quantidade Pares e Impares

        System.out.println("Quantidade de números: "); // Peça um número
        quantNumeros = sc.nextInt(); // Recebe o número

        int count = 0; // Controla o loop
        do { // Primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); // Peça um número
            numero = sc.nextInt(); // Recebe o número

            // Se o resto da divisão do número por 2 (numero/2) for 0
            if (numero % 2 == 0)
                quantPares++; // Acrescente o valor 1 a variável quantPar.
            // Caso contrário, o número digitado é ímpar
            else
                quantImpares++; // Adicione o valor 1 a variável quantImpar.

            // count = count + 1;
            count++; // Some o valor 1 ao contador até que invalide a condição do loop. (count <
                     // quantNumeros)
        } while (count < quantNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números

        // imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade ímpar: " + quantImpares);

        sc.close(); // Fecha a entrada de Dados
    }
}
