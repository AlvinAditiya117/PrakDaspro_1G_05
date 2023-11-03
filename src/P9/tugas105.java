package P9;

import java.util.Scanner;

public class tugas105 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.println("masukkan banyakknya elemen :");
        int jumlahElemen = sc05.nextInt();

        int[] nilai = new int[jumlahElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("masukkan elemen ke- "+(i+1)+" : ");
            nilai[i] = sc05.nextInt();
        }

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int nilaiRata2 = nilai[0];

        for (int i = 0; i < jumlahElemen; i++) {
            if (nilai[i] > nilaiTertinggi) {
               nilaiTertinggi = nilai[i]; 
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            nilaiRata2 += nilai[i];
        }
        double rata = nilaiRata2 / jumlahElemen;

        System.out.println("nilai tertinggi : "+nilaiTertinggi);
        System.out.println("nilai terendah :"+nilaiTerendah);
        System.out.println("nilai rata rata : "+nilaiRata2);
    }
}
