import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[12]; 
        int soma = 0;
        
        System.out.println("Digite 12 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / num.length;
        int contadorMaiores = 0;
        for (int numero : num) {
            if (numero > media) {
                contadorMaiores++;
            }
        }
        System.out.printf("A média dos valores é: %.2f%n", media);
        System.out.println("Quantidade de elementos maiores que a média: " + contadorMaiores);

        scanner.close();
    }
}