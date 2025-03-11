import java.util.Scanner;

public class Ex1 { // Método recursivo que calcula o fatorial de um número
    public static int fatorial(int n) { // Assinatura
        // Erro
        if (n < 0) {
            throw new IllegalArgumentException("Não há fatorial de números negativos");
        }
        // Casos não recursivos
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
        // Casos recursivos
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero para calcularmos seu fatorial: ");
        int numero = in.nextInt();
        int resultado = fatorial(numero);
        System.out.printf("O fatorial de %d é igual a %d. \n", numero, resultado);
        in.close();
    }
}
