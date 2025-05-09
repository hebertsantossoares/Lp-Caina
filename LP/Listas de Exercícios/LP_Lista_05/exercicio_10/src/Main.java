public class Main {
    public static void main(String[] args) {
        // Matriz A (3x2)
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Matriz B (2x2)
        int[][] B = {
                {7, 8},
                {9, 10}
        };

        // Matriz C (3x2) - resultado do produto A x B
        int[][] C = new int[3][2];

        // Calcula o produto das matrizes A x B
        for (int i = 0; i < 3; i++) {        // linhas de A
            for (int j = 0; j < 2; j++) {    // colunas de B
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {  // colunas de A / linhas de B
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibe o resultado
        System.out.println("Matriz produto (C = A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
