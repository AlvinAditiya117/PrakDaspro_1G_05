package P14;

import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
    Scanner sc05 = new Scanner(System.in);
    System.out.print("masukkan nilai f : ");
    int f = sc05.nextInt();
    int hasil = jumlahkanBilangan(f);
    System.out.print("menjumlahkan bilangan awal 1 sampai "+f+" adalah "+hasil);
    sc05.close();
    }
    public static int jumlahkanBilangan(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n + jumlahkanBilangan(n - 1);
        }
    }
}
