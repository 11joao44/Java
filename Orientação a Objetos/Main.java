public class Main {
    public static void main(String[] args) {
        Classe_Pessoa pessoa = new Classe_Pessoa("João", 30);
        pessoa.exibirDados();
        System.out.println();

        // Testando a classe Circulo
        Circulo circulo = new Circulo(5.0);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Circunferência do círculo: " + circulo.calcularCircunferencia());
        System.out.println();

        // Testando a classe ContaBancaria
        Conta_Bancaria conta = new Conta_Bancaria(1000.0);
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
        System.out.println();

        // Testando a classe Livro
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        livro.exibirInformacoes();
        System.out.println();

        // Testando a classe Carro
        Carro carro = new Carro("Fusca", "1980");
        carro.acelerar(60);
        carro.frear(30);
    }
}
