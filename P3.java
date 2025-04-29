import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[20];
        int contadorPares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();

            if (num[i] % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("A quantidade de números pares no vetor é: " + contadorPares);
        scanner.close();
    }
}