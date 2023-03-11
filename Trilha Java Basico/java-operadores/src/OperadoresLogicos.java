public class OperadoresLogicos {
    public static void main(String[] args) {
        /* Operadores Lógicos: " &&, ||" */
        // Ex:
        boolean condicao1 = true;
        boolean condicao2 = false;

        /* Condição1 e Condição2 são IGUAIS? */
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        /* Condição1 OU Condição2 atende os requesitos? */
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }
        /* Outro exemplo de Operador Lógico com Operador Relacional */
        if (condicao1 && (7 > 4)) {
            System.out.println("Operador Lógico e Operador Relacional funcionam!");
        }

        System.out.println("Fim");
    }
}
