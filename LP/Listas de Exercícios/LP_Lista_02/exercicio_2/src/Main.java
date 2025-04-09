import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, quadrado;
        Scanner scanner = new Scanner(System.in);


        // Entrada do número
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        // Cálculo do quadrado
        quadrado = numero * numero;

        // Saída do resultado
        System.out.println("O quadrado de " + numero + " é " + quadrado);

        scanner.close();
    }
}