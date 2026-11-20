// (50 + (23 mod 50)) = 83
import java.util.Scanner;
public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
           System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
           nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, Nilai " + key + " tidak ditemukan dalam daftar nilai mahasiswa.");
        }

       
    }
    
}

