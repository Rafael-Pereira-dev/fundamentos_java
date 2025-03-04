import java.util.Scanner;

public class Exercicio8 {
    public static boolean verificarTriangulo (int lado1, int lado2, int lado3) {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            return true;
        } else {
            return false;
        }
    }

    public static String classificarTriangulo (int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero.";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isóceles.";
        } else {
            return "Escaleno.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();

        if (verificarTriangulo(lado1, lado2, lado3)) {
            String tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);
            System.out.println("O triângulo é " + tipoTriangulo);
        } else {
            System.out.println("Os valores informados não formam um triângulo");
        }
        scanner.close();
    }
}
