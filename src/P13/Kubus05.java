package P13;

import java.util.Scanner;

public class Kubus05 {
    public static int hitungVol(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V, LP;
        System.out.print("masukan panjang sisi kubus : ");
        int sisi = input.nextInt();
        V = hitungVol(sisi);
        System.out.println("volume kubusnya adalah : "+V);
        LP = hitungLuasPermukaan(sisi);
        System.out.println("luas permukaan kubusnya adalah : "+LP);
    }
}
