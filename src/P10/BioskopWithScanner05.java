package P10;

import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        boolean lanjut = true;

        String[][] penonton = new String[][] {{"***","***"},{"***","***"},{"***","***"},{"***","***"},};

        while (lanjut) {      
            System.out.println("==========[ MENU BIOSKOP ]==========");
            System.out.println("|| 1. input data penonton         ||");
            System.out.println("|| 2. tampilan data penonton      ||");
            System.out.println("|| 3. exit                        ||");
            System.out.println("====================================");
            System.out.print("pilih menu => ");
            menu = sc05.nextInt();
            sc05.nextLine();

            switch (menu) {
                case 1:

                    int counter = 0;

                    while (true && counter < penonton.length) {
                        counter++;
                        System.out.print("masukkan nama : ");
                        nama = sc05.nextLine();
                        boolean case1 = false ;

                        do {
                        do {
                            System.out.print("masukkan baris : ");
                            baris = sc05.nextInt();
                            if (baris > penonton.length)
                                System.out.print("inputan melebihi jumlah baris");
                        }

                        while (baris > penonton.length);

                        do {
                            System.out.print("masukkan kolom : ");
                            kolom = sc05.nextInt();
                            sc05.nextLine();
                            if (kolom > penonton[0].length) {
                                System.out.println("input melebihi jumlah kolom");
                                
                            }
                        } while (kolom > penonton[0].length);
                        if (penonton[baris - 1][kolom - 1] != "***") {
                            System.out.println("warning!!! kursi sudah ditempati, pilih kursi lain ;) ");
                            }
                        }while (penonton[baris - 1][kolom - 1] != "***");

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("input penonyon lainnya? (y/n) : ");
                        next = sc05.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:

                    System.out.println();
                    System.out.println("kursi");

                    for (int i = 0; i < penonton.length; i++) {
                        System.out
                                .println("kursi penonton baris ke- " + (i + 1) + " : " + String.join(",", penonton[i]));
                    }
                    System.out.println("======================");
                    break;

                case 3:

                    System.out.println("==========[ THANK YOU ]==========");
                    lanjut = false;
                    break;
            }
        }
    }
}
