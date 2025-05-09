public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor com 10 valores
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Vetor em ordem inversa:");

        // Imprime os elementos do vetor de trás para frente
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
