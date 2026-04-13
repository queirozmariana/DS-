
package com.mycompany.funcionario;


public class Funcionario {

    public static void main(String[] args) {
        
        MeuFuncionario funcionario = new MeuFuncionario(2000);
        Gerente gerente = new Gerente(2000);

        System.out.println("Salário do funcionário: " + funcionario.calcularSalario());
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
    }
}