package application;

import entities.Usuario;

import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Usuario[] quartos = new Usuario[10];

        for ( int i = 0; i < quartos.length; i++ ){
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o email: ");
            String email = sc.nextLine();

            Usuario[i] = new Usuario(nome, email);
        }

        System.out.println("Data: "[i]);

    }
}
