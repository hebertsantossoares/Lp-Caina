import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        number = in.nextInt();

        //for9declaraçao da variavel de controle ; teste logico ; incremento)
        for(int i=0; i<=10; i++) {
           System.out.println(number + " x "+ i + "=" + (i*number));
        }

    }
}