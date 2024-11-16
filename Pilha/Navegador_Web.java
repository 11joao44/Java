import java.util.Stack;

public class Navegador_Web {
    private final Stack<String> historico;
    private final Stack<String> avancos;
    
    public Navegador_Web() {
        historico = new Stack<>();
        avancos = new Stack<>();
    }

    public void visitarPagina(String url) {
        if (!historico.isEmpty()) {
            avancos.clear(); // Limpa a pilha de avanços quando uma nova página é visitada
        }
        historico.push(url);
        System.out.println("Visitando: " + url);
    }

    public void voltar() {
        if (historico.size() > 1) {
            avancos.push(historico.pop());
            System.out.println("Voltando para: " + historico.peek());
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void avancar() {
        if (!avancos.isEmpty()) {
            String url = avancos.pop();
            historico.push(url);
            System.out.println("Avançando para: " + url);
        } else {
            System.out.println("Não há páginas para avançar.");
        }
    }

    public static void main(String[] args) {
        Navegador_Web navegador = new Navegador_Web();
        navegador.visitarPagina("google.com");
        navegador.visitarPagina("yahoo.com");
        navegador.voltar();
        navegador.avancar();
        navegador.visitarPagina("bing.com");
        navegador.voltar();
    }
}
