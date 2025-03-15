package Exercicio08;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void sacar(double valor) {
        this.saldo =- valor;
        System.out.println("Foi sacado R$ " + valor + " da sua conta");
    }

    public void depositar(double valor) {
        this.saldo =+ valor;
        System.out.println("Foi depositado R$ " + valor + " em sua conta");
    }

    public double calcularRendimento(double saldo) {
        return this.saldo * 0.1;
    }
}
