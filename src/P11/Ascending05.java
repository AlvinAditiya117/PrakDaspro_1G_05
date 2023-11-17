package P11;

public class Ascending05 {
    public static void main(String[] args) {

        String Cabor[] = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };

        String namaAtlet[][] = {
                { "Andi", "Candra", "Zaki", "Tono", "Rizki" },
                { "Koyo", "Budi", "Koko", "Hansena", "Windah" },
                { "Marto", "Sujarwo", "Paijo", "Kori", "Wahyu" },
                { "Verel", "Noval", "Gobi", "Dino", "Cesar" },
        };
        int i;

        System.out.println("Data sebelum di ascending : ");
        for (i = 0; i < namaAtlet.length; i++) {
            System.out.println(Cabor[i] + ":");
            for (int j = 0; j < namaAtlet[i].length; j++) {
                System.out.print((j + 1) + ". " + namaAtlet[i][j] + ", ");
            }
            System.out.println();
        }
        for (i = 0; i < namaAtlet.length; i++) {
            for (int j = 0; j < namaAtlet[i].length - 1; j++) {
                for (int k = j + 1; k < namaAtlet[i].length; k++) {
                    if (namaAtlet[i][j].compareTo(namaAtlet[i][k]) > 0) {

                        String temp = namaAtlet[i][j];
                        namaAtlet[i][j] = namaAtlet[i][k];
                        namaAtlet[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("\nSetelah di ascending");

        for (i = 0; i < namaAtlet.length; i++) {
            System.out.println("Cabang Olahraga " + Cabor[i] + ":");
            for (int j = 0; j < namaAtlet[i].length; j++) {
                System.out.print((j + 1) + "." + namaAtlet[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
