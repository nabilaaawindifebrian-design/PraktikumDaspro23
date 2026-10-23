// Jumlah mahasiswa = 8 + (23 mod 5) = 11
// Batas kelulusan = 55 + (23 mod 11) = 56
import java.util.Scanner;
public class siakadfor23 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int lulus = 0, tidakLulus =0;
        double nilai, tertinggi = 0, terendah = 100;

        for(int i = 1; i <= 11; i++){
            System.out.print("Masukkan nilai " + i +": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 56){
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("nilai tertinggi : " +tertinggi);

        System.out.println("nilai terendah : " +terendah);

        System.out.println("jumlah mahasiswa lulus : " +lulus);

        System.out.println("jumlah mahasiswa tidak lulus : " +tidakLulus);

    }
}
