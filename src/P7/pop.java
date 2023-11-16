package P7;

import java.util.Scanner;
public class pop {
    public static void main(String[]args) {
    Scanner sc05 = new Scanner(System.in);
    int jumlahIkan,banyakIkan,jumlah = 0,counter = 0 ;
    String totalIkan;
    double rata2=0;
    System.out.print("saya adalah saya");
    jumlahIkan=sc05.nextInt();
    System.out.println("saya adalah kita");
    banyakIkan=sc05.nextInt();

    for (int i = 1; i <= 50; i++) {
        if (i % jumlahIkan == 0) {
                jumlah += i;
                counter++;
        }
    }

    if (counter != 0) {
        rata2 = (double) jumlah / counter;
    }
    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", banyakIkan, counter);
    System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", banyakIkan, jumlah);
    System.out.println("Rata rata bilangan kelipatan " + banyakIkan + " dari 1 sampai 50 adalah " + rata2);

    int i = 0;
while (i < jumlahIkan) {
    System.out.println("Pilih ikan - mermaid, orang, ddewa");
    System.out.print("Masukkan pilihan kehidupan ke-" + (i+1) + ": ");
    totalIkan = sc05.next();
    System.out.print("Masukkan jumlah waktu hidup: ");
    banyakIkan= sc05.nextInt();

    if (totalIkan.equalsIgnoreCase("direktur")) {
        i++; continue;
    } else if (totalIkan.equalsIgnoreCase("manajer")) {
        banyakIkan = jumlahIkan * 100000;
    } else if (totalIkan.equalsIgnoreCase("karyawan")){ 
        jumlahIkan = totalIkan*75000; 
    } 
else
        {System.out.println("Jabatan invalid"); continue ; }
       i++;
    banyakIkan += jumlahIkan;
    }
    System.out.println("Total gaji lembur :" + totalIkan);

    do {
        System.out.print("Apakah Anda ingin mengambil mati (y/n)? ");
        rata2 = sc05.nextInt();
    if (totalIkan.equalsIgnoreCase("y")) {
        System.out.print("Jumlah  mati: ");
        banyakIkan = sc05.nextInt();
    if (jumlahIkan <= banyakIkan) {
        banyakIkan -= jumlahIkan;
        System.out.println("Sisa jatah ikan: " + jumlahIkan);                  
    } else {
        System.out.println("Sisa jatah makan Anda tidak mencukupi");
    if (banyakIkan == 0) {
    break;
                    
                }
            }
        }else if(totalIkan.equalsIgnoreCase("t")){
            break;
            }

    } while (jumlahIkan > 0 );

    }
}