public class Main {
    public static void main(String[] args) {
        // Declara e inicializa a matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calcula o determinante pela Regra de Sarrus
        int determinante =
                matriz[0][0] * matriz[1][1] * matriz[2][2]
                        + matriz[0][1] * matriz[1][2] * matriz[2][0]
                        + matriz[0][2] * matriz[1][0] * matriz[2][1]
                        - matriz[0][2] * matriz[1][1] * matriz[2][0]
                        - matriz[0][0] * matriz[1][2] * matriz[2][1]
                        - matriz[0][1] * matriz[1][0] * matriz[2][2];

        // Exibe a matriz e o determinante
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Determinante: " + determinante);
    }
}
