package P11;

import java.util.Scanner;

public class Array2_05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int data[][] = new int[4][4];
        int jam[] = { 3, 6, 9, 12 };

        int max[] = new int[4];
        int min[] = new int[4];
        double total[] = { 0, 0, 0, 0 };
        double rata2[] = { 0, 0, 0, 0 };

        for (int i = 0; i < rata2.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("masukan nilai maksimum suhu : ");
                    max[i] = sc05.nextInt();
                    break;
                case 1:
                    System.out.print("masukan nilai maksimum presentase kelembaban : ");
                    max[i] = sc05.nextInt();
                    break;
                case 2:
                    System.out.print("masukan nilai maksimum kecepatan angin : ");
                    max[i] = sc05.nextInt();
                    break;
                case 3:
                    System.out.print("masukan nilai maksimum index UV : ");
                    max[i] = sc05.nextInt();
                    break;
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.printf("jam%s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("masukkan suhu : ");
                        data[i][j] = sc05.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("masukkan kelembaban : ");
                        data[i][j] = sc05.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("masukkan kecepatan angin : ");
                        data[i][j] = sc05.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("masukkan index UV : ");
                        data[i][j] = sc05.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                }
                rata2[j] = total[j] / data[0].length;
            }
        }
        System.out.println("==============");
        for (int i = 0; i < rata2.length; i++) {
            for (int j = 0; j < rata2.length; j++) {
                System.out.print(data[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("==============");
        for (int i = 0, j = 0; i < data.length; i++,j++) {
            System.out.print("kecepatan angin jam-"+jam[i]+" : "+data[2][j]);
            System.out.println("");
        }
        System.out.println("==============");
        System.out.printf("nilai maksimum index UV : %s\n",max[3]);
        System.out.printf("rata rata kecepatan angin %.2f\n", rata2[2]);
        System.out.printf("presentase kecepatan angin terendah : %s\n", min[2]);
    }

}
