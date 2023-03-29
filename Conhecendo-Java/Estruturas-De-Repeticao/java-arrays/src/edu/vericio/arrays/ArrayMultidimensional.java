package edu.vericio.arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[][] M = new int[4][4]; //declaração de uma matriz multidimensional

        for(int i = 0; i < M.length; i++){ // for definindo limte da linha
            for( int j = 0; j < M[i].length; j++){ // for definindo limite da coluna
                M[i][j] = random.nextInt(9); // gerando os números aleatórios de linha e coluna
            }
        }

        System.out.println("Matriz: "); // imprimindo frase
        for (int[] linha : M) { // foreach recebendo números da linha
            for (int Coluna : linha) { // foreach recebendo número da coluna
                System.out.print(Coluna + " "); // imprimindo coluna
            }
            System.out.println(); // imprimindo linha
        }
    }
}
