public class Conta_Bancaria {
    private double saldo;

    // Construtor
    public Conta_Bancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para verificar saldo
    public double getSaldo() {
        return saldo;
    }
}
