import java.util.Scanner;
public class MenghitungBiayaCetak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlahLembar;
        int biayaCetak = 500;
        int biayaJilid = 5000;
        int totalBiaya;
        System.out.println("Masukkan jumlah lembar: ");
        jumlahLembar = input.nextInt();
        totalBiaya = jumlahLembar * biayaCetak + biayaJilid;
        System.out.println("Biaya pencetakan adalah Rp: " +(jumlahLembar * biayaCetak));
        System.out.println("Biaya penjilidan adalah Rp: " +biayaJilid);
        System.out.println("Total biaya yang harus dibayar adalah Rp: " +totalBiaya);

    }
    
}
