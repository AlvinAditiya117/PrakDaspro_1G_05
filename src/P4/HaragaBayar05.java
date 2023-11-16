package P4;

import java.util.Scanner;

public class HaragaBayar05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner (System.in);

        int harga,jumlah,jmlHalBuku;
        double dis = 0.1, total, bayar, jmlDis;
        String merek;


        System.out.println("masukkan harga yang dibeli");
        harga=sc05.nextInt();
        System.out.println("masukkan jumlah jumlah barang yang dibeli");
        jumlah=sc05.nextInt();
        System.out.println("merek buku yang dibeli");
        merek=sc05.nextLine();
        System.out.println("jumlah halaman buku");
        jmlHalBuku=sc05.nextInt();
        System.out.println("besar diskon yang diperoleh");
        dis=sc05.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("diskon yang anda dapatkan adalah"+ jmlDis);
        System.out.println("jumlah yang harus dibayar adalah"+ bayar);
    }
    
}
