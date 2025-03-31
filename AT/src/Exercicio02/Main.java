package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("\nDigite sua senha: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, uma letra maiúscula, um número e um " +
                        "caractere especial (@, #, $, %, etc)");
                continue;
            }

            if (!senha.matches(".*[A-Z].*")) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, uma letra maiúscula, um número e um " +
                        "caractere especial (@, #, $, %, etc)");
                continue;
            }

            if (!senha.matches(".*\\d.*")) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, uma letra maiúscula, um número e um " +
                        "caractere especial (@, #, $, %, etc)");
                continue;
            }

            if (!senha.matches(".*[@#$%^&+=!*.].*")) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, uma letra maiúscula, um número e um " +
                        "caractere especial (@, #, $, %, etc)");
                continue;
            }

            senhaValida = true;
        }

        System.out.println("Login feito com sucesso!");

        scanner.close();
    }
}