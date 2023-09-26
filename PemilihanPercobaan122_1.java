import java.util.Scanner;
public class PemilihanPercobaan122_1 {

    public static void main (String[] args){
        Scanner input22 = new Scanner (System.in);

        System.out.println("Masukkan nilai:  ");
        int nilai = input22.nextInt();
        if (nilai < 75 ){
            System.out.println("Harus Remidi!!!");
        }
        else if (nilai <= 75){
            System.out.println("Selamat nilai anda mencukupi");
    }
}
}
