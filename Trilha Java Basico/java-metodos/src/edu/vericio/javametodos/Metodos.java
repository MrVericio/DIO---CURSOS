package edu.vericio.javametodos;

public class Metodos {
    public static void main(String[] args) {
        /* Exempelos sugeridos para nomenclatura de métodos:    */
        /* 
        somar(int n1, int n2) {} 
        abrirConexao() {}
        concluirProcessamento() {}
        findById(int id) {} Poderá ser utilizado, é importante saber criar em outro idioma
        calcularImprimir() {} / existe um conflito de responsabilidade, ele é pra calcular ou imprimir? Atenção a 
        proposta do método. Ele deve ter uma só finalidade. Outra OBS importante é que todos os métodos devem ser
        definido DENTRO DE UMA CLASSE.
        Caso o MÉTODO não retorne NENHUM VALOR ou mesmo será representado pela palavra VOID. */

        /* Outros exemplos de métodos */
        public double somar(int num1, int num2) {
            // LOGICA - FINALIDDADE DO MÉTODO - Construir aqui as variáveis.
            return; /* Quando temos um método que RETORNA alguma coisa, devemos finalizar com return; */
        }

        public void imprimir(String texto) {
            // LOGICA - FINALIDADE DO MÉTODO - Construir aqui as variáveis.
            // AQUI NÃO PRECISA DO RETURN; POIS NÃO SERÁ RETORNADO NENHUM RESULTADO POIS É void.
        }
        
        public double dividir(int dividendo, int divisor) throws  Exception{
            // Exception indica que o método ao ser utilizado pode gerar uma exceção.
        }

        private void metodoPrivado() {
            // Esse método não pode ser visto por outras classes.            
        }

        /* Alguns equívocos estruturais */
        public void validar() {
            // Este método deveria retornar algum valor, no caso boolean: true ou false.
        }

        public void calcularEnviar() {
            // Como dito, um método deve representar uma única finalidade ou responsabilidade. Esse método vai
            // calcular ou enviar?            
        }

        public void gravarCliente(String nome, String cpf) {
            // Este método tem a finalidade de gravar informações de um cliente. Porque não criar um
            // objeto cliente e passar como parâmetro?            
        }

        /* Exemplo Objeto */
        public void gravarCliente(Cliente cliente) {}
        // OU
        public void gravar(Cliente cliente) {}
        
    }
}
