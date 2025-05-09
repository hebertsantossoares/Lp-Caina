public class Main {
    public static void main(String[] args) {
        int []v1 = {0,1,2,3,4,5,6,7,8,9};
        int []v2 = new int[10];

        for (int i=0;i<v1.length;i++)
            v2[9-i]=v1[i];

        for (int n:v1)
          System.out.print(n + " ");

        System.out.println();

        for (int n:v2)
            System.out.print(n + " ");
    }
}