package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_05 {
   public static void UcapanTambahan(String tambahan) {
      System.out.print(tambahan);
   }
   public static String PenerimaUcapan(){
    Scanner sc05 = new Scanner(System.in);
    System.out.print("Tuliskan nama orang yang ingin anda beri ucapan : ");
    String namaOrang = sc05.nextLine();
    sc05.close();
    return namaOrang;
   } 
   public static void UcapanTerimaKasih(){
    String nama = PenerimaUcapan();
    System.out.println("Thank you "+nama+"\nMay the force be with you");
    UcapanTambahan("ini adalah ucapan tambahan");
   }
   public static void main(String[] args) {
      Scanner sc05 = new Scanner(System.in);
      System.out.print("Tuliskan ucapan tambahan ");
      String UcapTambahan = sc05.nextLine();
    UcapanTerimaKasih();
    UcapanTambahan(UcapTambahan);
   }
}
