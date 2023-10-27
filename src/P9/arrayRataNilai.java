package P9;

import java.util.Scanner;

public class arrayRataNilai {
    public static void main(String[]args){
    Scanner sc05 = new Scanner(System.in);
    int nilaiMhs[] = new int[10];
    double total = 0 ;
    double rata2 ;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("masukan nilai mahasiswa ke- "+(i+1)+" : ");
        nilaiMhs[i] = sc05.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
    }
        rata2 = total / nilaiMhs.length;
        System.out.print("rata rata nilai = "+ rata2);
        
    }
}
