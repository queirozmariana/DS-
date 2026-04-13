package com.mycompany.pedido;

public class Cliente {
 
    private String nome;
    private MeuPedido pedido; 

    public Cliente(String nome, MeuPedido pedido) {
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public MeuPedido getPedido() { 
        return pedido;
    }
}