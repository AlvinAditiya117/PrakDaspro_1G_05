package P3.P4;

import java.util.Scanner;

public class Lingkaran05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int r;
        double keliling,luas ,phi= 3.14;
        System.out.println("masukkan jari jari lingkaran");
        r=sc05.nextInt();
        keliling = 2*3.14*r;
        luas = 3.14*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}
