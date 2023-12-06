package P13;

import java.util.Scanner;

public class TugasArrayFungsi05 {
    public static int JumlahMahasiswa = 5;
    public static int JumlahMinggu = 7;
    public static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    public static int[][] nilaiMahasiswa = new int[JumlahMahasiswa][JumlahMinggu];

    static void inputData() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < JumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas " + namaMahasiswa[i]);
            for (int j = 0; j < JumlahMinggu; j++) {
                System.out.print("Minggu ke- " + (j + 1) + " : ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanNilai() {
        System.out.println("Nilai mahasiswa : ");
        System.out.println("Nama \t\t minggu 1 \t minggu 2 \t minggu 3 \t minggu 4 \t minggu 5 \t minggu 6 \t minggu 7");

        for (int i = 0; i < JumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + "\t\t");
            for (int j = 0; j < JumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    static void cariNilaiTertinggi() {
        int nilaiTertingggi = nilaiMahasiswa[0][0];
        int hariTertinggi = 0;

        for (int i = 0; i < JumlahMahasiswa; i++) {
            for (int j = 0; j < JumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertingggi) {
                    nilaiTertingggi = nilaiMahasiswa[i][j];
                    hariTertinggi = j + 1;
                }
            }
        }
        System.out.println("\nNilai tertinggi ditemukan pada minggu ke- " + hariTertinggi);
    }

    static void tampilkanMahasiswatertinggi() {
        int nilaiTertinggi = nilaiMahasiswa[0][0];
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < JumlahMahasiswa; i++) {
            for (int j = 0; j < JumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }
        System.out.println("\nMahasiswa dengan nilai tertinggi : ");
        System.out.println("Nama : " + namaMahasiswa[mahasiswaTertinggi]);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi + " (minggu ke- " + mingguTertinggi + ")");
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
        cariNilaiTertinggi();
        tampilkanMahasiswatertinggi();
    }
}
