import java.util.Scanner;
public class ContarOcorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] V = new int[15]; 

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i <  V.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            V[i] = scanner.nextInt();
        }
        System.out.print("Digite o número que deseja contar no vetor: ");
        int numeroParaContar = scanner.nextInt();
        
        int contador = 0;
        for (int numero : vetor) {
            if (numero == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}