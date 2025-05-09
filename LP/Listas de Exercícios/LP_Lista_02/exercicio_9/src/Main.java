import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = scanner.nextDouble();

        double milhas = quilometros * 0.621371;

        System.out.printf("%.2f km equivalem a %.2f milhas.\n", quilometros, milhas);

        scanner.close();
    }
}
