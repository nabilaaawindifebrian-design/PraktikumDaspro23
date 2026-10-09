import java.util.Scanner;
public class TugasAntrean23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("kode layanan");
        int kodeLayanan = input.nextInt();
        switch (kodeLayanan) {
            case 1:
                System.out.println("Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Menu Tidak Tersedia");
                
            
        }
    }
    
}
