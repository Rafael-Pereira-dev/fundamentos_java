import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();
        String senhaVerificada;

        do {
            System.out.println("Digite a senha novamente: ");
            senhaVerificada = scanner.nextLine();
        } while (!senha.equals(senhaVerificada));

        System.out.println("Senha correta!");

        scanner.close();
    }
}
