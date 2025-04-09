import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero,dobro;
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número inteiro: ");
         numero = scanner.nextInt();

        // Cálculo do dobro
         dobro = numero * 2;

        // Saída do resultado
        System.out.println("O dobro de " + numero + " é " + dobro);

        scanner.close();
    }
}