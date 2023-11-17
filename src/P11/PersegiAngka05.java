package P11;

import java.util.Scanner;

public class PersegiAngka05 {

    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc06.nextInt();

        int baris[] = new int[N];
        int kolom[] = new int[N];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 | i == N) {
                    System.out.print(N + " ");
                } else if (j == 1 | j == N) {
                    System.out.print(N + " ");
                } else if (N < 10) {
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}