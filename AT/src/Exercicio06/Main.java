package Exercicio06;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();

        veiculo1.placa = "XYZ123";
        veiculo1.modelo = "AMG CLS 63";
        veiculo1.anoDeFabricacao = 2018;
        veiculo1.km = 26750;

        veiculo2.placa = "WWW666";
        veiculo2.modelo = "AUDI RS7";
        veiculo2.anoDeFabricacao = 2022;
        veiculo2.km = 13495;

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(1500);
        veiculo2.registrarViagem(744);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
