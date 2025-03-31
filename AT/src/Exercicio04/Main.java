package Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = sc.nextDouble();

        SimularEmprestimo.simularEmprestimo(nome, valorEmprestimo, sc);

        sc.close();
    }
}
