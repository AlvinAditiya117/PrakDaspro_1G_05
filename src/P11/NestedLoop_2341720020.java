package P11;

import java.util.Scanner;

public class NestedLoop_2341720020 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        double temps[][] = new double[5][7];
        int i, j, counter, sum;
        double rata2;

        for ( i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for ( j = 0; j < temps[0].length; j++) {
                System.out.print("hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc05.nextDouble();
            }
        }

        for (i = 0; i < temps.length; i++) {
            rata2 = 0;
            System.out.println("kota ke-" + (i + 1) + "");
            for (j = 0, counter = 0, sum = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + "");
                counter++;
                sum += temps[i][j];
            }
            rata2 = (double) sum / counter;
            System.out.println(" rata rata : " + rata2);
        }
    }
}
