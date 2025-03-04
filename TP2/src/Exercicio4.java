import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento [1-31]: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento [1-12]: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de nascimento [ex. 1992]: ");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        LocalDate dataAtual = LocalDate.now();

        long diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Você viveu " + diasVividos + " dias até agora.");

        scanner.close();
    }
}
