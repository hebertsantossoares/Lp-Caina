import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero, quintaParte;
        Scanner scanner = new Scanner(System.in);

        // Entrada do número real
        System.out.print("Digite um número real: ");
        numero = scanner.nextDouble();

        // Cálculo da quinta parte
        quintaParte = numero / 5;

        // Exibição do resultado
        System.out.println("A quinta parte de " + numero + " é " + quintaParte);

        scanner.close();
    }
}