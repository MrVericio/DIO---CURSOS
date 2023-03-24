package edu.vericio.controlefluxo;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        // Exemplos
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um mês de Janeiro a Dezembro para suas Férias ");

        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno);
        

        if (mes == 1) {
            System.out.println("Você escolheu Janeiro");
        }
        if (mes == 2) {
            System.out.println("Você escolheu Fevereiro");
        }
        if (mes == 3) {
            System.out.println("Você escolheu Março");
        }
        if (mes == 4) {
            System.out.println("Você escolheu Abril");
        }
        if (mes == 5) {
            System.out.println("Você escolheu Maio");
        }
        if (mes == 6) {
            System.out.println("Você escolheu Junho");
        }
        if (mes == 7) {
            System.out.println("Você escolheu Julho");
        }
        if (mes == 8) {
            System.out.println("Você escolheu Agosto");
        }
        if (mes == 9) {
            System.out.println("Você escolheu Setembro");
        }
        if (mes == 10) {
            System.out.println("Você escolheu Outubro");
        }
        if (mes == 11) {
            System.out.println("Você escolheu Novembro");
        }
        if (mes == 12) {
            System.out.println("Você escolheu Dezembro");
        }
        if (mes > 12) {
            System.out.println("Mês inválido");
        }
        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Férias Escolares!");
        }

        sc.close();
    }
}
