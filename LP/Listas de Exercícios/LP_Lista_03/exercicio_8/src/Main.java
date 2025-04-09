import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int numero;
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número inteiro: ");
                 numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }

                scanner.close();
            }
        }


