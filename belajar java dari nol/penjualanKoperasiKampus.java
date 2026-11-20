import java.util.Scanner;
public class penjualanKoperasiKampus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String namaBarang, namaMahasiswa;
        int mahasiswa = 1;
        int barang = 1;
        int transaksi;
        int jumlahBarang, harga;
        int subTotal;
        double diskon = 0.10;
        int totBayar = 0;
        int bayar = 0;
        int i=0;

        while (i <=3 ) {
            System.out.println("Mahasiswa ke- "+i);
            System.out.println("Nama Mahasiswa: ");
            namaMahasiswa = sc.nextLine();
            System.out.println("Barang ke- " +barang);
            jumlahBarang = 1;
    

            while (barang <= 2) {
                System.out.println("Nama Barang: ");
                namaBarang = sc.next();
                System.out.println("Jumlah Barang: ");
                jumlahBarang = sc.nextInt();
                System.out.println("Harga Satuan: ");
                harga = sc.nextInt();

                subTotal = jumlahBarang * harga;
                System.out.println("Sub Total: ");
              

                if (diskon >= 50000) {
                    System.out.println("diskon: ");
                    diskon = subTotal * 0.10; 
                } else {
                    diskon = 0;
                }
                bayar = (int) (subTotal - diskon);
                System.out.println("Bayar: " +bayar);

            barang++;   
            }
            totBayar += jumlahBarang + diskon;
            System.out.println("Total Bayar: " +totBayar);


        i++;  
        }
       


    }
    
}


    
