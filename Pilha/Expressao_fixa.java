import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Expressao_fixa {
    private static final Map<Character, Integer> precedencia = new HashMap<>();
    
    static {
        precedencia.put('+', 1);
        precedencia.put('-', 1);
        precedencia.put('*', 2);
        precedencia.put('/', 2);
    }

    public static void main(String[] args) {
        String infixa = "3+4*2/(1-5)";
        String posfixa = infixaParaPosfixa(infixa);
        System.out.println("Infixa: " + infixa);
        System.out.println("Pós-fixa: " + posfixa);
    }

    public static String infixaParaPosfixa(String infixa) {
        Stack<Character> operadores = new Stack<>();
        StringBuilder posfixa = new StringBuilder();

        for (char c : infixa.toCharArray()) {
            if (Character.isDigit(c)) {
                posfixa.append(c);
            } else if (c == '(') {
                operadores.push(c);
            } else if (c == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    posfixa.append(operadores.pop());
                }
                operadores.pop();
            } else {
                while (!operadores.isEmpty() && precedencia.getOrDefault(c, 0) <= precedencia.getOrDefault(operadores.peek(), 0)) {
                    posfixa.append(operadores.pop());
                }
                operadores.push(c);
            }
        }

        while (!operadores.isEmpty()) {
            posfixa.append(operadores.pop());
        }

        return posfixa.toString();
    }
}
