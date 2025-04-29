public class P1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;

        for (int numero : num) {
            soma += numero;
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}