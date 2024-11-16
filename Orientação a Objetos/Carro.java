public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }

    // Método para acelerar
    public void acelerar(int aumento) {
        if (aumento > 0) {
            velocidade += aumento;
            System.out.println("Acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("Aumento inválido.");
        }
    }

    // Método para frear
    public void frear(int reducao) {
        if (reducao > 0 && velocidade - reducao >= 0) {
            velocidade -= reducao;
            System.out.println("Freou para " + velocidade + " km/h.");
        } else {
            System.out.println("Redução inválida ou velocidade insuficiente.");
        }
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
