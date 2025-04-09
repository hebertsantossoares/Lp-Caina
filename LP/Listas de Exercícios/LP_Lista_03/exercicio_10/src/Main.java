import java.util.Scanner;
import java.util.Arrays;

 public class Main {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);

        // Entrada dos três números
        System.out.print("Digite 3 numeros separados por espaço: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        if(n1>n2){
            if(n1>n3){
                if(n2>n3)
                    System.out.println("Ordenado: " + n3 + "," + n2 +","+ n1);
                else
                    System.out.println("Ordenado: " + n2 + "," + n3 +","+ n1);
            }else{
                System.out.println("Ordenado: " + n2 + "," + n1 +","+ n3);
            }
        }else{
            if(n2>n3){
                if(n3>n1)
                    System.out.println("Ordenado: " + n1 + "," + n3 +","+ n2);
                else
                    System.out.println("Ordenado: " + n3 + "," + n1 +","+ n2);
            }else{
                System.out.println("Ordenado: " + n1 + "," + n2 +","+ n3);
            }
        }
    }
}