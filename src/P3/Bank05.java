package P3;
import java.util.Scanner;
public class Bank05 {
 public static void main(String[] args) {
    Scanner sc05 = new Scanner(System.in);
    int jml_tabungan_awal, lama_menabung;
    double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;
    System.out.println ("masukkan jumlah tabungan awal anda");
    jml_tabungan_awal = sc05.nextInt();
    System.out.println ("masukan lama menabung anda");
    lama_menabung= sc05.nextInt();
    bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
    jml_tabungan_akhir=bunga+jml_tabungan_awal;
    System.out.println("bunga adalah" + bunga);
    System.out.println("jumlah tabungan akhir anda adalah" + jml_tabungan_akhir);
    }

}
