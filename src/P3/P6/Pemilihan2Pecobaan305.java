package P3.P6;

import java.util.Scanner;

public class Pemilihan2Pecobaan305 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        System.out.print("Masukkan Kategori : ");
        kategori = sc05.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = sc05.nextInt();
    if (kategori.equalsIgnoreCase("pekerja")) {
    if (penghasilan <= 2000000)
        pajak = 0.1;
    else if (penghasilan <= 3000000)
        pajak = 0.15;
    else
        pajak = 0.2;

    }else if (kategori.equals("pebisnis")) {
    if (penghasilan <= 2500000)
        pajak = 0.15;
    else if (penghasilan <= 3500000)
        pajak = 0.2;
    else
        pajak = 0.25;

    }else
        System.out.println("Masukan Kategori Salah");  
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasil Bersih : " + gajiBersih);
    }
}

