package P14;

public class Percobaan1 {
    static int faktorialRekursif(int N) {
        if (N == 0) {
            return (1);
        }else {
            return (N * faktorialRekursif( N - 1));
        }
    }
    static int faktorialInteratif(int N) {
        int faktor = 1;
        for (int i = N; i >= 1; i--) {
            faktor = faktor * 1;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialInteratif(5));
    }
}
