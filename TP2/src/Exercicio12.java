import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+"); // \\s+ significa "um ou mais espaços em branco"

        int numeroDePalavras = palavras.length;

        System.out.println("A frase contém " + numeroDePalavras + " palavras.");

        scanner.close();
    }
}
