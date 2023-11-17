package P11;

import java.util.Scanner;

public class NestedLoop_2341720020 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc05.nextDouble();
            }
        }

        for (double[] tempsVar : temps) {
            for (double variable : tempsVar) {
                System.out.print(variable+"");
            }
            System.out.println();
        }
    }
}
