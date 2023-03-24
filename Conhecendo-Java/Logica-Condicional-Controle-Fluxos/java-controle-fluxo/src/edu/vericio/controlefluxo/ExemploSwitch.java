package edu.vericio.controlefluxo;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        // Exemplos
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o dia da semana e veja seu número: ");

        String diaSemana = sc.next();

        switch (diaSemana) {
            case "Domingo":
                System.out.println("Você escolheu o 1º dia da semana");
                break;

            case "Segunda":
                System.out.println("Você escolheu o 2º dia da semana");
                break;

            case "Terça":
                System.out.println("Você escolheu o 3º dia da semana");
                break;

            case "Quarta":
                System.out.println("Você escolheu o 4º dia da semana");
                break;

            case "Quinta":
                System.out.println("Você escolheu o 5º dia da semana");
                break;

            case "Sexta":
                System.out.println("Você escolheu o 6º dia da semana");
                break;

            case "Sábado":
                System.out.println("Você escolheu o 7º dia da semana");
                break;

            default:
                System.out.println("Você digitou algo incorretamente");

        }
        sc.close();
    }
}
