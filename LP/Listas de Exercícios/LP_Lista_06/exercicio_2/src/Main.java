import java.util.Scanner;

public class Main {

    // Função para calcular o fatorial de N
    public static long calcularFatorial(int N) {
        long fatorial = 1;
        for (int i = 2; i <= N; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Leitura e validação do número
        do {
            System.out.print("Digite um número inteiro não negativo: ");
            N = scanner.nextInt();
            if (N < 0) {
                System.out.println("Erro: o número deve ser maior ou igual a 0.");
            }
        } while (N < 0);

        // Cálculo do fatorial
        long resultado = calcularFatorial(N);

        // Exibição do resultado
        System.out.println(N + "! = " + resultado);

        scanner.close();
    }
}
