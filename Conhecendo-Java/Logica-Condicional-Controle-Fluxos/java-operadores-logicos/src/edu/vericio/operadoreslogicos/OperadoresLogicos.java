package edu.vericio.operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Exemplos
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        if (b1 && b2) { // && valores diferentes são falsos
            System.out.println("b1 && b2 são verdadeiros ");
        } else {
            System.out.println("b1 && b2 são falsos ");
        }
        if (b1 && b3) { // && valores iguais são verdadeiros
            System.out.println("b1 && b3 são verdadeiros ");
        } else {
            System.out.println("b1 && b3 são falsos ");
        }
        if (b2 || b3) { // || valores diferentes são verdadeiros
            System.out.println("b2 || b3 são verdadeiros ");
        } else {
            System.out.println("b2 || b3 são falsos ");
        }
        if (b2 || b4) { // || valores iguais são falsos
            System.out.println("b2 || b4 são verdadeiros ");
        } else {
            System.out.println("b2 || b4 são falsos ");
        }
        if (b1 ^ b3) { // ^ valores iguais são falsos
            System.out.println("b1 ^ b3 são verdadeiros ");
        } else {
            System.out.println("b1 ^ b3 são falsos ");
        }
        if (b4 ^ b1) { // ^valores diferentes são verdadeiros
            System.out.println("b4 ^ b1 são verdadeiros ");
        } else {
            System.out.println("b4 ^ b1 são falsos ");
        }
        if (!b1) { // ! inverte o valor de b1
            System.out.println("!b1 são verdadeiros ");
        } else {
            System.out.println("!b1 são falsos ");
        }
        if (!b2) { // ! inverte o valor de b2
            System.out.println("!b2 são verdadeiros ");
        } else {
            System.out.println("!b2 são falsos ");
        }
        /*
         * if ((i1 > i2) || (f2 < f1)) {
         * System.out.println("(i1 > i2) || (f2 < f1) ");
         * } else {
         * System.out.println("(i1 > i2) || (f2 < f1) ");
         * }
         * if (((i1 + i2) < (f2 - f1)) && true) {
         * System.out.println("((i1 + i2) < (f2 - f1)) && true ");
         * } else {
         * System.out.println("((i1 + i2) < (f2 - f1)) && true ");
         * }
         */
    }
}
