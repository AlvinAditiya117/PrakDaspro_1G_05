import java.util.Scanner;

public class Ucapan_05 {
    public static String PenerimaUcapan() {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Tulisakan nama orang yanng anda beri ucapan : ");
        String namaOrang = sc05.nextLine();
        sc05.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you");
    }
}
