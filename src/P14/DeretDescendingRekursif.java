package P14;

import java.util.Scanner;

public class DeretDescendingRekursif {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("masukan nilai n : ");
        int n = sc05.nextInt();
        System.out.println("deret descending dengan rekursif : ");
        DeretDescendingRekursif(n);
        System.out.println("deret descending dengan interaktif : ");
        DeretDescendingInteratid(n);
        sc05.close();
    }
    public static void DeretDescendingRekursif(int n) {
        if (n >= 0) {
        System.out.print((n + " "));
        DeretDescendingRekursif(n - 1);
        }
    }
    public static void DeretDescendingInteratid(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}