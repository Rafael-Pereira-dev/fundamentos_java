package Exercicio08;

public class Main {
    public static void main(String[] args) {
        Funcionario.Gerente gerente = new Funcionario.Gerente();
        Funcionario.Estagiario estagiario = new Funcionario.Estagiario();

        gerente.nome = "Fulano";
        gerente.salarioBase = 5000.00;

        estagiario.nome = "Beltrano";
        estagiario.salarioBase = 1500.00;

        System.out.println("Salário do Gerente " + gerente.nome + ": R$ " + String.format("%.2f", gerente.calcularSalario()));
        System.out.println("Salário do Estagiário " + estagiario.nome + ": R$ " + String.format("%.2f", estagiario.calcularSalario()));
    }
}
