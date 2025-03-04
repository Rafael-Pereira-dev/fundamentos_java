import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dolar = 5.88;
        double euro = 6.12;
        double libra = 7.41;

        System.out.println("Informe o valor em reais: ");
        double real = scanner.nextDouble();

        System.out.println("Escolha para qual moeda deseja converter o valor:\n1 - Dólar\n2 - Euro\n3 - Libra");
        int moeda = scanner.nextInt();

        double total;

        switch (moeda) {
            case 1:
                total = real / dolar;
                System.out.printf("O valor total convertido para dólar é: %.2f", total);
                break;

            case 2:
                total = real / euro;
                System.out.printf("O valor total convertido para euro é: %.2f", total);
                break;

            case 3:
                total = real / libra;
                System.out.printf("O valor total convertido para libra é: %.2f", total);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
