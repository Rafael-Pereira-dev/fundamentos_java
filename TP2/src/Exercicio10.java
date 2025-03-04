import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int palpite;

       do {
           System.out.println("Qual o número foi sorteado? ");
           palpite = scanner.nextInt();

           if (palpite > numeroSorteado) {
               System.out.println("O palpite é maior que o número sorteado.");
           } else if (palpite < numeroSorteado) {
               System.out.println("O palpite é menor que o número sorteado.");
           } else {
               System.out.println("Parabéns, você acertou!");
           }

       } while (numeroSorteado != palpite);

        scanner.close();
    }
}
