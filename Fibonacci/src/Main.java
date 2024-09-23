import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (Fibonacciok(numero)) {
            System.out.println(numero + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO faz parte da sequência de Fibonacci.");
        }

        input.close();
    }
    //função(metodo)
    public static boolean Fibonacciok(int n) {
        // 0 e 1 fazem parte da sequência
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1;
        int fib = a + b;

        while (fib <= n) {
            if (fib == n) {
                return true; // Se encontrar o número na sequência
            }
            a = b;
            b = fib;
            fib = a + b; // Gera o próximo número na sequência
        }

        return false; // Se ultrapassar o número e não o encontrar
    }
}
