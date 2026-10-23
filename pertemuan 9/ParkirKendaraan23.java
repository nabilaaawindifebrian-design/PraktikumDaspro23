//Tarif parkir mobil = 2500 + (23 mod 6) × 250 per jam = 3750 → gantikan Rp3.000 pada soal
//Tarif parkir motor = 1500 + (23 mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil) =3750 → gantikan Rp2.000 pada soal

import java.util.Scanner;

public class ParkirKendaraan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Jenis (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total = total + durasi * 3750;
                } else {
                    total = total + durasi * 3750;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp" + total);
        
    }
}

