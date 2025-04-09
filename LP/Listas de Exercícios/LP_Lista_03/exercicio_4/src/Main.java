import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, mean, recovery;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = in.nextDouble();

        mean = (n1 + n2)/2;
        System.out.println("media = " + mean);

        if(mean>=50){
            System.out.println("Aprovado");
        }else {
            System.out.println("Informe a nota da recuperação");
            recovery = in.nextDouble();


           mean = (mean + recovery)/2;

           if(mean>=50)
               System.out.println("Aprovado");
           else
               System.out.println("Repovado");
    }

    }
}

