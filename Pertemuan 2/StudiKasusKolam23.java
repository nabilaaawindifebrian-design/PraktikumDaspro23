import java.util.Scanner;

public class StudiKasusKolam23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebar_tanah, panjang_tanah, luas_tanah, luas_taman, panjang_sisi;
        double jari_jari, luas_tanah_tidak_digunakan, luas_lingkaran, diameter_kolam;

        System.out.println("Masukkan jumlah awal lebar tanah: ");
        lebar_tanah = input.nextInt();
        System.out.println("Masukkan jumlah awal panjang tanah: ");
        panjang_tanah = input.nextInt();
        System.out.println("Masukkan panjang sisi: ");
        panjang_sisi = input.nextInt();
        System.out.println("Masukkan Diameter kolam: ");
        diameter_kolam = input.nextInt();
        jari_jari = diameter_kolam / 2;
        luas_tanah = panjang_tanah * lebar_tanah;
        luas_taman = panjang_sisi * panjang_sisi;
        luas_lingkaran = 3.14 * Math.pow(jari_jari, 2);
        luas_tanah_tidak_digunakan = luas_tanah - luas_taman - luas_lingkaran;

        System.out.println("Luas tanah adalah: " + luas_tanah);
        System.out.println("Luas taman adalah: " + luas_taman);
        System.out.println("Luas lingkaran adalah: " + luas_lingkaran);
        System.out.println("Luas tanah tidak digunakan: " + luas_tanah_tidak_digunakan);




        

    }
}
