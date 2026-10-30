package model;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void exibirResumo() {
        System.out.println("Placa: " + placa + " | Modelo: " + modelo);
    }

    public abstract double calcularAluguel(int dias);
}
