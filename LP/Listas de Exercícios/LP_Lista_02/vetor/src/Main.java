public class Main {
    public static void main(String[] args) {
        //declaração sem inicialização
        int[] vetor = new int[5];


        //declaração com inicialização
        int[] numbers = {2, 5, 6, 4, 8, 9};

        //for convencional para percorrer o vetor
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
        }
        // System.out.println("----------------------");

        // foreath (ou for
       /* for(int n:numbers)
            System.out.println(n);*/

        //declaração com inicialização
        int[][] matriz = {{1, 3},
                {4, 6},
                {7, 9}};

        //printar todos os valores da matrix
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j] + "\t ");
            }
            System.out.println();
        }
        for (int[] linha : matriz) {
            System.out.println(valor + "\t");
            }


            {
                System.out.println();
            }
        }
    }