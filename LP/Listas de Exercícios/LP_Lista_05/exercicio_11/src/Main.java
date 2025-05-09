import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita tamanho da primeira matriz (A)
        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = sc.nextInt();

        // Solicita tamanho da segunda matriz (B)
        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = sc.nextInt();

        // Validação da possibilidade de multiplicação
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar: o número de colunas de A deve ser igual ao número de linhas de B.");
            return;
        }

        // Declara matrizes
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB]; // matriz resultado

        // Lê os valores da matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        // Lê os valores da matriz B
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = sc.nextInt();
            }
        }

        // Multiplicação das matrizes
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibe a matriz produto
        System.out.println("Matriz produto (C = A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
