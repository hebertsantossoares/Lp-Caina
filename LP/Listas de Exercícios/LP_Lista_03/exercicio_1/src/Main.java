import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, sqrt;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        n1 = in.nextDouble();

        if(n1>=0) {
            sqrt = Math.sqrt(n1);
            System.out.println("A raiz é : " +  Math.sqrt(n1));
        }else{
                System.out.println("Valor invalido");


        }
    }
}