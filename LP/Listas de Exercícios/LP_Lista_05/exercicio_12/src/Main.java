public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando a matriz 3x3
        int[][] matriz = {
                {2, 4, 1},
                {3, 1, 5},
                {7, 2, 6}
        };

        // Calculando a determinante
        int determinante =
                matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                        - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                        + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        // Exibindo o resultado
        System.out.println("Determinante da matriz: " + determinante);
    }
}
