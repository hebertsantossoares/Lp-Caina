import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos três lados
        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        // Verificação da existência do triângulo
        if ((a < b + c && a > Math.abs(b - c)) &&
                (b < a + c && b > Math.abs(a - c)) &&
                (c < a + b && c > Math.abs(a - b))) {

            // Classificação do triângulo
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero: todos os lados são iguais.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles: dois lados são iguais.");
            } else {
                System.out.println("Triângulo Escaleno: todos os lados são diferentes.");
            }

        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}



