package Exercicio06;

public class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double km;

    public void exibirDetalhes() {
        System.out.println();
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Quilometragem: " + km);
    }

    public void registrarViagem(double km) {
        this.km += km;
    }
}
