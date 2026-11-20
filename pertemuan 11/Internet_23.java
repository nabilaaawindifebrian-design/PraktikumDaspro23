
import java.util.Scanner;
public class Internet_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kecepatanUji;
        String nama;
        int j = 20;
        int ujiGagal;
        int rata;
        String status;
        String tambahPelanggan = "y/t";
        int i = 0;
        
         while (i <=5 ) {
            System.out.println("Nama Pelanggan ");
            nama = sc.nextLine();
            System.out.println("Kecepatan uji ke " +i);

            if (j >= 20){
            System.out.println("Uji gagal: ");
            ujiGagal= sc.nextInt();
            } else {
                System.out.println("Data tidak valid");
      
               
                
            i++;    
            }
            rata += rata; 
            System.out.println("Rata-rata : ");
            System.out.println("Status : ");
            status = sc.nextLine();
            System.out.println(" Tambah Pelanggan ? (y/t): ");
            tambahPelanggan = sc.nextLine();
           
        } 
    }
    



    }
    

