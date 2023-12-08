package P14;

import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahKanBilangan(int f, int start) {
        System.out.print(start);
        if (start >= f)
            return start;
        System.out.print(" + ");
        return start + jumlahKanBilangan(f, start + 1);
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int f = sc05.nextInt();
        System.out.println(" = " + jumlahKanBilangan(f, 1));
        sc05.close();
    }
}
