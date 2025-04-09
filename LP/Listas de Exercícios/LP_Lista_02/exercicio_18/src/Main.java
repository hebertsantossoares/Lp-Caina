import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double a,b,x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente angular;");
        a = in.nextDouble();

        System.out.println("Digite o valor do coeficiente linear;");
        b = in.nextDouble();

        System.out.println(a + "x" + "+" + b + " =0");
        x = -b/a;
        System.out.println("x = " + x);


    }
}