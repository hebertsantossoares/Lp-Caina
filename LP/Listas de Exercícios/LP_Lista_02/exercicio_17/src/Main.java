import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialSpeed , acceleration,time,speed;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade iniacial;");
        initialSpeed = in.nextDouble();

        System.out.println("Digite a aceleração (m/s):;");
        acceleration = in.nextDouble();

        System.out.println("Digite o tempo(s);");
       time = in.nextDouble();

        System.out.println();
    }
}