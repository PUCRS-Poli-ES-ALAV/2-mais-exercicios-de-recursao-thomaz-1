import java.util.Scanner;

public class Ex2 {
    public static int somatorio(int n) { // Assinatura
        // Não há erros
        // Casos não recursivos
        if (n == 0) {
            return 0;
        }
        // Casos recursivos positivos
        if (n > 0) {
            return n + somatorio(n - 1);
        } else { // Casos recursivos negativos
            return n + somatorio(n + 1);            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para calcularmos seu somatório: ");
        int numero = in.nextInt();
        int resultado = somatorio(numero);
        System.out.printf("O somatório de 0 até %d é igual a: %d.\n", numero, resultado);
        in.close();
    }
}
