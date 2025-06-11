import java.util.Scanner;

public class Main {

    // Função para calcular a potência x^y sem usar Math.pow
    public static long calcularPotencia(int x, int y) {
        long resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        // Leitura da base
        System.out.print("Digite a base (x): ");
        x = scanner.nextInt();

        // Leitura e validação do expoente
        do {
            System.out.print("Digite o expoente (y ≥ 0): ");
            y = scanner.nextInt();
            if (y < 0) {
                System.out.println("Erro: o expoente deve ser maior ou igual a 0.");
            }
        } while (y < 0);

        // Cálculo e exibição do resultado
        long resultado = calcularPotencia(x, y);
        System.out.println(x + " ^ " + y + " é: " + resultado);

        scanner.close();
    }
}
