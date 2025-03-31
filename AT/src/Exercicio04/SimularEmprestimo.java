package Exercicio04;

import java.util.Scanner;

public class SimularEmprestimo {
    public static void simularEmprestimo(String nome, double valorEmprestimo, Scanner sc) {
        int parcelas;

        do {
            System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
            parcelas = sc.nextInt();
        } while (parcelas < 6 || parcelas > 48);

        double taxaJuros = 0.03;
        double valorTotalPago = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double parcelaMensal = valorTotalPago / parcelas;

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Valor do empréstimo: R$ " + String.format("%.2f", valorEmprestimo));
        System.out.println("Número de parcelas: " + parcelas);
        System.out.println("Taxa de juros mensal: 3%");
        System.out.println("Valor total a ser pago: R$ " + String.format("%.2f", valorTotalPago));
        System.out.println("Valor da parcela mensal: R$ " + String.format("%.2f", parcelaMensal));
    }
}
