import java.util.Scanner;
public class febriKopKam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String namaBarang;
        int kategori = 1;
        int transaksi;
        int jumlahBarangDibeli, harga;
        int subTotal;
        double diskon = 0.10;
        int bayar=0;
        int totKategori;
        int totKeseluruhan = 0;

        while (kategori <=3 ) {
            System.out.println("Kategori ke- " +kategori);
            transaksi = 1;
            totKategori = 0;

            while (transaksi <= 2) {
                System.out.println("Transaksi ke- " +transaksi);
                System.out.println("Nama Barang: ");
                namaBarang = sc.next();
                System.out.println("Jumlah Barang: ");
                jumlahBarangDibeli = sc.nextInt();
                System.out.println("Harga Satuan: ");
                harga = sc.nextInt();

                subTotal = jumlahBarangDibeli * harga;
                System.out.println("Sub Total: ");
              

                if (diskon >= 50000) {
                    System.out.println("diskon: ");
                    diskon = subTotal * 0.10; 
                } else {
                    diskon = 0;
                }
                bayar = (int) (subTotal - diskon);
                System.out.println("Bayar: " +bayar);

                transaksi++;
            }
            totKategori = totKategori + bayar;
            System.out.println("Total Kategori: " +totKategori);
            totKeseluruhan = totKeseluruhan + totKategori;
            System.out.println("Total Keseluruhan: " +totKeseluruhan);


            
        }


    }
    
}
