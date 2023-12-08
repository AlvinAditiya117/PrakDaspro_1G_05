package P14;

public class fibonacci {
    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Bulan ke\t| Produktif\t| Belum Produktif\t| Jumlah Pasangan");
        System.out.println("=========================================================================");
        for (int i = 1; i <= bulan; i++) {
            int totalPasangan = hitungFibonacci(i);
            int pasanganBelumProduktif = hitungFibonacci(i - 1);
            int pasanganProduktif = totalPasangan - pasanganBelumProduktif;

            System.out.printf("%-12d\t| %-13d\t| %-16d\t| %-15d%n", i, pasanganProduktif, pasanganBelumProduktif, totalPasangan);
        }
    }
    public static int hitungFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return hitungFibonacci(n - 1) + hitungFibonacci(n - 2);
        }
    }
}
