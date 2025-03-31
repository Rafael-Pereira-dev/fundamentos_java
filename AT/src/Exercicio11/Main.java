package Exercicio11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numerosJogador = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");

        for (int i = 0; i < 6; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = sc.nextInt();
            } while (numero < 1 || numero > 60);

            numerosJogador[i] = numero;
        }

        int[] numerosSorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = random.nextInt(60) + 1;
        }

        System.out.println("\nNúmeros sorteados: ");
        for (int num : numerosSorteados) {
            System.out.print(num + " ");
        }
        System.out.println();

        int acertos = 0;
        for (int numJogador : numerosJogador) {
            for (int numSorteado : numerosSorteados) {
                if (numJogador == numSorteado) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\nVocê acertou " + acertos + " números");

        sc.close();
    }
}
