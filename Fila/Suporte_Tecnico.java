import java.util.PriorityQueue;

public class Suporte_Tecnico {
    private final PriorityQueue<Chamado> fila;

    public Suporte_Tecnico() {
        fila = new PriorityQueue<>((a, b) -> Integer.compare(a.getPrioridade(), b.getPrioridade()));
    }

    public void registrarChamado(String cliente, int prioridade) {
        fila.add(new Chamado(cliente, prioridade));
        System.out.println("Chamado registrado: Cliente " + cliente + " com prioridade " + prioridade);
    }

    public void processarChamado() {
        if (!fila.isEmpty()) {
            Chamado chamado = fila.poll();
            System.out.println("Atendendo chamado: Cliente " + chamado.getCliente() + " com prioridade " + chamado.getPrioridade());
        } else {
            System.out.println("Nenhum chamado na fila.");
        }
    }

    private static class Chamado {
        private final String cliente;
        private final int prioridade;

        public Chamado(String cliente, int prioridade) {
            this.cliente = cliente;
            this.prioridade = prioridade;
        }

        public String getCliente() {
            return cliente;
        }

        public int getPrioridade() {
            return prioridade;
        }
    }

    public static void main(String[] args) {
        Suporte_Tecnico suporte = new Suporte_Tecnico();
        suporte.registrarChamado("Cliente1", 2);
        suporte.registrarChamado("Cliente2", 1);
        suporte.processarChamado();
        suporte.processarChamado();
        suporte.processarChamado();
    }
}
