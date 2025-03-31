package Exercicio09;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Fulano de Tal");

        conta.exibirSaldo();

        conta.depositar(1000.00);
        conta.exibirSaldo();

        conta.sacar(350.00);
        conta.exibirSaldo();

        conta.sacar(800.00);
        conta.exibirSaldo();

        conta.depositar(-50.00);

    }
}
