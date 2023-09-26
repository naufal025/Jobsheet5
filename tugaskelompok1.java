import java.util.Scanner;

public class tugaskelompok1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 666;
        int password = 213;
        System.out.println("Selamat datang di perpustakaan rahmat");
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        int user = input.nextInt();
        System.out.print("Password    : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login!");
        }else{
            System.out.println("Harap ulangi kembali username dan passsword anda,harap teliti!!");
        }
    }

}
