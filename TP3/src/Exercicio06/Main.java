package Exercicio06;

/* O uso de construtores traz mais controle, segurança, clareza e simplicidade na criação de objetos.
Ele permite que o objeto seja inicializado de forma mais compacta, consistente e com menor chance de erros, já que todos
os atributos obrigatórios são passados de uma vez e no momento da criação do objeto.

Já os métodos set oferecem flexibilidade, mas podem tornar o código mais extenso e difícil de controlar, especialmente
quando há muitos atributos para serem definidos. Isso pode levar a objetos com estados inválidos ou incompletos, caso
algum valor importante não seja configurado corretamente.*/

public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Arroz", 7.50, 28);

        prod1.exibirInformacoes();
        System.out.println();
        prod1.alterarPreco(9.25);
        prod1.alterarQuantidade(19);
        System.out.println();
        prod1.exibirInformacoes();
        System.out.println();
        prod1.setNome("Feijão");
        prod1.setPreco(12.49);
        prod1.setQuantidadeEmEstoque(25);
        prod1.exibirInformacoes();
    }
}