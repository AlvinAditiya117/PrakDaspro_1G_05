package m3.PrakDaspro_1G_05;

import java.util.Scanner;

public class UtsAlvinAditiyaTi1G05 {
   
  public static void main(String args[]){
    Scanner alvinaditiya = new Scanner(System.in);
    String username,name, phonenumber,alamat, golongan, jumha,dk,gj ;
    int pilihan, WIDHT_LENGTH = 60;
    char ulang;
     
    do {
      System.out.println("=======================================================");
      System.out.println("============UTS PRAKTIKUM DASAR PEMROGRAMAN============");
      System.out.println("==============dibuat oleh : alvin aditiya =============");
      System.out.println("====================nim : 2341720020===================");
      System.out.println("=======================================================");
      System.out.println("##                     Daftar Menu                   ##");
      System.out.println("=======================================================");
      System.out.println("|                   1. Data Kartawan                  |");
      System.out.println("|                   2. Gaji Karyawan                  |");
      System.out.println("=======================================================");
      System.out.println();      
      System.out.print("menu : ");
      pilihan = alvinaditiya.nextInt();
    
    
      System.out.println();   
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = alvinaditiya.next().charAt(0);       
      System.out.println(); 
      
    }

    while (ulang!= 't');   
    System.out.println("Terimakasih...");
    System.out.println();

    System.out.println("");
    username=alvinaditiya.nextLine();
    System.out.print("name : ");
    name=alvinaditiya.nextLine();
    System.out.print("Phone Number : ");
    phonenumber=alvinaditiya.nextLine();;
    System.out.print("Alamat : ");
    alamat=alvinaditiya.nextLine();
    System.out.print("Golongan : ");
    golongan=alvinaditiya.nextLine();
    System.out.print("Jumlah Kehadiran : ");
    jumha=alvinaditiya.nextLine();
    
      System.out.println();   
      System.out.print("apakah ingin mencetak data karyawan? (y/t)? ");
      ulang = alvinaditiya.next().charAt(0);       
      System.out.println();

       while (ulang!= 'y');   
    System.out.println("Oke Terimakasih...");
    System.out.println();
     

        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");
        System.out.println("=========================data karyawan=======================");
        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");
        System.out.println("| Name               : " + name + " ".repeat(WIDHT_LENGTH - 23 - name.length()) + "|");
        System.out.println("| Phone Number       : " + phonenumber + " ".repeat(WIDHT_LENGTH - 23 - phonenumber.length()) + "|"); 
        System.out.println("| Alamat             : " + alamat + " ".repeat(WIDHT_LENGTH - 23 - alamat.length()) + "|");
        System.out.println("| Golongan           : " + golongan + " ".repeat(WIDHT_LENGTH - 23 - golongan.length()) + "|");
        System.out.println("| Jumlah Kehadiran   : " + jumha + " ".repeat(WIDHT_LENGTH - 23 - jumha.length()) + "|");
        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");


    System.out.println("");
    username=alvinaditiya.nextLine();
    System.out.print("name : ");
    name=alvinaditiya.nextLine();
    System.out.print("gaji pokok : ");
    phonenumber=alvinaditiya.nextLine();;
    System.out.print("tunjangan : ");
    alamat=alvinaditiya.nextLine();
    System.out.print("uang makan : ");
    golongan=alvinaditiya.nextLine();
    System.out.print("gaji yang diterima : ");
    golongan=alvinaditiya.nextLine();

        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");
        System.out.println("=========================gaji karyawan=======================");
        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");
        System.out.println("| Name                  : " + name + " ".repeat(WIDHT_LENGTH - 23 - name.length()) + "|");
        System.out.println("| Gaji Pokok            : " + phonenumber + " ".repeat(WIDHT_LENGTH - 23 - phonenumber.length()) + "|"); 
        System.out.println("| Tunjangan             : " + alamat + " ".repeat(WIDHT_LENGTH - 23 - alamat.length()) + "|");
        System.out.println("| Uang Makan            : " + golongan + " ".repeat(WIDHT_LENGTH - 23 - golongan.length()) + "|");
        System.out.println("| Gaji Yang Diterima    : " + jumha + " ".repeat(WIDHT_LENGTH - 23 - jumha.length()) + "|");
        System.out.println("#" + "=".repeat(WIDHT_LENGTH - 1) + "#");

      System.out.println();   
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = alvinaditiya.next().charAt(0);       
      System.out.println();

    while (ulang!= 't');   
    System.out.println("Terimakasih...");
    System.out.println();

      switch(pilihan){
        case 1:
          System.out.println("Anda memilih Data Karyawan");
          break;
        case 2:
          System.out.println("Anda memilih Gaji Karyawan");
          break;
        default:
          System.out.println("Menu tidak tersedia");



      }

  }
    
}