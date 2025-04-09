import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("  1. Círculo");
        System.out.println("  2. Triângulo Retângulo");
        System.out.println("  3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        System.out.println("--------------------------");

        switch (opcao) {
            case 1:
                // Círculo
                System.out.print("Informe o raio: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.printf("Área = %.2f%n", areaCirculo);
                System.out.printf("Perímetro = %.2f%n", perimetroCirculo);
                break;

            case 2:
                // Triângulo Retângulo
                System.out.print("Informe a base: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaTri = scanner.nextDouble();
                double areaTri = (baseTri * alturaTri) / 2;
                double hipotenusa = Math.sqrt(baseTri * baseTri + alturaTri * alturaTri);
                double perimetroTri = baseTri + alturaTri + hipotenusa;
                System.out.printf("Área = %.2f%n", areaTri);
                System.out.printf("Perímetro = %.2f%n", perimetroTri);
                break;

            case 3:
                // Retângulo
                System.out.print("Informe a base: ");
                double baseRet = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRet = scanner.nextDouble();
                double areaRet = baseRet * alturaRet;
                double perimetroRet = 2 * (baseRet + alturaRet);
                System.out.printf("Área = %.2f%n", areaRet);
                System.out.printf("Perímetro = %.2f%n", perimetroRet);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}