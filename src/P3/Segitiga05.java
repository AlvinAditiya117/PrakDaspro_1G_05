package P3;

import java.util.Scanner;

public class Segitiga05 {
    public static void main(String[] args) {
    Scanner sc05 = new Scanner(System.in);
    int alas, tinggi ;
    float luas ;
    System.out.print("Masukkan alas : ");
    alas = sc05.nextInt() ;
    System.out.print("Masukkan tinggi : ");
    tinggi = sc05.nextInt();
    luas = alas * tinggi / 2;
    System.out.println("Luas segitiga : " + luas);
    }
}
