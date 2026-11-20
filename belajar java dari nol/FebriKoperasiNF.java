import java.util.Scanner;
public class FebriKoperasiNF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int jenisBarang = 0;
       int transaksi = 0;
       int harga;
       int total;
        
       for (int i = 1; i <= 3; i++) {
        System.out.println("Jenis Barang ke- " +i);
        total = 0;

            for (int j =1; j <= 2; j++){
                System.out.println("Transaksi ke- "+j);
                System.out.print("Masukkan harga: ");
                harga = sc.nextInt();
                total = total + harga;
              
                }
               
                System.out.println("Total: " +total);
               
                
                
            }
           
        } 
    }
    

