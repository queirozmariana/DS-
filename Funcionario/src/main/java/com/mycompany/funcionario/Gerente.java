
package com.mycompany.funcionario;

public class Gerente extends MeuFuncionario {

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return salario + 1000; 
    }
}