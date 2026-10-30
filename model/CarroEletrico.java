package model;

public class CarroEletrico extends Carro implements Eletrico {
    private double consumoDiarioKwh;

    public CarroEletrico(String placa, String modelo, double valorDiaria,
                         double consumoDiarioKwh) {
        super(placa, modelo, valorDiaria);
        this.consumoDiarioKwh = consumoDiarioKwh;
    }

    @Override
    public double calcularAluguel(int dias) {
        return super.calcularAluguel(dias) + (15.0 * dias);
    }

    @Override
    public double calcularRecarga(int dias) {
        return dias * consumoDiarioKwh * 0.80;
    }
}
