package Exercicio04;

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
    }
}
