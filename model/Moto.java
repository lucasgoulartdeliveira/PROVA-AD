package model;

public class Moto extends Veiculo {

    public Moto(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;

        if (dias >= 5) {
            total = total - (total * 0.15);
        }

        return total;
    }
}
