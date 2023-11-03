package P9;

import java.util.Random;
import java.util.Scanner;

public class kuis3 {
    public static void main(String[] args) {
        Random rend = new Random();
        Scanner sc05 = new Scanner(System.in);
        int benar, salah;

        while (true) {
            benar = rend.nextInt(7);
            System.out.print("masukkan angka keberuntungan (0-9) = ");
            salah = sc05.nextInt();
            if (benar == salah) {
                System.out.println("betulah");
                break;
            } else {
                System.out.println("zonk");
                if (salah > benar) {
                    System.out.println("angka terlalu besar");
                    break;
                }else {
                    System.out.println("angka terlalu kecil");
                }
                    
            }
        }
        sc05.close();
    }
}
