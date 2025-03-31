package Exercicio07;

public class Aluno {
    String nome;
    String matricula;
    double nota1, nota2, nota3;

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 7) {
            System.out.println();
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Média: " + media);
            System.out.println("APROVADO!");
        } else {
            System.out.println();
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Média: " + media);
            System.out.println("REPROVADO!");
        }
    }
}
