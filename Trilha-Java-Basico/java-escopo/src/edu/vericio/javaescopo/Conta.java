package edu.vericio.javaescopo;

public class Conta {
    // Variável da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // Variável local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // Disponível em toda classe
        System.out.println(saldo);
        // Somento o método SACAR conhece esta variável
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        // Variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // Começando a variável com valor zero

        for (int x = 1; x <= 5; x++) { // X variável de escopo de fluxo
            // esta vairável será reiniciada a cada execução FOR

            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // Escopo de fluxo
        // X e valorCalculado nunca estarão disponíveis fora do FOR

        return valorMontante;
    }
}
