package P9;

import java.util.Scanner;

public class arrayRataNilai {
    public static void main(String[]args){
    Scanner sc05 = new Scanner(System.in);
    int nilaiMhs[] = new int[10];
    double[] total = {0,0};
    double[] rata2 = {0,0} ;
    int lulus = 0;
    int []counter = {0,0};

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("masukan nilai mahasiswa ke- "+(i+1)+" : ");
        nilaiMhs[i] = sc05.nextInt();
    }
    for (int i = 0; i < counter.length; i++) {
        if (nilaiMhs[i]>70) {
        total[0] += nilaiMhs[i];
        counter[0]++;
    } else {
        total[i] += nilaiMhs[i];
        counter[i]++;
    }
    }
    rata2[0] = total[0] / counter[0];
    rata2[1] = total[1] / counter[1];

    System.out.println("rata rata nilai lulus = "+ rata2[0]);
    System.out.println("rata rata nilai lulus = "+ rata2[1]);          
    }
}
