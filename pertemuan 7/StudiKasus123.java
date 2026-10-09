import java.util.Scanner;

public class StudiKasus123 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 20000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup;
        System.out.println("total harga: " +totalHarga);
        if (totalHarga >= 110000){
            diskon = totalHarga*10/100;
        }else{
            diskon = 0;

        }
        totalBayar = totalHarga-diskon;
        System.out.println("total bayar: " +totalBayar);
        System.out.println("diskon: " +diskon);
        if (uangBayar >= totalBayar){
            kembalian = uangBayar-totalBayar;
        
        System.out.println("kembalian: " +kembalian);
        } else  {
            kurang = totalBayar - uangBayar;
        }
        System.out.println("Uang tidak cukup, Kurang Rp: ");

    }
}
