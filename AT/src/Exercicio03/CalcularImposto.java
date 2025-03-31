package Exercicio03;

public class CalcularImposto {
    public static void calcularImposto(String nome, double salarioAnual) {

        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Salário anual: R$ " + String.format("%.2f", salarioAnual));
        System.out.println("Valor do imposto: R$ " + String.format("%.2f", imposto));
        System.out.println("Salário líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}
