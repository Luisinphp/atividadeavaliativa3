import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[15];
        int maiorValor = Integer.MIN_VALUE;
        int indiceMaior = -1;

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();

            if (num[i] > maiorValor) {
                maiorValor = numeros[i];
                indiceMaior = i;
            }
        }

        System.out.println("O maior valor no vetor é: " + maiorValor);
        System.out.println("Ele está na posição (índice): " + indiceMaior);

        scanner.close();
    }
}