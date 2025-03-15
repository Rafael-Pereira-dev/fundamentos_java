package Exercicio12;

public class TestarFiguras {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Esfera esfera1 = new Esfera();

        circulo1.raio = 3.0;
        esfera1.raio = 5.0;

        System.out.println("Área do círculo: " + circulo1.calcularArea());
        System.out.println("Volume da esfera: " + esfera1.calcularVolume());
    }
}
