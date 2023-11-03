package P9;

import java.util.Scanner;

public class linearSearch05 {
    public static void main(String[]args){
    Scanner sc05 = new Scanner(System.in);
    int n = 0;
    int key ;
    int hasil = 0 ;
    String a = null ;
    System.out.println("masukkan jumlah element array : ");
    n = sc05.nextInt();
    int[] arrayInt = new int[n];

    for (int i = 0; i < arrayInt.length; i++) {
        System.out.println("masukkan element aray ke- "+i+" :");
        arrayInt[i] = sc05.nextInt();
    }
    System.out.println("masukkan key yang ingin dicari : ");
    key = sc05.nextInt();
    
    for (int i = 0; i < arrayInt.length; i++) {
        if (arrayInt[i] == key) {
            hasil = i ;
            System.out.println("key ada dalam array pada posisi indek ke- "+hasil);
        continue;
        }else
        a = "data tidak ditemukan";
        }
    if (hasil == 0)
    System.out.println(a);
    }
}
