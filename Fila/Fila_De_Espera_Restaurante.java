import java.util.LinkedList;
import java.util.Queue;

public class Fila_De_Espera_Restaurante {
    private final Queue<String> fila;

    public Fila_De_Espera_Restaurante() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(String cliente) {
        fila.add(cliente);
        System.out.println("Cliente adicionado à fila: " + cliente);
    }

    public void chamarCliente() {
        if (!fila.isEmpty()) {
            String cliente = fila.poll();
            System.out.println("Chamando cliente para mesa: " + cliente);
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public static void main(String[] args) {
        Fila_De_Espera_Restaurante restaurante = new Fila_De_Espera_Restaurante();
        restaurante.adicionarCliente("Cliente1");
        restaurante.adicionarCliente("Cliente2");
        restaurante.chamarCliente();
        restaurante.chamarCliente();
        restaurante.chamarCliente();
    }
}
