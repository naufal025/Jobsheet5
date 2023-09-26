import java.util.Scanner;
public class TugasIndividu1{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int jarak;

    System.out.print("Masukkan jarak anda: ");
    jarak = sc.nextInt();
    if(jarak <= 5){
    System.out.println("Gunakan melee weapon");
    } else if (jarak > 5){
    System.out.println("Gunakan ranged weapon");
    }

   }

}
   