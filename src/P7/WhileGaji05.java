package P7;

import java.util.Scanner;

public class WhileGaji05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc05.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
        System.out.println("Pilih jabatan - Direktur, Manajer, Karyawan");
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
        jabatan = sc05.next();
        System.out.print("Masukkan jumlah jam lembur: ");
        jumlahJamLembur= sc05.nextInt();
 
        if (jabatan.equalsIgnoreCase("direktur")) {
            i++; continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) {
            gajiLembur = jumlahJamLembur * 100000;
        } else if (jabatan.equalsIgnoreCase("karyawan")){ 
            gajiLembur = jumlahJamLembur * 75000; 
        } 
        else
            {System.out.println("Jabatan invalid"); continue ; }
           i++;
        totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur :" + totalGajiLembur);
    }
}
