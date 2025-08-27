package exercicio1;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        System.out.println("Conta criada para " + titular);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositando R$ " + valor + ".");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacando R$ " + (int)valor + ".");
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + (int)valor + ".");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + (int)saldo + ".");
    }
}

