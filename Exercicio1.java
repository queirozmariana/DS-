
package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

    {
    Pessoa criança = new Pessoa();
     
    criança.nome = "Mariana";
    criança.sexo = "Feminino";
    criança.país = "Brasil";
    
    criança.andar();
    criança.falar();
    criança.correr();
    criança.estudar();
    criança.brincar();
 
    System.out.println(" Meu nome é: " + criança.nome);
    System.out.println(" Sou do sexo: " + criança.sexo);
    System.out.println(" Moro no: " + criança.país);
    criança = null;
    
    }
    }

    }
