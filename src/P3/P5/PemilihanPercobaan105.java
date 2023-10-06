package P3.P5;

import java.util.Scanner;

public class PemilihanPercobaan105 {
public static void main(String[]args){
    Scanner input05 = new Scanner(System.in);
    System.out.print("masukan angka: ");
    int angka=input05.nextInt();

    if (angka % 2 == 0)
    System.out.print("angka "+angka+" bilangan genap");
    else
    System.out.println("angka "+angka+"bilangan ganjil");

}
    
}