import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (i == 0) {
                // Define o primeiro número como referência para maior e menor
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        System.out.println("\nMaior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}
