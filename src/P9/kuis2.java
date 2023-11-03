package P9;

import java.util.Scanner;

public class kuis2 {
    public static void main(String[]args){
        Scanner sc05 = new Scanner(System.in);
        double berat, tinggi, imt;

        System.out.print("input berat badan = ");
        berat = sc05.nextDouble();
        System.out.print("input tinggi badan = ");
        tinggi = sc05.nextDouble();

        imt = berat / (tinggi * tinggi);

        if (imt > 17){
            System.out.println("sangat kurus");
        }
        else if ((imt>=17)&&(imt<=18.5)) {
            System.out.println("kurus");
        }
        else if ((imt>=18.5)&&(imt<=25)) {
        System.out.println("normal");
        }
        else if ((imt>=25)&&(imt<=27)) {
            System.out.println("gemuk");  
        } 
        else if (imt > 27) {
        System.out.println("obesitas");     
        }
        else
        System.out.println("invalid");
    }
    }
