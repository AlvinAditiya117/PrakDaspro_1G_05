package P11;

import java.util.Scanner;

public class Square05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner (System.in);

        System.out.print("masukkan nilai N : ");
        int N = sc05.nextInt();

        for (int j = 1; j <+N ; j++) {
            for (int i = 0; i <=N ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
