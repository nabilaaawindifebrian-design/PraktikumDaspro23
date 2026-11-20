import java.util.Scanner;
public class febridowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int angka = 1;
        int total = 0;
       
        do{
        
            if (angka % 2 == 0){
                System.out.println("Angka genap: " +angka);
                total = angka + total;

            }
            angka++;
            
        }while(angka <= 10);
       
        System.out.println("jumlah angka genap: " +total);
        
      
       
     
       

    }
}
