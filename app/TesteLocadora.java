package app;

import java.util.ArrayList;
import java.util.List;

import model.Carro;
import model.CarroEletrico;
import model.Eletrico;
import model.Moto;
import model.Veiculo;

public class TesteLocadora {

    public static void main(String[] args) {
        // Não é possível instanciar Veiculo porque ela é uma classe abstrata.
        // Veiculo veiculoGenerico = new Veiculo("ABC-1234", "Genérico", 100.0);

        Carro carro = new Carro("ABC-1234", "Sedan", 150.0);
        Moto motoQuatroDias = new Moto("DEF-5678", "Street", 80.0);
        Moto motoCincoDias = new Moto("GHI-9012", "Trail", 80.0);
        CarroEletrico eletrico = new CarroEletrico(
                "JKL-3456", "Elétrico", 200.0, 10.0
        );

        // Uma única lista reúne diferentes tipos de veículos.
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(motoQuatroDias);
        veiculos.add(motoCincoDias);
        veiculos.add(eletrico);

        int[] diasAluguel = {3, 4, 5, 3};

        System.out.println("=== ALUGUÉIS ===");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
            veiculo.exibirResumo();
            System.out.printf("Valor do aluguel: R$ %.1f%n",
                    veiculo.calcularAluguel(diasAluguel[i]));
            System.out.println();
        }

        // A lista usa a interface Eletrico: somente quem implementa
        // esse contrato pode entrar nela e calcular o custo da recarga.
        List<Eletrico> veiculosEletricos = new ArrayList<>();
        veiculosEletricos.add(eletrico);

        System.out.println("=== RECARGAS ===");
        for (Eletrico veiculoEletrico : veiculosEletricos) {
            System.out.printf("Custo da recarga: R$ %.1f%n",
                    veiculoEletrico.calcularRecarga(3));
        }
    }
}
