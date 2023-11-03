package P9;

import java.util.Scanner;

public class arrayBilangan05 {
    public static void main(String[]args){
    Scanner sc05 = new Scanner(System.in);
    int Bill[] = {5,13,-7,17} ;
    Bill [0] = 5 ;
    Bill [1] = 13 ;
    Bill [2] = -7 ;
    Bill [3] = 17 ;

    for (int i = 0; i < 4; i++) {
        System.out.println(Bill[i]);
    }
}
}