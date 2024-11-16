import java.util.LinkedList;
import java.util.Queue;

public class Gerenciamento_Fila_Parque {
    private final Queue<String> fila;

    public Gerenciamento_Fila_Parque() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(String cliente, String tipoIngresso) {
        fila.add(cliente + " (" + tipoIngresso + ")");
        System.out.println("Cliente adicionado à fila: " + cliente + " com ingresso " + tipoIngresso);
    }

    public void processarCliente() {
        if (!fila.isEmpty()) {
            String cliente = fila.poll();
            System.out.println("Liberando entrada para: " + cliente);
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public static void main(String[] args) {
        Gerenciamento_Fila_Parque parque = new Gerenciamento_Fila_Parque();
        parque.adicionarCliente("Cliente1", "VIP");
        parque.adicionarCliente("Cliente2", "Normal");
        parque.processarCliente();
        parque.processarCliente();
        parque.processarCliente();
    }
}
