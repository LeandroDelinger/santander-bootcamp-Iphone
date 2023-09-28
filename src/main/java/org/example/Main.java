package org.example;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Modelo do aparelho: " + iphone.modelo);
        System.out.println("Versão do IOS: " + iphone.versaoIOS);

        System.out.println("Testando Telefonia");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioDeVoz();

        System.out.println("Testando player de música");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("Testando Navegador Web");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}
