
package com.mycompany.descontodeproduto;
import javax.swing.JOptionPane;
public class DescontoDeProduto {

    public static void main(String[] args) {
    produto desconto = new produto ();
    
    
    double resultado2 = desconto.calcularDesconto();
            
    JOptionPane.showMessageDialog(null, " O preço com desconto de 15% do " + desconto.nome +" é: " + resultado2 );


    }
}
