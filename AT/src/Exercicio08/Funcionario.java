package Exercicio08;

public class Funcionario {
    String nome;
    double salarioBase;

    public double calcularSalario() {
        return salarioBase;
    }

    static class Gerente extends Funcionario {
        @Override
        public double calcularSalario() {
            return salarioBase * 1.20;
        }
    }

    static class Estagiario extends Funcionario {
        @Override
        public double calcularSalario() {
            return salarioBase * 0.9;
        }
    }
}
