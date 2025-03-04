import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int soma = 0;
        for (int i =  1; i <= 4; i++) {
            System.out.println("Digite o valor do " + i + "º bimestre: ");
            int nota = scanner.nextInt();
            soma += nota;
        }

        double media = soma/4.0;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
