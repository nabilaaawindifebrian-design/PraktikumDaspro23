import java.util.Scanner;
public class KantinKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        int jumlah;
        int harga = 0;
        int subtotal;
        double diskon;
        double totalBayar;
        int ulang;

        do {
            System.out.println("=== KANTIN KAMPUS ===");
            System.out.println("1. Nasi Goreng - Rp12000");
            System.out.println("2. Mie Ayam   - Rp10000");
            System.out.println("3. Es Teh     - Rp5000");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                harga = 12000;
            } else if (pilihan == 2) {
                harga = 10000;
            } else if (pilihan == 3) {
                harga = 5000;
            } else {
                harga = 0;
                System.out.println("Menu tidak tersedia!");
            }

            if (harga != 0) {

                do {
                    System.out.print("Masukkan jumlah beli: ");
                    jumlah = sc.nextInt();

                    if (jumlah > 0) {
                        subtotal = harga * jumlah;

                        if (jumlah > 3) {
                            diskon = subtotal * 0.10;
                        } else {
                            diskon = 0;
                        }

                        totalBayar = subtotal - diskon;

                        System.out.println("Subtotal: Rp" + subtotal);
                        System.out.println("Diskon: Rp" + diskon);
                        System.out.println("Total bayar: Rp" + totalBayar);

                    } else {
                        System.out.println("Jumlah harus lebih dari 0!");
                    }

                } while (jumlah <= 0);

            }

            System.out.println();
            System.out.println("Ingin membeli lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilihan: ");
            ulang = sc.nextInt();

        } while (ulang == 1);

        System.out.println("Terima kasih sudah berbelanja!");

        
    }
}


