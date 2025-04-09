import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota (N1): ");
        n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (N2): ");
        n2 = scanner.nextDouble();

        // Cálculo da média
        media = (n1 + n2) / 2;

        // Exibição da média
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}