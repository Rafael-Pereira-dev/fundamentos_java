package Exercicio09;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.titular = "Fulano";
        conta1.numero = 123456;
        conta1.agencia = "Praça";
        conta1.saldo = 1000.95;
        conta1.dataAbertura = "10/03/2025";

        System.out.println("O saldo atual da conta é R$ " + conta1.saldo);
        conta1.sacar(200);
        System.out.println("O saldo da conta após o saque é de R$ " + conta1.saldo);
        conta1.depositar(500.50);
        System.out.println("O saldo da conta após o depósito é de R$ " + conta1.saldo);
        System.out.println("O rendimento da conta foi de R$ " + conta1.calcularRendimento());
    }
}
