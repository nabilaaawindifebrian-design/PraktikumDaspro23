import java.util.Scanner;
public class MenghitungJumlahCicilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaLaptop, uangMuka, bulan;
        double sisaHarga, bunga, cicilan, cicilanPerbulan;
        System.out.println("Masukkan harga laptop: ");
        hargaLaptop = input.nextDouble();
        System.out.println("Masukkan uang muka: ");
        uangMuka = input.nextDouble();
        System.out.println("Masukkan bulan: ");
        bulan = input.nextDouble();
        sisaHarga = hargaLaptop - uangMuka;
        bunga = 0.02 * sisaHarga;
        cicilan = sisaHarga + bunga;
        cicilanPerbulan = cicilan / bulan;
        System.out.println("Bunga yang dikenakan adalah Rp: " +bunga);
        System.out.println("Total cicilan adalah Rp: " +cicilan);
        System.out.println("Cicilan setiap bulan adalah Rp: " +cicilanPerbulan);
    }
    
}
