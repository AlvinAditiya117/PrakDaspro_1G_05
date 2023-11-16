import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, userAgent = "Agent", passAgent = "Agent123", password;
        String userAdmin = "Admin", passwordAdmin = "Admin123";
        boolean loginSuccess = false;

        while (!loginSuccess) {
            System.out.print("Masukkan Username: ");
            username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            if (username.equals(userAgent) && password.equals(passAgent)) {
                loginSuccess = true;
                System.out.println("Login Berhasil");
                System.out.println("Anda masuk sebagai Agent");
            } else if (username.equals(userAdmin) && password.equals(passwordAdmin)){
                loginSuccess = true;
                System.out.println("Login Berhasil");
                System.out.println("Anda masuk sebagai Admin");
            } else {
                System.out.println("Login gagal");
            }
        }
    }
}