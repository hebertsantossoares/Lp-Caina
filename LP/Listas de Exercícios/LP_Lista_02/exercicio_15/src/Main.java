import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius, height, volume,area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio da base do cilindro:");
        radius = in.nextDouble();

        area = Math.PI * Math.pow(radius,2);

        System.out.println("Digite a autura do cilindro:");
        height= in.nextDouble();

        volume = area * height;
        System.out.println("Volume =" + volume);
    }
}