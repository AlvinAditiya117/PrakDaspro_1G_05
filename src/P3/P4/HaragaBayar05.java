package P3.P4;

import java.util.Scanner;

public class HaragaBayar05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner (System.in);

        int harga,jumlah,jmlHalBuku;
        double dis = 0.1, total, bayar, jmlDis;

        System.out.println("masukkan harga yang dibeli");
        harga=sc05.nextInt();
        System.out.println("masukkan jumlah jumlah barang yang dibeli");
        jumlah=sc05.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("diskon yang anda dapatkan adalah"+ jmlDis);
        System.out.println("jumlah yang harus dibayar adalah"+ bayar);
    }
    
}
