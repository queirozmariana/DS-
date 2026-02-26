
package com.mycompany.diagramacarro;

public class DiagramaCarro {

    public static void main(String[] args) {

    {
    Carro meuCarro = new Carro();
     
    meuCarro.cor = "Branco";
    meuCarro.modelo = "Celta";
    meuCarro.motor = "1.0";
    
    meuCarro.ligar();
    meuCarro.desligar();
    meuCarro.acelerar();
    meuCarro.mudarMarcha();
    meuCarro.brecar();
 
    System.out.println(" A cor é " + meuCarro.cor);
    System.out.println(" O modelo é " + meuCarro.modelo);
    System.out.println(" O motor é " + meuCarro.motor);
    meuCarro = null;
    
    }
    }}
