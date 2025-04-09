import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ms, kmh;
        Scanner scanner = new Scanner(System.in);

        // Entrada de velocidade em m/s
        System.out.print("Digite a velocidade em m/s: ");
        ms = scanner.nextDouble();

        // Conversão para km/h
        kmh = ms * 3.6;

        // Exibição do resultado
        System.out.println(ms + " m/s equivalem a " + kmh + " km/h");

        scanner.close();
    }
}