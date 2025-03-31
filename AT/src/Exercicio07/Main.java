package Exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aln = new Aluno();

        System.out.print("Digite seu nome: ");
        aln.nome = sc.nextLine();

        System.out.print("Digite sua matrícula: ");
        aln.matricula = sc.nextLine();

        System.out.print("Digite sua 1ª nota: ");
        aln.nota1 = sc.nextDouble();

        System.out.print("Digite sua 2ª nota: ");
        aln.nota2 = sc.nextDouble();

        System.out.print("Digite sua 3ª nota: ");
        aln.nota3 = sc.nextDouble();

        aln.verificarAprovacao();

        sc.close();
    }
}
