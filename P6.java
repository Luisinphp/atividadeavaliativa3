import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] V = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < V.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            V[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < V.length; i++) {
            if (V[i] == numeroParaRemover && !encontrado) {
                encontrado = true;
                for (int j = i; j < V.length - 1; j++) {
                    V[j] = V[j + 1];
                }
                V[V.length - 1] = 0; 
                break;
            }
        }

        if (encontrado) {
            System.out.println("Vetor resultante após a remoção:");
            for (int i = 0; i < V.length; i++) {
                System.out.print(V[i] + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }

        scanner.close();
    }
}