import java.util.Stack;

public class Reserva_Assentos {
    private final Stack<Integer> assentosDisponiveis;

    public Reserva_Assentos(int totalAssentos) {
        assentosDisponiveis = new Stack<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentosDisponiveis.push(i);
        }
    }

    public Integer reservarAssento() {
        if (!assentosDisponiveis.isEmpty()) {
            return assentosDisponiveis.pop();
        } else {
            System.out.println("Nenhum assento disponível.");
            return null;
        }
    }

    public void liberarAssento(int assento) {
        assentosDisponiveis.push(assento);
    }

    public static void main(String[] args) {
        Reserva_Assentos teatro = new Reserva_Assentos(5);

        System.out.println("Assento reservado: " + teatro.reservarAssento());
        System.out.println("Assento reservado: " + teatro.reservarAssento());
        teatro.liberarAssento(2);
        System.out.println("Assento reservado: " + teatro.reservarAssento());
    }
}
