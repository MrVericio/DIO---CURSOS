package edu.vericio.javametodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criando o controle e interação entre o usuário e a TV
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - Tv Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal alterado para: " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal alterado para: " + smartTv.canal);
    }
}
