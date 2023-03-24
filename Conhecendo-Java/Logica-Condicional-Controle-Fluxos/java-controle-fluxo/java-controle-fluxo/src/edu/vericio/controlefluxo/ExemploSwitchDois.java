package edu.vericio.controlefluxo;
import java.util.Scanner;

public class ExemploSwitchDois {
    public static void main(String[] args) {
        //Exemplos
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número da sorte: ");

        int numero = sc.nextInt();

        switch (numero) {
            case 1:
            System.out.println("Certo");
            break;

            case 2:
            System.out.println("Certo");
            break;

            case 3:
            System.out.println("Certo");
            break;

            case 4:
            System.out.println("Errado");
            break;

            case 5:
            System.out.println("Talvez");
            break;

            default:
            System.out.println("Valor indefinido");
        }

        sc.close();
    }
}
