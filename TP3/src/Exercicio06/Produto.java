package Exercicio06;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto (String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("O preço do produto " + nome + " foi atualizado para: R$ " + preco);
    }

    public void alterarQuantidade(int novaQuatidade) {
        this.quantidadeEmEstoque = novaQuatidade;
        System.out.println("A quantidade do produto " + nome + " foi atualizada para: " + quantidadeEmEstoque);
    }
}
