import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double mm, inch;

        Scanner in = new Scanner(System.in);


        System.out.println("Digite uma media em mm: ");
        mm = in.nextDouble();
         inch = mm / 25.4;
        System.out.println("Digite uma media em mm: ");
    }
}