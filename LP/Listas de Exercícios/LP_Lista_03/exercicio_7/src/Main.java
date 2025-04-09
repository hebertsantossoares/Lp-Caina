import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;

        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
         a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
         b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
         c = scanner.nextDouble();

        // Verifica se é uma equação do 2º grau
        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau (a deve ser diferente de 0).");
        } else {
             delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                 x1 = (-b + Math.sqrt(delta)) / (2 * a);
                 x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("As raízes da equação são:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        scanner.close();
    }
}
