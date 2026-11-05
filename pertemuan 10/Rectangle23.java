//(2 + (23 mod 3)= 4, 4 + (23 mod 3))=6
//(5 + (23 mod 3)=7, 2 + (23 mod 3))=4
//4 + (23 mod 4)=7, 6 + (23 mod 4)=9
import java.util.Scanner;
public class Rectangle23 {
    public static void main (String[] args){
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
             for (int j = 1; j <= kolom; j++) {
                System.out.print("#");
        }
        System.out.println();
        }
        sc.close(); 


    }
   
}
