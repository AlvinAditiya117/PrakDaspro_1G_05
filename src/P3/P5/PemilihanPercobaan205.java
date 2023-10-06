package P3.P5;
import java.util.Scanner;
public class PemilihanPercobaan205 {
    public static void main(String[]args){
    Scanner input05 = new Scanner(System.in);
    System.out.print("Nilai uas : ");
    float uas = input05.nextFloat();
    System.out.print("Nilai uts : ");
    float uts = input05.nextFloat();
    System.out.print("Nilai kuis : ");
    float kuis= input05.nextFloat();
    System.out.print("Nilai tugas : ");
    float tugas = input05.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    
    System.out.println("Nilai akhir = "+total);

    if (total > 80){
        System.out.println("mendapat nilai A sangat baik");
    }
    else if ((total>73)&&(total<=80)) {
        System.out.println("mendapat nilai B+ lebih dari baik");
    }
    else if ((total>65)&&(total<=73)) {
        System.out.println("mendapat nilai B baik");       
    }
    else if ((total>60)&&(total<=65)) {
        System.out.println("mendapat nilai c+ lebih dari cukup");
    }
    else if ((total>50)&&(total<=60)) {
        System.out.println("mnedapat nilai C cukup");
    }
    else if ((total>39)&&(total<=50)) {
        System.out.println("mendapat nilai D kurang");
    }
    else
    System.out.println("anda mnedapatkan nilai E gagal");
}
}