package edu.vericio.exercicios;

import java.util.Scanner;

/* 
 * Faça um programa que leia cnjuntos de dois valores,
 * o pimeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
public class LoopsNomeIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variáveis
        String nome; // armazena o nome

        while (true) { // Enquando o loop for verdadeiro
            System.out.println("Nome: "); // Peça o nome
            nome = sc.next(); // armazene esse nome na variável

            if (nome.equals("0")) // caso o nome igual a "0"
                break; // interrompa o programa

            System.out.println("Idade: "); // Peça a idade
            sc.nextInt(); // Não é necessária uma variável do tipo Int para essa operação
        }

        System.out.println("Continua aqui..."); // Inserindo o valor 0 o break é acionado e essa mensagem exibida

        sc.close();

    }
}
