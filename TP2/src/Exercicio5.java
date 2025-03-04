import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double valor_total = scanner.nextDouble();

        double valor_apos_desconto;

        if (valor_total > 1000) {
            valor_apos_desconto = valor_total - (valor_total * 0.1);
            System.out.printf("O valor total da compra foi de R$ %.2f", valor_total);
            System.out.println("\nFoi dado um desconto de 10%");
            System.out.printf("E o valor da compra após o desconto é de R$ %.2f", valor_apos_desconto);
        } else if (valor_total >= 500 && valor_total <= 1000) {
            valor_apos_desconto = valor_total - (valor_total * 0.05);
            System.out.printf("O valor total da compra foi de R$ %.2f", valor_total);
            System.out.println("\nFoi dado um desconto de 5%");
            System.out.printf("E o valor da compra após o desconto é de R$ %.2f", valor_apos_desconto);
        } else {
            System.out.printf("O valor total da compra foi de R$ %.2f", valor_total);
            System.out.println("\nNão foi dado desconto para esta compra");
        }

        scanner.close();
    }
}
