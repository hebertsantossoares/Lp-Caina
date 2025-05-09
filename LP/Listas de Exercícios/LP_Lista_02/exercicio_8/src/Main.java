import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double polegadas = scanner.nextDouble();

        double milimetros = polegadas * 25.4;

        System.out.printf("%.2f polegadas equivalem a %.2f milímetros.\n", polegadas, milimetros);

        scanner.close();
    }
}
