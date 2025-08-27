package exercicio2;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String ExibirInfos() {
        return "Marca do veículo: " + this.marca + "\n"
                + "Modelo do veículo: " + this.modelo + "\n"
                + "Ano do veículo: " + this.ano;
    }
}