package exercicio2;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, int ano, String modelo, int cilindradas) {
        super(marca, ano, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String ExibirInfos() {
        return super.ExibirInfos() + "\nCilindradas: " + this.cilindradas;
    }
}
