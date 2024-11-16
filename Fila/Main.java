public class Main {
    public static void main(String[] args) {
        // Testando a Fila de Impressão
        System.out.println("Fila de Impressão:");
        Fila_De_Impressao impressora = new Fila_De_Impressao();
        impressora.adicionarDocumento("Documento1.pdf");
        impressora.adicionarDocumento("Documento2.docx");
        impressora.processarDocumento();
        impressora.processarDocumento();
        impressora.processarDocumento();
        System.out.println();

        // Testando a Fila de Atendimento
        System.out.println("Fila de Atendimento:");
        Fila_De_Atendimento banco = new Fila_De_Atendimento();
        banco.entrarNaFila("Cliente1");
        banco.entrarNaFila("Cliente2");
        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente();
        System.out.println();

        // Testando a Fila de Espera no Restaurante
        System.out.println("Fila de Espera no Restaurante:");
        Fila_De_Espera_Restaurante restaurante = new Fila_De_Espera_Restaurante();
        restaurante.adicionarCliente("Cliente1");
        restaurante.adicionarCliente("Cliente2");
        restaurante.chamarCliente();
        restaurante.chamarCliente();
        restaurante.chamarCliente();
        System.out.println();

        // Testando o Suporte Técnico
        System.out.println("Suporte Técnico:");
        Suporte_Tecnico suporte = new Suporte_Tecnico();
        suporte.registrarChamado("Cliente1", 2);
        suporte.registrarChamado("Cliente2", 1);
        suporte.processarChamado();
        suporte.processarChamado();
        suporte.processarChamado();
        System.out.println();

        // Testando o Gerenciamento de Fila no Parque
        System.out.println("Gerenciamento de Fila no Parque:");
        Gerenciamento_Fila_Parque parque = new Gerenciamento_Fila_Parque();
        parque.adicionarCliente("Cliente1", "VIP");
        parque.adicionarCliente("Cliente2", "Normal");
        parque.processarCliente();
        parque.processarCliente();
        parque.processarCliente();
    }
}
