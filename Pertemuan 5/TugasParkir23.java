import java.util.Scanner;
public class TugasParkir23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lamaParkir;
        int totalTarif;
        System.out.println("lama parkir");
        lamaParkir = input.nextInt();
        if (lamaParkir <=2){
            System.out.println("Tarif parkir anda adalah: 2000");
        }else{
            totalTarif = 2000 +(lamaParkir-2)*1000;
            System.out.println("Tarif parkir anda adalah: " + totalTarif);
        }
    }
    
}
