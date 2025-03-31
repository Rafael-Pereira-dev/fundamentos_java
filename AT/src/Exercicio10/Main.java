package Exercicio10;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeArquivo = "compras.txt";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Cadastro da compra " + i);
            System.out.print("Produto: ");
            String produto = sc.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            System.out.print("Preço unitário: R$ ");
            double precoUnitario = sc.nextDouble();

            sc.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
                writer.write(produto + "," + quantidade + "," + precoUnitario);
                writer.newLine();  // Nova linha após cada compra
            } catch (IOException e) {
                System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
            }
        }

        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dadosCompra = linha.split(",");
                String produto = dadosCompra[0];
                int quantidade = Integer.parseInt(dadosCompra[1]);
                double precoUnitario = Double.parseDouble(dadosCompra[2]);

                System.out.printf("Produto: %s, Quantidade: %d, Preço Unitário: R$ %.2f%n",
                        produto, quantidade, precoUnitario);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
