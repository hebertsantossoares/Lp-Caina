import java.util.Scanner;

public class Main {

    // Função para verificar se a string é um palíndromo
    public static boolean ehPalindromo(String texto) {
        // Remove espaços e coloca em minúsculo
        texto = texto.replaceAll("[^a-z]", "").toLowerCase();

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da string
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        // Verificação
        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
