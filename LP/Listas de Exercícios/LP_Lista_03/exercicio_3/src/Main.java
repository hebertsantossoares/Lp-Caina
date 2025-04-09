import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score1,score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        score1 = in.nextInt();

        System.out.println("Digite a segunda nota: ");
        score2 = in.nextInt();

        mean = (score1 + score2)/2;
        System.out.println("media = " + mean);

        if (mean >=50) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }


    }
}