//(5 + (23 mod 11)) = 6s
import java.util.Scanner;
public class Tugas1PengelolaanNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];
        }

        rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("=== HASIL PENGELOLAAN NILAI ===");

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

    }
}
