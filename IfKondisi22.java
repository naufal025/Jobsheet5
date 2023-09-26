import java.util.Scanner;
public class IfKondisi22 {
    public static void main(String[] args){
        Scanner sc22 = new Scanner(System.in);
        System.out.println("Masukkan suhu :");
        int suhu = sc22.nextInt();
        
        if (suhu<16){
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("Silahkan menggunakan baju tebal");
        }
        else {
            System.out.println("Silahkan memakai topi");
        }
    }
}