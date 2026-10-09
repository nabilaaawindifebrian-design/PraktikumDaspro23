import java.util.Scanner;
public class Tugas1Pemilihan23 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas;
        String pesan;
        uktLunas = input.nextBoolean();
        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi, Silakan cetak KRS dan minta tand tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println(pesan);
       
    
    }
    
}