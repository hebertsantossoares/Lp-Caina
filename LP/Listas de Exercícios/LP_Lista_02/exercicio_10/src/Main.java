import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double miles, km;

        Scanner in = new Scanner(System.in);


        System.out.println("Digite uma distancia em Km: ");
        km = in.nextDouble();

        miles = km /1.6;
        System.out.printf(km = "km = "+ miles + "milhas");
    }
}