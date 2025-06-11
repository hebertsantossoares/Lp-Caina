import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Solicita ao usuário um número maior que 0
        do {
            System.out.print("Digite um número inteiro positivo (maior que 0): ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Erro: o número deve ser maior que 0.");
            }
        } while (N <= 0);

        // Calcula a soma de 1 até N usando a fórmula
        int soma = N * (N + 1) / 2;

        // Exibe o resultado
        System.out.println("A soma de 1 até " + N + " é: " + soma);

        scanner.close();
    }
}
