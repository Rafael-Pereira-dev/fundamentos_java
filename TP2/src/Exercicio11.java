import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        int valorAtual = valorInicial;

        while (valorAtual <= 100) {
            System.out.print(valorAtual + ", ");

            valorAtual += incremento;
        }

        scanner.close();
    }
}
