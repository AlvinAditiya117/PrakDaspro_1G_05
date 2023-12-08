package P14;

import java.util.Scanner;

public class hitungPangkat {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    static void cetakDeretPangkat(int x, int y) {
        System.out.print("deret perhitungan pangkat : ");
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print("x");
            }
        }
        System.out.print(" = " + hitungPangkat(x, y));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("bilangan yang dihitung : ");
        bilangan = sc05.nextInt();
        System.out.print("pangkat : ");
        pangkat = sc05.nextInt();

        cetakDeretPangkat(bilangan, pangkat);
    }
}
