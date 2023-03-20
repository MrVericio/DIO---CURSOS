package edu.vericio.operadoreslogicos;

public class ExemploTres {
    public static void main(String[] args) {
        // Exemplo de Boas Práticas no código - 3 exemplos do mesmo código
        double salarioMensal = 11893.58;
        double mediaSalario = 10500;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("recebeAuxilio " + recebeAuxilio);
    }
}
