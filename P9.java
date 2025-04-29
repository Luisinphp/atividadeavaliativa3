import java.util.Scanner;
import java.util.ArrayList;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VA = new int[6];
        int[] VB = new int[6];
        ArrayList<Integer> VC = new ArrayList<>();

        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < VA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            VA[i] = scanner.nextInt();
        }
        System.out.println("Digite 6 números para o vetor B:");
        for (int i = 0; i < VB.length; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            VB[i] = scanner.nextInt();
        }
        for (int i = 0; i < VA.length; i++) {
            for (int j = 0; j < VB.length; j++) {
                if (VA[i] == VB[j] && !VC.contains(VA[i])) {
                    VC.add(VA[i]); 
                }
            }
        }
        System.out.println("Elementos comuns aos dois vetores:");
        if (VC.isEmpty()) {
            System.out.println("Nenhum elemento comum encontrado.");
        } else {
            for (int elemento : VC) {
                System.out.print(elemento + " ");
            }
        }

        scanner.close();
    }
}