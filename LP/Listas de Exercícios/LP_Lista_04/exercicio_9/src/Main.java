import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente;

        do {
            System.out.println("Bem-vindo ao Jogo da Tabuada!");
            boolean jogadorPerdeu = false;

            // Tabuada do 1 ao 10
            for (int multiplicador = 1; multiplicador <= 10 && !jogadorPerdeu; multiplicador++) {
                for (int multiplicando = 1; multiplicando <= 10 && !jogadorPerdeu; multiplicando++) {
                    int resultadoCorreto = multiplicador * multiplicando;

                    System.out.print("Quanto é " + multiplicador + " x " + multiplicando + "? ");
                    int resposta = scanner.nextInt();

                    if (resposta == resultadoCorreto) {
                        System.out.println("Correto!\n");
                    } else {
                        System.out.println("Errado! A resposta certa era " + resultadoCorreto + ".");
                        jogadorPerdeu = true;
                    }
                }
            }

            if (!jogadorPerdeu) {
                System.out.println("Parabéns! Você completou toda a tabuada sem erros!");
            } else {
                System.out.println("Você perdeu! Boa sorte na próxima.");
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            jogarNovamente = (resposta == 's');

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}
