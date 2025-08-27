package exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", "Maria");
        conta.sacar(100);
        conta.depositar(1000);
        conta.sacar(545);
        conta.exibirSaldo();
    }
}

