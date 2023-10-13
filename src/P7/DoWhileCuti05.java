package P7;

import java.util.Scanner;

public class DoWhileCuti05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jc, jh;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jc = sc05.nextInt();
        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/n)? ");
            konfirmasi = sc05.next();
        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari: ");
            jh = sc05.nextInt();
        if (jh <= jc) {
            jc -= jh;
            System.out.println("Sisa jatah cuti: " + jc);                  
        } else {
            System.out.println("Sisa jatah cuti Anda tidak mencukupi");
        if (jc == 0) {
        break;
                        
                    }
                }
            }else if(konfirmasi.equalsIgnoreCase("t")){
                break;
                }

        } while (jc > 0 );
    }
}