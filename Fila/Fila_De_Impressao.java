import java.util.LinkedList;
import java.util.Queue;

public class Fila_De_Impressao {
    private final Queue<String> fila;

    public Fila_De_Impressao() {
        fila = new LinkedList<>();
    }

    public void adicionarDocumento(String documento) {
        fila.add(documento);
        System.out.println("Documento adicionado à fila: " + documento);
    }

    public void processarDocumento() {
        if (!fila.isEmpty()) {
            String documento = fila.poll();
            System.out.println("Processando documento: " + documento);
        } else {
            System.out.println("Nenhum documento na fila.");
        }
    }

    public static void main(String[] args) {
        Fila_De_Impressao impressora = new Fila_De_Impressao();
        impressora.adicionarDocumento("Documento1.pdf");
        impressora.adicionarDocumento("Documento2.docx");
        impressora.processarDocumento();
        impressora.processarDocumento();
        impressora.processarDocumento();
    }
}
