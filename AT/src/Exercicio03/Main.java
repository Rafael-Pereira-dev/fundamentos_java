package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu salário MENSAL: ");
        double salarioMensal = sc.nextDouble();

        double salarioAnual = salarioMensal * 12;

        CalcularImposto.calcularImposto(nome, salarioAnual);

        sc.close();
    }
}
