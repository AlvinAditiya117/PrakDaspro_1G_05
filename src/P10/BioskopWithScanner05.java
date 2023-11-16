package P10;

import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        boolean lanjut = true;

        String[][] penonton = new String[4][2];

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

                    while (true) {
                        System.out.print("masukan nama = ");
                        nama = sc05.nextLine();
                        System.out.print("masukan baris = ");
                        baris = sc05.nextInt();
                        System.out.print("masukan kolom = ");
                        kolom = sc05.nextInt();
                        sc05.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("input penonyon lainnya? (y/n) : ");
                        next = sc05.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
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
