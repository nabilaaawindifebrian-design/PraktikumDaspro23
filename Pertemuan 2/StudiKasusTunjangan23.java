import java.util.Scanner;

public class StudiKasusTunjangan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gaji_pokok, jumlah_anak, tunjangan_anak;
        double presentase_bunga = 0.1, potongan, total_tunjangan_anak, gaji_bersih;

        System.out.println("Masukkan gaji pokok: ");
        gaji_pokok = input.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        jumlah_anak= input.nextInt();
        System.out.println("Masukkan tunjangan anak: ");
        tunjangan_anak= input.nextInt();

        potongan = gaji_pokok * presentase_bunga;
        total_tunjangan_anak = tunjangan_anak * jumlah_anak;
        gaji_bersih = gaji_pokok + total_tunjangan_anak - potongan;

        System.out.println(" Potongan wajib dana pensiun sebesar Rp " + potongan);
        System.out.println("Total tunjangan anak sebesar Rp " + total_tunjangan_anak);
        System.out.println("Gaji bersih: " + gaji_bersih);

        



    }


    
}
    