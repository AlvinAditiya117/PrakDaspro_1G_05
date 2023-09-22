package P3.P4;

import java.util.Scanner;

public class Gaji05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk,totGaji;
        int gaji = 40000, potGaji = 25000;

        System.out.println("masukkan jumlah hari kerja anda");
        jmlMasuk=sc05.nextInt();
        System.out.println("masukkan jumlah hari tidak kerja anda");
        jmlTdkMasuk=sc05.nextInt();
        System.out.println("masukkan jumlah gaji");
        gaji=sc05.nextInt();
        System.out.println("masukkan jumlah potongan gaji");
        potGaji=sc05.nextInt();

        System.out.println("gaji yang anda terima adalah"+ potGaji);

    }
}
