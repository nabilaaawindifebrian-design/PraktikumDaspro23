//(60 + (23 mod 41)) =83
import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
       
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
            jumlahLulus++;
        } else {
        jumlahTidakLulus++;
        }
    }
    System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
       

    }
}

  
       