import java.util.Scanner;
public class SeleksiAsisten23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean sertifikatKompetensi;
        int nilaiDasPro;
        int nilaiWawancara;

        System.out.println("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah sedang dapat sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.println("Masukkan nilai DasPro: ");
        nilaiDasPro = sc.nextInt();
        System.out.println("Apakah mempunyai sertifikat kompetensi program? (true/false): ");
        sertifikatKompetensi = sc.nextBoolean();
        System.out.println("Masukkan nilai wawancara: ");
        nilaiWawancara = sc.nextInt();
        
        if (mahasiswaAktif && !sedangDisanksi){
            if (nilaiDasPro >= 76 || sertifikatKompetensi) {
                if (nilaiWawancara >= 71){
                    System.out.println("Mahasisswa diterima asisten praktikum");
                } else {
                    System.out.println("Gagal: nilai wawancara kurang dari 71");
                }
            } else {
                System.out.println("Gagal: nilai DasPro kurang dari 76 dan tidak punya sertifikat kompetensi");
            }
        } else {
            System.out.println("Gagal: mahasiswa tidak aktif dan tidak aktif atau sedang dapat sanksi akademik");
        }


    }
    
}
