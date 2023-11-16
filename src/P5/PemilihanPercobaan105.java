package P5;

import java.util.Scanner;

public class PemilihanPercobaan105 {
public static void main(String[]args){
    Scanner input05 = new Scanner(System.in);
    System.out.print("masukan angka: ");
    int angka=input05.nextInt();

   String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
   System.out.println("angka " + angka + "adalah" + hasil);

}
    
}