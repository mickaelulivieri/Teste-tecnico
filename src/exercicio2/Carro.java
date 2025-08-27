package exercicio2;

public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, int ano, String modelo, int portas) {
        super(marca, ano, modelo);
        this.portas = portas;
    }

    @Override
    public String ExibirInfos() {
        return super.ExibirInfos() + "\nNúmero de portas: " + this.portas;
    }
}