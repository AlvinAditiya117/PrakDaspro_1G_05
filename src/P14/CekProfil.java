package P14;

import java.util.Scanner;

public class CekProfil {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("masukan bilangan n : ");
        int n = sc05.nextInt();
        if (CekProfil(n,2)) {
            System.out.println(n + " adalah bilangan prima ");
        }else {
            System.out.println(n + " bukan bilangan prima ");
        }
        sc05.close();
    }
    public static boolean CekProfil(int n,int pembagi) {
        if (n <= 1) {
            return false;
        }else if(pembagi >= n) {
            return true;
        }else if (n%pembagi == 0) {
            return false;
        }else{
            return CekProfil(n, pembagi - 1);
        }
    }
}
