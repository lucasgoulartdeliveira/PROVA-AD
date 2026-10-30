package model;

public class Carro extends Veiculo {

    public Carro(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;
        return total + (total * 0.10);
    }
}
