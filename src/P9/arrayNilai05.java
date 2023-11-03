package P9;

import java.util.Scanner;

public class arrayNilai05 {
    public static void main(String[]args){
    Scanner sc05 = new Scanner(System.in);
    int nilaiAkhir[] = new int [10] ;
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("masukan nilai akhir ke- "+i+" : ");
        nilaiAkhir[i] = sc05.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("masukan nilai akhir ke- "+i+" adalah "+nilaiAkhir[i]);  
    }
    }
}
