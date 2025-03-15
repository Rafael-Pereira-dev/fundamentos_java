package Exercicio01;

/* Classe: Define o modelo (plano) para os objetos, especificando os atributos e métodos.
Objeto: É uma instância de uma classe, com valores próprios para seus atributos e com a capacidade de executar métodos.
Campos (ou Atributos): Representam as características de um objeto e são definidos dentro da classe.
Métodos: São as funções ou ações que os objetos podem realizar, definidas dentro da classe. */

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();

        carro1.modelo = "Fusca";
        carro1.placa = "XYZ123";
        carro1.cor = "preto";
        carro1.num_portas = 4;
        carro1.exibirInformacoes();
    }
}
