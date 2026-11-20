import java.util.Scanner;
public class FebriKoperasiNW {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int kategori = 1;
        int transaksi;
        int jumlah, harga;
        double subtotal, totalKategori;
        double totalKeseluruhan = 0;
        double diskon, bayar;

        
        while (kategori <= 3) {

            System.out.println("Kategori Barang ke-" + kategori);

            transaksi = 1;
            totalKategori = 0;

            do {
                System.out.println("Transaksi ke-" + transaksi);

                System.out.print("Masukkan jumlah barang: ");
                jumlah = sc.nextInt();

                System.out.print("Masukkan harga satuan: ");
                harga = sc.nextInt();

                subtotal = jumlah * harga;

                if (subtotal >= 50000) {
                    diskon = subtotal * 0.10;
                    bayar = subtotal - diskon;

                    System.out.println("Mendapatkan diskon 10%");
                } else {
                    diskon = 0;
                    bayar = subtotal;

                    System.out.println("Tidak mendapatkan diskon");
                }

                System.out.println("Subtotal: " + subtotal);
                System.out.println("Diskon: " + diskon);
                System.out.println("Total bayar: " + bayar);

                totalKategori = totalKategori + bayar;

                transaksi++;

            } while (transaksi <= 2);

            System.out.println("Total kategori: " + totalKategori);

            totalKeseluruhan =
            totalKeseluruhan + totalKategori;

            kategori++;
        }

        System.out.println("=== RINGKASAN PEMBELIAN ===");
        System.out.println("Total keseluruhan: "+ totalKeseluruhan);

       
    }
}
