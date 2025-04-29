import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VA = new int[5];
        int[] VB = new int[5];
        int[] VC = new int[10];

        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < VA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            VA[i] = scanner.nextInt();
        }
        System.out.println("Digite 5 números para o vetor B:");
        for (int i = 0; i < VB.length; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            VB[i] = scanner.nextInt();
        }
        for (int i = 0; i < VA.length; i++) {
            VC[i] = VA[i];
        }
        for (int i = 0; i < VB.length; i++) {
            VC[VA.length + i] = VB[i];
        }
        System.out.println("Vetor C (união de A e B):");
        for (int i = 0; i < VC.length; i++) {
            System.out.print(VC[i] + " ");
        }

        scanner.close();
    }
}