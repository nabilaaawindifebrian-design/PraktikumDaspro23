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
         }
        
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Masukkan status pendanaan anda (0/1): ");
            statusPendanaan = sc.nextInt();
            if(statusPendanaan==1){
                if(jumlahDokumen==4){
                    status = "Berhak memperoleh dana penghargaan.";
                } else {
                    status = "Dokumen tidak lengkap(kurang" + (4 - jumlahDokumen) +"dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan(PKM tidak lolos pendanaan)";
            }
           
        }else {
            status = "Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan)";
        }
        System.out.print("Status: " +status);
    }
}



