import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = milhas * 1.60934;

        System.out.printf("%.2f milhas equivalem a %.2f quilômetros.\n", milhas, quilometros);

        scanner.close();
    }
}
