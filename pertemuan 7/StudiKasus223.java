import java.util.Scanner;
public class StudiKasus223 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        String status = "";
        int jumlahDokumen, peringkatJuara, statusPendanaan, kurang;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen yang diupload: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
            ||jenisKegiatan.equalsIgnoreCase("BAKORMA")
            ||jenisKegiatan.equalsIgnoreCase("MANDIRI")){
            System.out.print("Masukkan peringkat juara: ");
            peringkatJuara = sc.nextInt();
           if (peringkatJuara >=1 && peringkatJuara<=3) {
                if (jumlahDokumen>=4) {
                    status = "Berhak memperoleh dana penghargaan.";
                 } else {
                    kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap(kurang " + kurang + " dokumen) Dana penghrgaan tidak diberikan.";
                 }
            } else {
                status = "Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3) ";
         }} else {{
            status = "jenis kegiatan belum diproses";
         }
        System.out.print("Status: " +status);
        
        }
       
    }
}



