package P5;
import java.util.Scanner;
public class PemilihanPercobaan305 {
public static void main(String[]args){
    Scanner input05 = new Scanner(System.in);
    double Angka1, Angka2, hasil;
    char operator;
    System.out.println("masukkan angka pertama");
    Angka1 = input05.nextDouble();
    System.out.println("masukkan angka kedua");
    Angka2 = input05.nextDouble();
    System.out.println("masukkan operator (+ - * /):");
    operator = input05.next().charAt(0);
    
switch (operator) {
    case '+':
        hasil=Angka1 + Angka2;
        System.out.println(Angka1 + "+" + Angka2 + "=" + hasil);
    case '-':
        hasil = Angka1 - Angka2;
        System.out.println(Angka1 + "-" + Angka2 + "=" + hasil);
        break;
    case '*':
        hasil = Angka1 * Angka2;
        System.out.println(Angka1 + "*" + Angka2 + "=" + hasil);
        break;
    case '/':
        hasil = Angka1 / Angka2;
        System.out.println(Angka1 + "/" + Angka2 + "=" + hasil);
        break;
}
}
}