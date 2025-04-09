import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmh, ms;
        Scanner scanner = new Scanner(System.in);

        // Entrada de velocidade em km/h
        System.out.print("Digite a velocidade em km/h: ");
        kmh = scanner.nextDouble();

        // Conversão para m/s
        ms = kmh / 3.6;

        // Exibição do resultado
        System.out.println(kmh + " km/h equivalem a " + ms + " m/s");

        scanner.close();
    }
}