import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double c,f;

        Scanner in = new Scanner(System.in);

        System.out.println("digite a temperatura em C: ");
        c = in.nextDouble();
         f = c * 180 / 100 + 32;
         System.out.printf(c + "c " + f + "f ");
    }
}