package exercicio2;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", 2022, "MT-07", 689);
        Carro carro = new Carro("Toyota", 2020, "Corolla", 4);

        System.out.println("Informações da Moto:");
        System.out.println(moto.ExibirInfos());

        System.out.println("Informações do Carro:");
        System.out.println(carro.ExibirInfos());
    }
}
