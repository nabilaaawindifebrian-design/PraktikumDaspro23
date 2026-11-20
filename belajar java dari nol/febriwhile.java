import java.util.Scanner;
public class febriwhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int angka = 1;
       int total = 0;
    
       while (angka <= 5 ){
        System.out.print("Angka: " +angka);

        if(angka % 2 == 0){
            System.out.println(" Ditambahkan");

        } else {
            System.out.println(" Angka dilewati ");

        }
        angka++;
      
        }
        total = total + angka;
        System.out.println("Total angka genap: " +total);
        
        

       }
    }


