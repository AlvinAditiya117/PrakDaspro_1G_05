package P14;

import java.util.Scanner;

public class hitungPangkat {
    static int hitungPangkat(int x,int y) {
        if (y == 0) {
            return (1);
        }else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int bilangan, pangkat ;
        System.out.print("bilangan yang dihitung : ");
        bilangan = sc05.nextInt();
        System.out.print("pangkat : ");
        pangkat = sc05.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
