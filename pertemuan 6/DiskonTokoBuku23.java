import java.util.Scanner;
public class DiskonTokoBuku23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlah;
        int diskon;
        System.out.println("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.println("Masukkan jumlah buku: ");
        jumlah = sc.nextInt();
        if(jenisBuku.equalsIgnoreCase("Kamus")){
            if(jumlah > 3){
                diskon = 13;
            } else {
                diskon = 11;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")){
            if(jumlah > 4){
                diskon = 10;
            } else {
                diskon = 9;
            }
        } else {
            if(jumlah > 4){
                diskon = 6;
            } else  {
                diskon = 0;
            }
        }
        System.out.println("Diskon = " + diskon +"%");
    }
    
}
