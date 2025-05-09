import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [10];
        int minor=Integer.MAX_VALUE, major=Integer.MIN_VALUE, minorIndex=-1, majorIndex=-1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros separados por espaço: ");

        for (int i=0;i<array.length;i++)
            array[i] = in.nextInt();

         for (int i=0;i<array.length;i++) {
             if (array[i] > major) {
                 major = array[i];
                 majorIndex = i;
             }
             if (array[i] < minor) {
                 minor = array[i];
                 minorIndex = i;

             }
         }
         System.out.println("Maior valor = " + major + " Posição = " + majorIndex);
         System.out.println("Menor valor = " + major + " Posição = " + minorIndex);

    }
}