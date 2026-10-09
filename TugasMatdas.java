import java.util.Scanner;

public class TugasMatdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Mahasiswa: ");
        double nilai = input.nextDouble();

        System.out.println("Masukkan presentase kehadiran: ");
        double kehadiran = input.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;
        boolean lulus = p && q;

        if (lulus) {
            System.out.println("Mahasiswa lulus");
        } else {
            System.out.println("Mahasiswa tidak lulus");
        }
        
        input.close();

    }
}
