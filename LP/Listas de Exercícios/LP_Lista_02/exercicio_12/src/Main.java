import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double score1,score2,mean;
        Scanner in = new Scanner(System.in);


        System.out.println("informe a primeira nota: ");
        score1 = in.nextDouble();

        System.out.println("informe a segunda nota: ");
        score2 = in.nextDouble();

        mean = (score1 + score2*score2)/3;
        System.out.println("media = "+ mean);
    }
}