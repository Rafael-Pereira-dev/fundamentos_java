package Exercicio05;

/*Os métodos getters e setters servem para acessar e modificar os valores das variáveis de uma classe de forma
controlada e segura. A principal finalidade desses métodos é proteger os dados de uma classe, permitindo que a classe
controle como os valores de suas variáveis são acessados e modificados.*/

public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto ();

        prod1.nome = "Arroz";
        prod1.preco = 7.50;
        prod1.quantidadeEmEstoque = 28;

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
