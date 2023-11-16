package P6;

import java.util.Scanner;

public class Pemilihan2Perrcobaan205 {
     public static void main(String[] args) {
        int sudut1, sudut2, sudut3, totalSudut;
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = sc05.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = sc05.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = sc05.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;
    if (totalSudut == 180) {
    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
        System.out.println("segitiga siku-siku");
    }else if ((sudut1 == sudut2 && sudut2 == sudut3)) {
        System.out.println("segitiga sama sisi");
    }else if ((sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3)) {
        System.out.println("segitiga sama sisi");
    }else
        System.out.println("segitiga sembarang");
    }else
        System.out.println("Bukan Segitiga");
    }
}

