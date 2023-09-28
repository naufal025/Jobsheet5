import java.util.Scanner;

public class  tugaskelompok8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int denda_perhari, lama_keterlambatan;
        double jml_denda_akhir;

        System.out.println ("masukan denda awal");
        denda_perhari = sc.nextInt();
        System.out.println ("masukan lama keterlambatan");
        lama_keterlambatan = sc.nextInt();

       jml_denda_akhir = denda_perhari*lama_keterlambatan;

       System.out.println ("denda yang harus dibayarkan adalah : " + jml_denda_akhir);

       if (jml_denda_akhir < 5000){
        System.out.println("Kamu mendapatkan hukuman membersihkan perpus");
       } else if (jml_denda_akhir >= 5000){
        System.out.println("Kamu mendapatkan hukuman menyumbang 1 buku");
       }

    }
}