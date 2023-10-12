package P3.P6;

import java.util.Scanner;

public class Pemilihan2Percobaan105 {
    public static void main(String[] args) {
        int tahun;
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        tahun = sc05.nextInt();
    if ((tahun % 4) == 0) {
        System.out.println("Tahun Kabisat");
    if ((tahun % 100) != 0) {
        System.out.println("Tahun Kabisat");
}   else if ((tahun % 400) == 0) {
        System.out.println("Tahun Kabisat");
}   else {
        System.out.println("Bukan Tahun Kabisat ");
}
}   else {
        System.out.println("Bukan Tahun Kabisat");
}
    }
} 