package com.mycompany.menuscanner;

import java.util.Scanner;

public class MenuScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" MENU ");
            System.out.println("1 - Mostrar mensagem");
            System.out.println("2 - Mostrar número");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá! Sistema funcionando.");
                    break;

                case 2:
                    System.out.println("Número: 100");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}