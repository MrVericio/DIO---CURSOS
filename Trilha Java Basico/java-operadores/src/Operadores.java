import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // Operador de ATRIBUIÇÃO: '='
        // Ex:
        String nome = "Marcos Verício";
        int idade = 30;
        double peso = 115;
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        if (doadorOrgao = true) {
            System.out.println("Doador: Sim");
        }
        System.out.println("Nascimento: " + dataNascimento);

    }
}
