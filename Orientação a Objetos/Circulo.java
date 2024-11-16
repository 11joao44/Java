public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular a circunferência
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    // Método getter e setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
