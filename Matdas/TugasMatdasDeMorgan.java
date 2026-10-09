import java.util.Scanner;

public class TugasMatdasDeMorgan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Mahasiswa: ");
        double nilai = input.nextDouble();

        System.out.println("Masukkan presentase kehadiran: ");
        double kehadiran = input.nextDouble();

        boolean p = nilai <= 60;
        boolean q = kehadiran <= 80;
        boolean tidak_lulus = p || q;

        if (tidak_lulus) {
            System.out.println("Mahasiswa tidak lulus");
        } else {
            System.out.println ("Mahasiswa lulus");
        }

        input.close();
    }

}
