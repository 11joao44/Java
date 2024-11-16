import java.util.Stack;

public class Lista_De_Tarefas {
    private final Stack<String> tarefas;

    public Lista_De_Tarefas() {
        tarefas = new Stack<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.push(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    public void removerTarefa() {
        if (!tarefas.isEmpty()) {
            System.out.println("Tarefa removida: " + tarefas.pop());
        } else {
            System.out.println("Nenhuma tarefa para remover.");
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public static void main(String[] args) {
        Lista_De_Tarefas lista = new Lista_De_Tarefas();
        lista.adicionarTarefa("Comprar leite");
        lista.adicionarTarefa("Estudar Java");
        lista.listarTarefas();
        lista.removerTarefa();
        lista.listarTarefas();
    }
}
