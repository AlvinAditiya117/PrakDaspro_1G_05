package P3.P6;

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
    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
        System.out.println("Segitiga tersebut adalah segitiga siku-siku");              
    else
        System.out.println("Segitiga tersebut adalah segitiga sembarang");
}   else
        System.out.println("Bukan Segitiga");
    }
}

