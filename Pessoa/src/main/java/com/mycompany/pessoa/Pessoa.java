
package com.mycompany.pessoa;

public class Pessoa {

    public static void main(String[] args) {

        MetodoPessoa user1 = new MetodoPessoa("Maria", 25);
        
        System.out.println("Usuário: " + user1.getNome() + "| Idade: " + user1.getIdade());

        user1.setNome("Julia"); 
        user1.setIdade(16);          
        
        System.out.println("Atualizado: " + user1.getNome() + "| Idade: " + user1.getIdade());

    
    }
}
   

