import java.util.LinkedList;
import java.util.Queue;

public class Fila_De_Atendimento {
    private final Queue<String> fila;

    public Fila_De_Atendimento() {
        fila = new LinkedList<>();
    }

    public void entrarNaFila(String cliente) {
        fila.add(cliente);
        System.out.println("Cliente entrou na fila: " + cliente);
    }

    public void atenderCliente() {
        if (!fila.isEmpty()) {
            String cliente = fila.poll();
            System.out.println("Atendendo cliente: " + cliente);
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public static void main(String[] args) {
        Fila_De_Atendimento banco = new Fila_De_Atendimento();
        banco.entrarNaFila("Cliente1");
        banco.entrarNaFila("Cliente2");
        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente();
    }
}
