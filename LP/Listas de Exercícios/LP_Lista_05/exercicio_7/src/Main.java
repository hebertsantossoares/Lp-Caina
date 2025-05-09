public class Main {
    public static void main(String[] args) {

        int[][] vetor = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        int maiorSomaLinha = 0, maiorSomaColuna = 0;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 5; ) {
                somaLinha += vetor[i][j];
                somaColuna += vetor[j][i];

            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha += somaLinha;
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaLinha += somaColuna;
            }
        }
        System.out.println("A maior soma das linhas e " + maiorSomaLinha + " A maior soma das colunas" + maiorSomaColuna);
    }
}
