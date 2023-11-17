package P11;

import java.util.Scanner;

public class SegitigaAngka05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan  nilai N : ");
        int N = sc05.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println();

        sc05.close();
    }
}
}