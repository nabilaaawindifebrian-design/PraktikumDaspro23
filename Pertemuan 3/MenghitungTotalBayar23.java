import java.util.Scanner;
public class MenghitungTotalBayar23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;
        harga=input.nextInt();
        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);


    
    }
}
