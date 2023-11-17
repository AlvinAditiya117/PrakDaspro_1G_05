package P11;

public class NamaLengkap05 {
    public static void main(String[] args) {
        char[] namaLengkap = { 'A', 'L', 'V', 'I', 'N', 'A', 'D', 'I', 'T', 'I', 'Y', 'A' };

        int baris = 8;
        int kolom = 5;

        int jumlahKarakter = namaLengkap.length;

        char[][] arrayDuaDimensi = new char[baris][kolom];

        int index = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (index < jumlahKarakter) {
                    arrayDuaDimensi[i][j] = namaLengkap[index];
                    index++;
                } else {
                    arrayDuaDimensi[i][j] = namaLengkap[j % jumlahKarakter];
                }
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arrayDuaDimensi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
