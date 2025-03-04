
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome completo? ");
        String nome_usuario = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        scanner.nextLine(); //Para consumir o caractere de nova linha após leitura do inteiro

        System.out.println("Qual o nome completo da sua mãe? ");
        String nome_mae = scanner.nextLine();

        System.out.println("Qual o nome completo do seu pai? ");
        String nome_pai = scanner.nextLine();

        System.out.println("*** Dados preenchidos ***");
        System.out.println("Nome completo do usuário: " + nome_usuario);
        System.out.println("Idade: " + idade);
        System.out.println("Nome completo da mãe: " + nome_mae);
        System.out.println("Nome completo do pai: " + nome_pai);
        System.out.println();

        if (nome_usuario.length() > nome_mae.length() && nome_usuario.length() > nome_pai.length()) {
            System.out.println("O nome " + nome_usuario + " é o maior de todos.");
        } else if (nome_mae.length() > nome_usuario.length() && nome_mae.length() > nome_pai.length()) {
            System.out.println("O nome " + nome_mae + " é o maior de todos.");
        } else if (nome_pai.length() > nome_usuario.length() && nome_pai.length() > nome_mae.length()) {
            System.out.println("O nome " + nome_pai + " é o maior de todos.");
        } else {
            System.out.println("Nomes possuem o mesmo tamanho");
        }

        scanner.close();
    }
}
