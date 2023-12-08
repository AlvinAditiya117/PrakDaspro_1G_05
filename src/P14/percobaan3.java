package P14;

import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(int saldo,int tahun) {
        if (tahun == 0) {
            return (1);
        }else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int saldoAwal, tahun ;
        System.out.print("jumlah saldo awal : ");
        saldoAwal = sc05.nextInt();
        System.out.print("lamanya investasi (tahun) : ");
        tahun = sc05.nextInt();

        System.out.print("jumlah saldo setelah " +tahun+"tahun : " );
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
