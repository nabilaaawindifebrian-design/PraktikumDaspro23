// (2 + (23 mod 4)) = 5
import java.util.Scanner;
public class Tugas2Kafe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu ditemukan: " + menu[i]);
                System.out.println("Harga: Rp" + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {

            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];

                        total += harga[j];

                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu tidak tersedia, silakan pilih kembali.");
                }
            }
        }

        System.out.println("=== STRUK PEMESANAN ===");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total biaya: Rp" + total);

       
    }
}
