import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da compra
        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = scanner.nextInt();
        System.out.println("----------------------------------");

        double valorFinal = valorCompra;

        switch (formaPagamento) {
            case 1:
                System.out.println("Débito Selecionado");
                valorFinal = valorCompra * 0.95;
                break;

            case 2:
                System.out.println("Pix Selecionado");
                valorFinal = valorCompra * 0.90;
                break;

            case 3:
                System.out.println("Crédito Selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas (até 10x): ");
                int parcelas = scanner.nextInt();

                if (parcelas < 1 || parcelas > 10) {
                    System.out.println("Número de parcelas inválido. Escolha entre 1 e 10.");
                    scanner.close();
                    return;
                }

                if (parcelas <= 4) {
                    valorFinal = valorCompra * 1.02;
                } else {
                    valorFinal = valorCompra * 1.05;
                }
                break;

            default:
                System.out.println("Forma de pagamento inválida.");
                scanner.close();
                return;
        }

        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}