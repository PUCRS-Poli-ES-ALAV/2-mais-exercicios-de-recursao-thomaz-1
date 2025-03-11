import java.util.Scanner;

public class Ex3 {
    public static int fibonacci(int n) { // Assinatura
        // Erro
        if(n < 0) {
            throw new IllegalArgumentException("Não há Fibonacci de números negativos.");
        }
        // Casos não recursivos
        if(n < 2) {
            return n;
        }
        else { // Casos não recursivos
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para calcularmos seu Fibonacci: ");
        int numero = in.nextInt();
        int resultado = fibonacci(numero);
        System.out.printf("O Fibonacci de %d é igual a %d. \n", numero, resultado);
        in.close();
    }
}
