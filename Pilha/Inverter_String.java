import java.util.Stack;

public class Inverter_String {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String invertida = inverterString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }

    public static String inverterString(String s) {
        Stack<Character> pilha = new Stack<>();
        for (char c : s.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        return invertida.toString();
    }
}
